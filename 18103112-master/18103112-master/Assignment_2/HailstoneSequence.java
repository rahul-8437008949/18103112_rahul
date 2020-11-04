import java.util.*;

public class HailstoneSequence {
    public void sequence(int n){
        if(n <= 0 || n>Integer.MAX_VALUE) {
            throw new IllegalArgumentException("n should be a positive integer and less than Integer.MAX_VALUE");
        }
        System.out.print(n + " ");
        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.print(n + " ");
            }
            else{
                n=3*n+1;
                System.out.print(n + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        new HailstoneSequence().sequence(n);
    }
}
