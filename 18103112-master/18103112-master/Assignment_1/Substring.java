import java.util.Scanner;

public class Substring {
    public int countSubstring(String a,String b){
        if(b.length()==0 || a.length()==0){
            return 0;
        }
        int count = 0;
        int ch[] = new int[256];
        for(int i=0;i<a.length();i++){
            ch[a.charAt(i)]++;
        }
        boolean flag=true;
        while(flag){
            for(int i=0;i<b.length();i++){
                if(ch[b.charAt(i)]==0){
                    flag = false;
                    break;
                }
                ch[b.charAt(i)]--;
            }
            count++;
        }
        return count-1;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the strings and its substring: ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println("Count: "+new Substring().countSubstring(a,b));
    }
}
