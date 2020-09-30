import java.util.Arrays;
import java.util.Scanner;

public class sortArraysof012 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }

    private static void sort(int[] ar) {
        int counter1=0,counter2=0,counter3=0;
        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]==0)
                counter1++;
            else if (ar[i]==1)
                counter2++;
            else counter3++;
        }
        for (int i = 0; i <ar.length ; i++) {
            if (counter1>0){
                ar[i]=0;
                counter1--;
            }
            else if (counter2>0){
                ar[i]=1;
                counter2--;
            }
            else ar[i]=2;
        }
    }
}
