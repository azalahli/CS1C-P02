package subsetsum;
import java.util.*;


/**
 * Created by Mober6 on 4/20/2017.
 */
public class SubsetSum {
    private ArrayList<Double> subSets = new ArrayList<Double>();
    private double sum = 0;
    // Sums up a set, and sets sum to the result




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

}
