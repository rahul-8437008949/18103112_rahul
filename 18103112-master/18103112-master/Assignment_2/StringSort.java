import java.util.*;

public class StringSort {
   public String sort(String s){
        int n=s.length();
        char[] chars=s.toCharArray();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(chars[j]>chars[j+1]){
                    char temp=chars[j+1];
                    chars[j+1]=chars[j];
                    chars[j]=temp;
                }
            }
        }
        String str=new String(chars);
        
        
        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.nextLine();
        System.out.println(new StringSort().sort(s));
    }
}
