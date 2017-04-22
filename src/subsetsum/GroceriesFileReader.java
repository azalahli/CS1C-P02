package subsetsum;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Mober6 on 4/21/2017.
 */
public class GroceriesFileReader {
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
