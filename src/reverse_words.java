import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverse_words {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        Stack<Character> stack=new Stack<>();
        for (int i = s1.length()-1; i >=0 ; i--) {
               if (s1.charAt(i)!='.')
                   stack.push(s1.charAt(i));
               else {
//                   for (int j = stack.size()-1; j >=0 ; j--) {
//                       System.out.print(stack.get(j));
//                   }
//                   stack.clear();
                   while (!stack.empty())
                       System.out.print(stack.pop());
                   System.out.print(".");
               }
        }
        for (int j = stack.size()-1; j >=0 ; j--) {
            System.out.print(stack.get(j));
        }
    }
}
