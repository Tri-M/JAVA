
import java.io.*;
import java.util.*;

class Main{
    public static boolean Palindrome(String str)
    {
        boolean flag=true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String bigPal="", smallPal="", word="";
        String words[]=new String[50];
        int temp=0;
        int count=0;
        s=s.toLowerCase();
        s=s+ " ";  
          
        for(int i = 0; i < s.length(); i++){  
            if(s.charAt(i) != ' '){  
                word = word + s.charAt(i);  
            }  
            else{  
                words[temp] = word;  
                temp++;  
                word = "";  
            }  
        }  
        for(int i=0;i<temp;i++)
        {
         if(Palindrome(words[i])){  
                count++;  
                if(count == 1)  
                    smallPal = bigPal = words[i];  
            
                else{  
                    if(smallPal.length() > words[i].length())  
                        smallPal = words[i];  
                    if(bigPal.length() < words[i].length())  
                        bigPal = words[i];  
                }  
            }  
        }  
          
        if(count == 0)  
            System.out.println("No palindrome is present in the given string");  
        else{  
            System.out.println("Smallest palindromic word: " + smallPal);  
            System.out.println("Biggest palindromic word: " + bigPal);  
        }  
    }
}

        


