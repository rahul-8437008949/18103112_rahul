import java.util.*;

public class Compare {
    public int lexographically(String s1,String s2){
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return (int)s1.charAt(i)-(int)s2.charAt(i);
            }
        }
        if(s1.length()!=s2.length()){
            return s1.length()-s2.length();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings: ");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.println(new Compare().lexographically(s1.toLowerCase(),s2.toLowerCase()));
    }
}
