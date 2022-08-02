import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string  :");
        String str=input.next();
        System.out.println("Enter the character to be searched for :");
        char c=input.next().charAt(0);
        
        int firstIndex = str.indexOf(c);
        System.out.println("occurrence of char "+ " is found at index: "+ firstIndex);

        
        //int lastIndex = str.lastIndexOf(c);
        //System.out.println("Last occurrence of char is"+ lastIndex);

        
       // int first_in = str.indexOf(c, 10);
        //System.out.println("First occurrence of char " + first_in);

        //int last_in = str.lastIndexOf(c, 20);
        //System.out.println("Last occurrence of char "+ last_in);

        
        //int char_at = str.charAt(20);
        //System.out.println("Character at location 20: " + char_at);

        
}
}

