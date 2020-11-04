import java.util.*;

public class LargerThanInt {
    public void sum(){
        long sum = 0;
        for(int i=1;i<Integer.MAX_VALUE;i++){
            sum=sum+i;
            if(i*i==sum){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        new LargerThanInt().sum();
    }
}
