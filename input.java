import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name :");
        String name = obj.nextLine();
        System.out.println(name);
        System.out.println("Enter country code :");
        String cc = obj.nextLine();
        System.out.println(cc);
        System.out.println("isdcode :");
        String isdc = obj.nextLine();
        System.out.println(isdc);
        System.out.println("Enter a :");
        int a = obj.nextInt();
        System.out.println(a);


    }
}
