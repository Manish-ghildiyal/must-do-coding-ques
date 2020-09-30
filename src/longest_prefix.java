import java.util.Scanner;

public class longest_prefix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            String[] strings=new String[n];
            for (int j = 0; j < n; j++) {
                strings[j]=s.next();
            }
            String s1=prefix(strings);
            if (s1.equals(""))
                System.out.println("-1");
            else System.out.println(s1);
        }
    }

    private static String prefix(String[] strings) {
        StringBuilder s=new StringBuilder();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()<min)
                min=strings[i].length();
        }
        for (int i = 0; i <min; i++) {
            for (int j = 0; j <strings.length-1 ; j++) {
                if (strings[j].charAt(i)!=strings[j+1].charAt(i))
                    return s.toString();
            }
            s.append(strings[0].charAt(i));
        }
        return s.toString();
    }
}
