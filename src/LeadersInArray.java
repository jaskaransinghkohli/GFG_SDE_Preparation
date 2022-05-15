/**
 Write a program to print all the LEADERS in the array. An element is leader if it
 is greater than all the elements to its right side. And the rightmost element is always a leader.
 For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 Let the input array be arr[] and size of the array be size.
 */

public class LeadersInArray {
    void printLeaders(int [] arr, int size){
       for(int i=0;i<size;i++){
           int j;
           for( j=i+1; j<size;j++)
           {
               if ( arr[i] <= arr[j])
                   break;
           }

           if(j == size)
           {
               System.out.print(arr[i] + " ");
           }
       }
    }
    public static void main(String[] args) {
        LeadersInArray l = new LeadersInArray();
        int arr[] = new int[]{22,1322,11,23,23,10};
        int n = arr.length;
        l.printLeaders(arr,n);

    }
}
