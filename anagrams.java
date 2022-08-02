    import java.util.Arrays;  
       
    public class Main {  
        static void Anagram(String str1, String str2) {  
            String s1 = str1.replaceAll("\\s", "");  
            String s2 = str2.replaceAll("\\s", "");  
            boolean flag = true;  
            if (s1.length() != s2.length()) {  
                flag = false;  
            } else {  
                char[] ArrayS1 = s1.toLowerCase().toCharArray();  
                char[] ArrayS2 = s2.toLowerCase().toCharArray();  
                Arrays.sort(ArrayS1);  
                Arrays.sort(ArrayS2);  
                flag = Arrays.equals(ArrayS1, ArrayS2);  
            }  
            if (flag) {  
                System.out.println(s1 + " and " + s2 + " are anagrams . ");  
            } else {  
                System.out.println(s1 + " and " + s2 + " are not anagrams .");  
            }  
        }  
       
        public static void main(String[] args) {  
            Anagram("Apple","Paple");  
            Anagram("top","pot");  
        }  
    }  
