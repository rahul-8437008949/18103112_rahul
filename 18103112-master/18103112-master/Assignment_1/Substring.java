import java.util.Scanner;

public class Substring {
    public int countSubstring(String a,String b){
    int l1=a.length();
	     int l2=b.length();
	     int ch[]=new int[26];
	     for(int i=0;i<l2;i++)
	     ch[b.charAt(i)-'a']++;
	     int count=0;
	     for(int i=0;i<=(l1-l2);i++)
	     {
	         int ch2[]=new int[26];
	         for(int j=0;j<l2;j++)
	         ch2[a.charAt(i+j)-'a']++;
	         
	         if(Arrays.toString(ch).equals(Arrays.toString(ch2)))
	         count++;
	         
	        
	     }
	     return count;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strings and its substring: ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println("Count: "+new Substring().countSubstring(a,b));
    }
}
