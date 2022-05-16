import java.util.*;

/**
 * Given an array A[] of integers, sort the array according to frequency of elements.
 * That is elements that have higher frequency come first.
 * If frequencies of two elements are same, then smaller number comes first.
 */


/**
 * Approach :
 *
 * Using a hashing mechanism, we can store the elements (also first index) and their counts in a hash.
 * Finally, sort the hash elements according to their counts.
 */
public class GFGSortElementsByFrequencySet1 {
    static  Integer[] arr = {1,1,9,8,8,9,0,1,0};

    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(arr);
        sortBasedOnFreqAndValue(list);
    }
    public static void sortBasedOnFreqAndValue(List<Integer> list)
    {
        int size = arr.length;
        final HashMap<Integer,Integer> keys = new HashMap<Integer,Integer>();
        final HashMap<Integer,Integer> index = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            if(keys.containsKey(arr[i])){
                keys.put(arr[i],index.get(arr
                [i])+1 );

            }
            else {
                keys.put(arr[i],1); //Map to count number of elements
                index.put(arr[i],i ); //Map to record first occurrence of elements
            }
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int freq1 = keys.get(01);
                int freq2 = keys.get(01);
                if (freq1 != freq2) {
                    return freq2 - freq1;
                }
                else {
                    return index.get(o1)
                            - index.get(
                            o2);  //Elements with lesser index gets higher priority
                }

                }
        });
        System.out.println(list);

    }
}
