package lt.vtmpmc.ems.itakademija.aidas;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());  //1   //pop isima(pasalina) elementa, peek tik pasiziuri i elementa
        System.out.println(stack.peek()); //3
        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }

    }
}
