import java.util.*;


public class run_LinkedList {
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();
        int[] array = {1,3,5,7,9,11};
        for(int i =0; i <6; i++){
            ll.add(i, array[i]);
        }
        System.out.println("Linked list before change is: "+ ll.toString());
        addAndSort(ll, 8);
        System.out.println("Linked list after change is: "+ll.toString());

        System.out.println("Linked List before swap: "+ll.toString());
        swapValue(ll,1,3);
        System.out.println("Linked list after swap: "+ll.toString());
        
        //creates instance of Random class
        Random rand = new Random();

        //Generate random integers in range 1000 - 9999, 500 times

        LinkedList newList = new LinkedList<Integer>();
        for (int i = 0; i<500; i++){
            int rand_int = rand.nextInt(1000,9999);
            newList.add(i,rand_int);
        }

        //Generate another 1 random value to search in Linked List

        int searchValue = rand.nextInt(1000,9999);
        int returnValue = findValue(newList,searchValue);
        System.out.println("The value being searched for is "+searchValue);
        System.out.println("The returned index is "+returnValue);
    
    }


    public static void addAndSort(LinkedList<Integer> list, int value){
        for(int i = 0; i < list.size(); i++){
            if (value<=list.get(i)){
                list.add(i,value);
                break;
            }
            else if(value>list.getLast()){
                list.add(value);
                break;
            }


        }

    }

    public static void swapValue(LinkedList<Integer> list, int firstIndex, int secondIndex){
        int temp = list.get(firstIndex);
        int temp2 = list.get(secondIndex);
        list.remove(firstIndex);
        list.add(firstIndex, temp2);
        list.remove(secondIndex);
        list.add(secondIndex,temp);

    }

    public static int findValue(LinkedList<Integer> list, int searchVal){
        for(int i = 0; i<list.size();i++){
            if (searchVal == list.get(i)){
                return i;
                
            }
        
        }
        return -1;
    }
}
