    import java.util.*;
    
    public class Main 
    {  
         public static void main(String[] args) {  
            Scanner input=new Scanner(System.in);
            String str = input.nextLine();
            int[] freq = new int[str.length()];  
            int i, j;  
            char s[] = str.toCharArray();  
              
            for(i = 0; i <str.length(); i++) {  
                freq[i] = 1;  
                for(j = i+1; j <str.length(); j++) {  
                    if(s[i] == s[j]) {  
                        freq[i]++;  
                        s[j] = '0';  
                    }  
                }  
            }  
              
            
            System.out.println("frequency table");  
            for(i = 0; i <freq.length; i++) {  
                if(s[i] != ' ' && s[i] != '0')  
                    System.out.println(s[i] + "-" + freq[i]);  
            }  
        }  
    }  
