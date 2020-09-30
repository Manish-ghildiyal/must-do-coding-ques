import java.util.Scanner;

public class prac
{
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int ar[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            ar[i]=s.nextInt();
//        }
//        //int k=s.nextInt();
//        subarray(ar);
        double d=5;
        System.out.println(d);
    }

    private static void subarray(int[] ar) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for (int i = 0; i <ar.length ; i++) {
            max_ending_here+=ar[i];
            if (max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if (max_ending_here<0)
                max_ending_here=0;
        }
        System.out.println(max_so_far);
    }
}
