package subsetsum;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Parses a file for numbers to cast to double, and then add them to an arraylist
 * @author Myron Pow 4/21/2017
 */
public class GroceriesFileReader {
    /**
     * @param location is path of file to parse
     * @return arraylist that contains doubles
     */
    public ArrayList<Double> readFile(String location){
        ArrayList<Double> shopInventory = new ArrayList<Double>();
        final String delimiter = ",";
        try{
            Scanner input = new Scanner(new File(location));

            while(input.hasNext()) {
                String groceries = input.next();

                String[] entries = groceries.split(delimiter);
                shopInventory.add(Double.parseDouble(entries[1]));
            }
        }
        catch (FileNotFoundException error){
            error.printStackTrace();
        }

        return shopInventory;
    }

}
