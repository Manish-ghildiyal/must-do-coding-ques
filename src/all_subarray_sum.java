import java.util.Scanner;

public class all_subarray_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=s.nextInt();
        }
        int sum=subarray(ar);
        System.out.println(sum);
    }

    private static int subarray(int[] ar) {
        int sum=0;
        for (int i = 0; i <ar.length ; i++) {
            int temp=0;
            for (int j = i; j <ar.length ; j++) {
                temp+=ar[j];
                sum+=temp;
            }
        }
        return sum;
    }

    public static long SubArraySum( int arr[] , int n )
    {
        long result = 0;
        for (int i=0; i<n; i++)
            result += (arr[i] * (i+1) * (n-i));
        return result ;
    }
}
