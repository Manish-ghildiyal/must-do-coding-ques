import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String unprocessed=s.next();
        String processed="";
        sub(unprocessed,processed);
    }

    private static void sub(String unprocessed, String processed) {
        if (unprocessed.isEmpty()){
            System.out.print(processed+" ");
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for (int i = 0; i <=processed.length() ; i++) {
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            sub(unprocessed,first+ch+second);
        }
    }
}
