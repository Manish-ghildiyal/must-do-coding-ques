import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class romanToIntegers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        System.out.println(inte(s1));
    }

    private static int inte(String s) {
        int res=0,s1,s2;
        for (int i = 0; i <s.length() ; i++) {
            s1=value(s.charAt(i));
            if (i+1<s.length()){
                s2=value(s.charAt(i+1));
                if (s1>=s2)
                    res+=s1;
                else {
                    res+=s2-s1;
                    i++;
                }
            }
            else {
                res+=s1;
                i++;
            }
        }
        return res;
    }
    public static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
