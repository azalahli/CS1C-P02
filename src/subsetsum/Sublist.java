package subsetsum;
import sun.plugin.liveconnect.OriginNotAllowedException;

import java.util.*;
/**
 * Created by Mober6 on 4/20/2017.
 * Based on file under "A Plan For the Algorithm",
 * with the notable exception that int -> double
 */
class Sublist implements Cloneable
{
    private double sum = 0;
    private ArrayList<Double> originalObjects;
    private ArrayList<Integer> indices;

    // constructor creates an empty Sublist (no indices)
    public Sublist(ArrayList<Double> orig)
    {
        sum = 0;
        originalObjects = orig;
        indices = new ArrayList<Integer>();
    }

    double getSum()
    { return sum; }

    // I have done the clone() for you, since you will need clone() inside addItem().
    public Object clone() throws CloneNotSupportedException
    {
        // shallow copy
        Sublist newObject = (Sublist)super.clone();
        // deep copy
        newObject.indices = (ArrayList<Integer>)indices.clone();

        return newObject;
    }

    Sublist addItem( int indexOfItemToAdd) throws CloneNotSupportedException{
        Sublist subset = (Sublist)clone();
        subset.indices.add(indexOfItemToAdd);
        subset.sum += originalObjects.get(indexOfItemToAdd);
        return subset;
    }

    void showSublist(){
        for (int i  = 0; i < indices.size(); i++){
            System.out.println("Set desired:" + originalObjects.get((indices.get(i))));
        }
    }

    public ArrayList<Double> generateSubSet(){
        ArrayList<Double> newSubSet = new ArrayList<Double>();
        for(int i = 0; i < indices.size(); i++){
            newSubSet.add(originalObjects.get(indices.get(i)));
        }
        return newSubSet;
    }
};