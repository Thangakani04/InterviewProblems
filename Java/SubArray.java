package InterviewProblems;

import java.util.*;

public class SubArray {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int[] arr={23,2,6,4,7};
      int k =6;
     boolean ans= goodSubArray(arr,k);
     System.out.println(ans);
    }
    public static boolean goodSubArray(int[] arr, int k){
      
      for(int i=0;i<arr.length;i++){
        int sum=arr[i];
        for(int j=i+1;j<arr.length;j++){
          sum =sum +arr[j];
          if(sum==k){
            return true;
          }
        }
      }
      return false;
    }
}