import java.util.Scanner;

public class numer_of_pairs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        int[] ar1=new int[n2];
        for (int i = 0; i <n2 ; i++) {
            ar1[i]=s.nextInt();
        }
        System.out.println(check(ar,ar1));
    }

    private static int check(int[] ar1, int[] ar2) {
        int count=0;
        int x=0,y=0;
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j < ar2.length; j++) {
                x=(int)Math.pow(ar1[i],ar2[j]);
                y=(int)Math.pow(ar2[j],ar1[i]);
                if (x>y)
                    count++;
            }
        }
        return count;
    }
}
