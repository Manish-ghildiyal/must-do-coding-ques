import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class K_Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        int k=s.nextInt();
        reverse(ar,k);
        System.out.println(Arrays.toString(ar));
    }

    private static void reverse(int[] ar,int k) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <ar.length ; i++) {
            for (int j = i; j <i+k && j<ar.length ; j++) {
                stack.push(ar[j]);
            }
            for (int j = i; j <i+k && j<ar.length ; j++) {
                ar[j]=stack.pop();
            }
            i+=k-1;
        }
    }

    public static void reverse2(int[] arr,int k){
        for (int i = 0; i < arr.length; i += k)
        {
            int left = i;

            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, arr.length - 1);
            int temp;

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }
    }
}
