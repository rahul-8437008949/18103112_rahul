import java.util.Scanner;

public class Replace {
    public String replaceWords(String par,String words[]){
        if(words.length==0 || par.length()==0) {
            return par;
        }
        for(String word:words){
            StringBuilder sub=new StringBuilder();
            sub.append(word.charAt(0));
            for(int i=1;i<word.length();i++){
                sub.append('*');
            }
            par=par.replaceAll(word, String.valueOf(sub));
        }
        return par;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String par = scan.nextLine();
        System.out.println("Enter number of words to replace: ");
        int n = scan.nextInt();
        scan.nextLine();
        String[] words = new String[n];
        System.out.println("Enter the words: ");
        for(int i=0;i<n;++i){
            words[i] = scan.nextLine();
        }
        System.out.println(new Replace().replaceWords(par,words));
    }
}
