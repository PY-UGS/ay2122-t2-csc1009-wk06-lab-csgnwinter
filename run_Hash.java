import java.io.*;
import java.util.*;


public class run_Hash {
    public static void main(String[] args) {
        //declaring hash table
        Hashtable<Integer, Integer> ht1 = new Hashtable<>();
        
        //declaring array full of integers
        //adding the integers in array into hashmap
        //the key represents the index and values are the integers in array
        int[] array = {1,3,5,7,9,11};
        for(int i =0; i <array.length; i++){
            ht1.put(i,array[i]);
        }
        System.out.println();
        System.out.println("Hashtable before change is "+ht1);
        System.out.println("Adding the value 8...");
        addAndSort(ht1,8);
        System.out.println("Hashtable after change is "+ht1);
        System.out.println();

        System.out.println("Hashtable before swap: "+ht1);
        System.out.println("Swapping values at index 1 and 3");
        swapValue(ht1,1,3);
        System.out.println("Hashtable after swap: "+ht1);
        System.out.println();

    

        //creates instance of Random class
        Random rand = new Random();

        //generate random integers from 1000 to 9999 into hashtable
        Hashtable newHash = new Hashtable<Integer, Integer>();
        for(int i = 0; i<500; i++){
            int rand_int = rand.nextInt(1000,9999);
            newHash.put(i,rand_int);
        }

        //generate one other random search value
        int searchValue = rand.nextInt(1000,9999);
        int returnValue = findValue(newHash, searchValue);
        System.out.println("The value to search is "+ searchValue);
        System.out.println("The returned index is "+returnValue);

    }

    public static void addAndSort(Hashtable<Integer, Integer> hash, int newValue) {
        int tempValue = -1;
        boolean added = false;
        for(int i = 0; i < hash.size()+1; i++) {
            if(added) {
                if(i == hash.size()) {
                    hash.put(i, tempValue);
                    break;
                } else {
                    int tempValue2 = hash.get(i);
                    hash.replace(i, tempValue);
                    tempValue = tempValue2;
                }
            }
            else if(newValue < hash.get(i)) {
                tempValue = hash.get(i);
                added = true;
                hash.replace(i, newValue);
            }
        }
        
    }

    public static void swapValue(Hashtable<Integer, Integer> hash, int firstKey, int secondKey){
        int temp = hash.get(firstKey);
        int temp2 = hash.get(secondKey);

        hash.replace(firstKey, temp2);
        hash.replace(secondKey, temp);


    }

    public static int findValue(Hashtable<Integer, Integer> hash, int searchVal){
        for(int i = 0; i<hash.size();i++){
            if (searchVal == hash.get(i)){
                return i;
            }

        }
        return -1;
    }
}
