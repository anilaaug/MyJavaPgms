import java.io.*;
import java.util.Scanner;
public class BinarySearch
{
public static void main(String[] args)
{
//System.out.println("Enter the length of  array");
Scanner s=new Scanner(System.in);
//int n=s.nextInt();
int arr[]={1,2,5,7,8,10,33,66,77,88};
//System.out.println("Ennter the number of elemets in the array");
/*for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}*/
int n=arr.length;
System.out.println("Enter the item to be searched");
int search=s.nextInt();
int first=0;
int last=n-1;
int middle=(first+last)/2;
while(first<=last)
{
if(search<arr[middle])
{
	last=middle-1;
	
	
}
else
{	
	if(arr[middle]==search){
		System.out.println("the item is found in the position= "+middle);break;}
	first=middle+1;	
}
middle=(first+last)/2;	
}
if(first>last)
	System.out.println("the item is not found");
	
}
}
