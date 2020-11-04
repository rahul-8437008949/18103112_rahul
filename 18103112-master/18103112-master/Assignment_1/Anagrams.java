import java.util.Scanner;

public class Anagrams {
    public boolean areAnagrams(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        int ch[]= new int[26];
        for(int i=0;i<a.length();i++){
            ch[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            ch[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        if(new Anagrams().areAnagrams(a.toLowerCase(),b.toLowerCase())){
            System.out.println("ANAGRAMS");
        }
        else{
            System.out.println("NOT ANAGRAMS");
        }
    }
}
