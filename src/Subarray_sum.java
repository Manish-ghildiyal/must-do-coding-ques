import java.util.Scanner;

public class Subarray_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i]=s.nextInt();
        }
        int k=s.nextInt();
        subarr(ar,k);
    }

    private static void subarray(int[] ar, int k) {
        int sum=0;
        int p=0;
        for (int i = 0; i <ar.length ; i++) {
            sum=0;
            for (int j = i; j <ar.length ; j++) {
                //p=j;
                if (sum>=k) {
                    break;
                }
                p=j;
                sum+=ar[j];
            }
            if (sum==k) {
                System.out.println("sum exists from index "+i+ " to "+(p));
            }
        }
    }

    public static void subarr(int[] ar,int k){
        int sum=0;
        int p=0,i;
        for ( i = 0; i <ar.length ; i++) {
            if (sum==k){
                System.out.println("the sum is from index "+p+" to "+(i-1));
                //break;
            }
            sum+=ar[i];
            if (sum>k){
                sum-=ar[p];
                p++;
            }
        }
        if(sum==k)
            System.out.println("the sum is from index " +p+ " to "+(i-1));
    }
}
