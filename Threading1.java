import java.lang.*;
import java.sql.SQLOutput;

class Thread1 extends Thread{
    int[] arr={1,2,3,5,6,7};
    int sum=0;
    float avg;
    public void run(){
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        avg=(float)sum/arr.length;
        System.out.println("Average :"+avg);
    }
}
class Thread2 extends Thread{
    int arr[]={1,2,3,4,5,6,7};
    int max=0;
   public void run(){
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max) {
               max = arr[i];
           }
       }
       System.out.println("The max value is "+max);
   }
}
class Thread3 extends Thread{
    int arr[]={3,54,1,3,45};
    int min=100000;
    public void run(){
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The minimum value is  "+min);
    }

}


public class Threading {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        t1.start();
        Thread2 t2=new Thread2();
        t2.start();
        Thread3 t3=new Thread3();
        t3.start();
    }
}
