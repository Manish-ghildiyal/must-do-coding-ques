import java.util.Arrays;
import java.util.Scanner;

public class KthMinimum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        int k=s.nextInt();
        quicksort(ar,k,0,ar.length-1);
        System.out.println(ar[k-1]);
    }

    private static void quicksort(int[] ar, int k,int p,int q) {
        if (p<q){
            int mid=partition(ar,p,q);
            quicksort(ar,k,p,mid-1);
            quicksort(ar,k,mid+1,q);
        }
    }
    private static int partition(int[] ar,int p,int q){
        int i=p,x=ar[p];
        for (int j = p+1; j <=q ; j++) {
            if (x>=ar[j]){
                i++;
                swap(ar,i,j);
            }
        }
        swap(ar,i,p);
        return i;
    }
    public static void swap(int ar1[],int i,int j){
        int temp=ar1[i];
        ar1[i]=ar1[j];
        ar1[j]=temp;
    }
}
