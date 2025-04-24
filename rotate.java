import java.util.*;
public class numms{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n;
        int r;
        System.out.println("enter the size:");
        n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the rotation number:");
        r=sc.nextInt();
        r=r%n;
        if(r!=0){
        rotate(arr,r);
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
   static void rotate(int [] arr,int r){
       int i=0,j=r-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       i=r;j=arr.length-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       i=0;j=arr.length-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
       
       
   }
}
