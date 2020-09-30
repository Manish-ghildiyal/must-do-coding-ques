import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String unprocessed=s.next();
        String processed="";
        sub(unprocessed,processed);
    }

    private static void sub(String unprocessed, String processed) {
        if (unprocessed.isEmpty()){
            if (!processed.isEmpty())
                System.out.print(processed+"/");
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        sub(unprocessed,processed);
        sub(unprocessed,processed+ch);
    }
}
