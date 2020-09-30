import java.util.LinkedHashSet;
import java.util.Scanner;

public class remove_duplicates_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        String[] s1=new String[t];
        for (int i = 0; i <t ; i++) {
            s1[i] = s.nextLine();

            System.out.println(inte(s1[i]));
        }
    }

    private static StringBuilder inte(String s) {
        StringBuilder s1= new StringBuilder();
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (int i = 0; i <s.length() ; i++) {
            set.add(s.charAt(i));
        }
        for (Character c:set) {
            s1.append(c);
        }
        return s1;
    }
}
