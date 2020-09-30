import java.util.Arrays;
import java.util.Scanner;

public class merge_sorted_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        int n2=s.nextInt();
        int[] ar1=new int[n2];
        for (int i = 0; i <n2 ; i++) {
            ar1[i]=s.nextInt();
        }
        merge2(ar,ar1);
    }

    private static void merge(int[] ar1, int[] ar2) {
        int[] ar=new int[ar1.length+ar2.length];
        int k=0,i=0,j=0;
        while (i<ar1.length && j<ar2.length){
            if (ar1[i]>ar2[j])
                ar[k++]=ar2[j++];
            else ar[k++]=ar1[i++];
        }
        while (i<ar1.length)
            ar[k++]=ar1[i++];
        while (j<ar2.length)
            ar[k++]=ar2[j++];
        System.out.println(Arrays.toString(ar));
    }

    public static void merge2(int[] ar1,int[] ar2){
        for (int i = 0; i <ar1.length+ar2.length ; i++) {
            if (i<ar1.length){
                int min1=min(ar1,i,ar1.length);
                int min2=min(ar2,0,ar2.length);
                if (ar1[min1]<=ar2[min2]){
                    swap(ar1,ar1,i,min1);
                }
                else swap(ar1,ar2,i,min2);
            }
            else {
                int min1=min(ar2,i-ar1.length,ar2.length);
                swap(ar2,ar2,i-ar1.length,min1);
            }
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
    }
    public static int min(int[] ar,int i, int j){
        int index=i;
        for (int k = i+1; k <j ; k++) {
            if (ar[index]>ar[k]) {
                index=k;
            }
        }
        return index;
    }
    public static void swap(int ar1[],int ar2[],int i,int j){
        int temp=ar1[i];
        ar1[i]=ar2[j];
        ar2[j]=temp;
    }
}
