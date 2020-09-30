import java.util.Scanner;

public class missing_element {
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
        int sum1=((ar.length+1)*(ar.length+2))/2;
        int sum2=0;
        for (int i = 0; i <ar.length ; i++) {
            sum2+=ar[i];
        }
        return sum1-sum2;
    }
}
