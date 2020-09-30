import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        System.out.println(check(s1,s2));
    }

    private static String check(String s1, String s2) {
        if (s1.length()!=s2.length())
            return "No";
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
            if (!map1.containsKey(s1.charAt(i)))
                map1.put(s1.charAt(i),1);
            else {
                int m=map1.get(s1.charAt(i));
                map1.put(s1.charAt(i),m+1);
            }
        }
        for (int i = 0; i <s2.length() ; i++) {
            if (!map2.containsKey(s2.charAt(i)))
                map2.put(s2.charAt(i),1);
            else {
                int m=map2.get(s2.charAt(i));
                map2.put(s2.charAt(i),m+1);
            }
        }
//        System.out.println(map1);
//        System.out.println(map2);
        for (Map.Entry<Character, Integer> me : map1.entrySet()) {
            Character s=me.getKey();
            if (!me.getValue().equals(map2.get(s)))
                return "No";
        }
        return "Yes";
    }
}
