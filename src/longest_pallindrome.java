import java.util.HashSet;
import java.util.Scanner;

public class longest_pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        HashSet<String> hashSet=new HashSet<>();
        sub(s1,hashSet);
        System.out.println(hashSet);
        System.out.println(pallindrome(hashSet));
    }

    private static String pallindrome(HashSet<String> hashSet) {
        int max=Integer.MIN_VALUE;
        int flag=-1;
        String s1="";
        for (String s:hashSet) {
            flag=-1;
            for (int i = 0; i <s.length()/2 ; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    flag = 0;
                    break;
                }
            }
            if (flag==-1){
                if (s.length()>max){
                        max=s.length();
                        s1=s;
                }
            }
        }
        return s1;
    }

    private static void sub(String s,HashSet<String> hashSet) {
        for (int i = 0; i < s.length(); i++)
            for (int j = i+1; j <= s.length(); j++)
                hashSet.add(s.substring(i, j));
    }
}

