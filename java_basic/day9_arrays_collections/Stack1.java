
import java.util.*;

public class Stack1 {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }

        while (!s.empty()) {
            System.out.println(s.pop());
        }

    }

}