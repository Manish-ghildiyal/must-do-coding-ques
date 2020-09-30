import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leaders {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(leader(ar));
    }

    private static List<Integer> leader(int[] ar) {
        List<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = ar.length-1; i >=0 ; i--) {
            if (ar[i]>max){
                max=ar[i];
                list.add(max);
            }
        }
        return list;
    }
}
