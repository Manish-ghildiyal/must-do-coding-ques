import java.util.Arrays;
import java.util.Scanner;

public class rearrange_array_alternatively {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=s.nextInt();
        }
        subarray(ar);
    }

    private static void subarray(int[] ar) {
        for (int i = 0; i <ar.length ; i++) {
            if (i%2==0){
                int max=max(ar,i,ar.length);
                swap(ar,ar,i,max);
            }
            else {
                int min=min(ar,i,ar.length);
                swap(ar,ar,i,min);
            }
        }
        System.out.println(Arrays.toString(ar));
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
    public static int max(int[] ar,int i, int j){
        int index=i;
        for (int k = i+1; k <j ; k++) {
            if (ar[index]<ar[k]) {
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

    //for sorted
    static void rearrange(int[] arr, int n)
    {
        // Auxiliary array to hold modified array
        int temp[] = new int[n];

        // Indexes of smallest and largest elements
        // from remaining array.
        int small=0, large=n-1;

        // To indicate whether we need to copy rmaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i=0; i<n; i++)
        {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }

        // Copy temp[] to arr[]
        arr = temp.clone();
    }
}
