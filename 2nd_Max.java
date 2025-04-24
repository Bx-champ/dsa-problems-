import java.util.*;
public class max{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int n;
        System.out.println("enter the size of array:");
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int max2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else{
                if(arr[i]>max2 && arr[i]<max)
                max2=arr[i];
            }
        }
        System.out.println(max+""+max2);
        
    }
}
