package GreedyAlgorithm;
import java.io.*;
//import java.lang.*;
import java.util.*;

public class ActivitySelectionProblem {
    public static void activitySelection(int[] si,int[] fi,int n){
        int i,j;
        System.out.print("Following Activity are selected : ");
        i=0;
        System.out.print(i +" ");
        for (j=1;j<n;j++){
            if (si[j] >= fi[i]){
                System.out.print(j + " ");
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        int[] si = {1,3,0,5,8,5};
        int[] fi = {2,4,6,7,9,9};
        int n = si.length;
        activitySelection(si,fi,n);
    }
}
