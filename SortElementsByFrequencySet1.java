/**
 Not from GFG
 Sort array based on frequency of value (If frequency is same then sort per occurrence)
 */

import java.util.*;

public class SortElementsByFrequencySet1 {
    public static List<Integer> sortBasedOnFreqndValue(List<Integer> list){
        //Creating a map because we know that our key (numbers) will be integer and our value ( frequency) will be int too
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<list.size();i++){

            //Putting all the values of the list into map
            //It will calculate the freq of each number and then it will put in map
            //getOrDefault is used to get the value. Here it say sif the value is not available then the default will be 0
            //If value is present we will fetch the value and add +1 to it
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        //Sorting the list based on map frequency. n1 and n2 are the elements of the list
        Collections.sort(list,(n1,n2) ->{
            int freq1 = map.get(n1);
            int freq2 = map.get(n2);
            if(freq1 != freq2){
                //If ferq is not same we will sort according to their freq. 2-1 one means the highest freq will be the first ele
                return freq2 - freq1;
            }
            //If freq is same then we will sort according to their value
            return n1-n2;
        });
        return list;
    }

    public static void main(String[] args) {
        //writing Integer instead of int as we are casting
        Integer[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(SortElementsByFrequencySet1.sortBasedOnFreqndValue(list));

    }

}
