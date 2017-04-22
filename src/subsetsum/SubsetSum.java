package subsetsum;
import java.util.*;


/**
 * Subset sum finder for an all positive set
 * @author Myron Pow
 */
public class SubsetSum {
    private static ArrayList<Sublist> masterSet = new ArrayList<Sublist>();
    private static ArrayList<Double> targetSet;

    /**
     *
     * @param shoppingList is a list of purchasable items, inside an arraylist
     * @param budget is a double, which is how much money you have to spend
     * @return is the set that is closest to the budget
     */
    public static ArrayList<Double> findSubset(ArrayList<Double> shoppingList, double budget){
        Sublist initialSublist = new Sublist(shoppingList);
        masterSet.add(initialSublist);

        for(int i = 0; i < shoppingList.size(); i++){
            for (int j = 0; j < masterSet.size() - j; j++){
                Sublist tempSublist = masterSet.get(j);
                double sumOfSet = tempSublist.getSum() + shoppingList.get(i);

                if(sumOfSet == budget){
                    try{
                        masterSet.add(tempSublist.addItem(i));
                    }
                    catch (CloneNotSupportedException error) {
                        error.printStackTrace();
                    }
                    break;
                }
                if(sumOfSet < budget){
                    try{
                        masterSet.add(tempSublist.addItem(i));
                    }
                    catch (CloneNotSupportedException error) {
                        error.printStackTrace();
                    }
                }
            }
        }

        double closestSum = masterSet.get(0).getSum();
        int closestIndex = 0;



        for(int i = 0; i < masterSet.size(); i++){
            if (masterSet.get(i).getSum() > closestSum){
                closestSum = masterSet.get(i).getSum();
                closestIndex = i;
            }
        }

        /* Set is/was outputting set target - first element
        System.out.println("hi" + closestSum);
        System.out.println("m2" + closestIndex);
        */
        targetSet = masterSet.get(closestIndex).generateSubSet();
        return targetSet;
    }


    /**
     * Initial work towards subset sum problem
     */
    /*
    public void sumSet(){
        double sumOfSet =0;
        for(int i = 1; i < subSets.size(); i++){
            sumOfSet += subSets.get(i);
        }
        sum = sumOfSet;
    }

    public boolean isSubsetSum(double budget){
        double setSum = 0;
        boolean result;
        for() {
            for (double value : subSets) {
                setSum += value;
            }
            if (setSum > budget) {
                result = false;
            }
        }
    }
    */

}
