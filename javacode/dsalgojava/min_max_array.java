package javacode.dsalgojava;
//import java.util.Arrays;

public class min_max_array
{

   public   static int    max( int arr[]){
   // int max=Integer.MAX_VALUE;
   int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>=max)
        {
            max=arr[i];

        }
    }

    return max;

   }

   public static int min(int arr[])
   {
    //int min=Integer.MIN_VALUE;
    int min= arr[0];
    for(int i=0;i<arr.length;i++)
    {
            if(arr[i]<min)
            {
                min=arr[i];
            }

    }
    return min;
   }
       
    public static void main(String[] args)
    {

        int  nums[]= {54,563,344,355,3};
        System.out.println("max of array   "+max(nums));
        System.out.println("min of the array  " + min(nums));

    }


}


/*  this above method used o(n) time O(1) space complexity  */

/*
by using the Arrays.sort(name of the aray);
first element in min and last element is max;

import java.util.Arrays;
(or else)
use 
import java.io.*;
import java.util.*;

this will use o(logn) and o(1) space complexity 
 */