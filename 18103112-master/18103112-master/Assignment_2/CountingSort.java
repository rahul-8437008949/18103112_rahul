import java.util.*;

public class CountingSort {
    public void sort(int arr[],int n){
        int count[]=new int[21];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<=20;i++){
            if(count[i]!=0){
                while(count[i]!=0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements you want to enter: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        new CountingSort().sort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
