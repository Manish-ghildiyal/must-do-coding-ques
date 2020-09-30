import java.util.Arrays;
import java.util.Scanner;

public class zig_zag_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        zigzag(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void zigzag(int[] ar) {
        for (int i = 0; i <ar.length-1 ; i++) {
            if (i%2==0){
                if (ar[i]>ar[i+1])
                    swap(ar,i,i+1);
            }
            else {
                if (ar[i]<ar[i+1])
                    swap(ar,i,i+1);
            }
        }
    }
    public static void swap(int ar1[],int i,int j){
        int temp=ar1[i];
        ar1[i]=ar1[j];
        ar1[j]=temp;
    }
}
