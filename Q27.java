//27.Write a program to find the smallest and greatest number present in the array of integer type.

import java.util.*;

public class Q27{
public static void main(String args[]){
int i,n,large,small;
Scanner sc=new Scanner(System.in); //used to read from keyboard

System.out.println("Enter number of elements");
n=sc.nextInt();
int arr[]=new int[n];

System.out.println("Enter elements of Array");
for(i=0;i<n;++i)
arr[i]=sc.nextInt();

large=small=arr[0];
for(i=1;i<n;++i)
{
if(arr[i]>large)
large=arr[i];
if(arr[i]<small)
small=arr[i];
}

System.out.println("Smallest Element is "+small);
System.out.println("Largest Element is "+large);
}
}