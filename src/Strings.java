import java.util.Scanner;
import java.util.Arrays;

public class Strings {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        setOfSubstring();
    }

    public void checkAnagram(){
        System.out.println("enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("the strings are not anagram");
        }
        else{
            char string1[]=str1.toCharArray();
            char string2[]=str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1,string2)==true){
                System.out.println("the strings are anagrams");
            }
            else{
                System.out.println("The strings are not anagram");
            }
        }
    }

    static void divideStrings(){
        int temp=0;
        
        System.out.println("enter your string:");
        String str=sc.next();
        int len=str.length();
        System.out.println("How many parts do u want to divide this string into?");
        int n=sc.nextInt();
        String substrings[]=new String[n];
        int chars=len/n;

        if(len%n!=0){
            System.out.println("String cannot be divided properly");
        }
        else{
            for(int i=0;i<str.length();i=i+chars){
                String substring=str.substring(i, i+chars);
                substrings[temp]=substring;
                temp++;
            }
        }

        for(int i=0;i<substrings.length;i++){
            System.out.println(substrings[i]);
        }




    }
    static void setOfSubstring(){
        System.out.println("enter string:");
        String str=sc.nextLine();
        int len=str.length();
        int k=0, n=len*(len+1)/2;
        String[] substr=new String[n];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                substr[k]=str.substring(i, j);
                k++;
            }
        }
        System.out.println("subsests are--");
        for(int i=0;i<substr.length;i++){
            System.out.println(substr[i]);
        }
    }
}
