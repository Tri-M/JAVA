import java.util.*;
public class Exception {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=sc.nextInt();
        int[] ar = new int[100];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {

            ar[i]=sc.nextInt();

            try{
                    if (ar[i] > 100)
                        throw new ArrayIndexOutOfBoundsException();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array elements out of range");
            }
        }
            for(int i=0;i<n;i++){
                System.out.println(ar[i]);
            }

    }
}
