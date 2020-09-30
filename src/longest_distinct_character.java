import java.util.LinkedHashSet;
import java.util.Scanner;

public class longest_distinct_character {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        System.out.println(inte(s1));
    }

    private static int inte(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        int max=0;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                count++;
            }
            else if (set.contains(s.charAt(i)) && set.iterator().next()==s.charAt(i)){
                set.remove(s.charAt(i));
                set.add(s.charAt(i));
            }
            else {
                set.clear();
                set.add(s.charAt(i));
                if (max<count){
                    max=count;
                }
                count=1;
            }
        }
        if (max<count)
            max=count;
        return count;
    }
}
