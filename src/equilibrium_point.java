import java.util.Scanner;

public class equilibrium_point {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int ar[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(equi(ar));
    }

    private static int sort(int[] ar) {
        int mid=ar.length/2;
        int s1=0,s2=0,i=0,j=ar.length-1;
        if (ar.length==1)
            return 1;
        while (mid>i || mid<j){
            if (i<mid){
                s1+=ar[i];
                i++;
            }
            if (mid<j){
                s2+=ar[j];
                j--;
            }
        }
        if (s1==s2){
            return mid;
        }
        else if(s1>s2){
            while (mid!=0) {
                s2 += ar[mid];
                mid--;
                s1 -= ar[mid];
                if (s1 == s2)
                    return mid;
                else if (s1<s2)
                    return -1;
            }
        }
        else {
            while (mid!=ar.length-1){
                s1+=ar[mid];
                mid++;
                s2-=ar[mid];
                if (s1==s2)
                    return mid;
                else if (s1>s2)
                    return -1;
            }
        }
        return -1;
    }

    public static int equi(int[] ar){
        int rs=0,ls=0;
        for (int i = 0; i <ar.length ; i++) {
            rs+=ar[i];
        }
        for (int i = 0; i <ar.length ; i++) {
            rs-=ar[i];
            if (rs==ls)
                return i;
            ls+=ar[i];
        }
        return -1;
    }
}
