import java.util.Scanner;
public class day66 {

    static class Stack {
        char[] items;
        int top;
       Stack(int size) {
            items = new char[size];
            top = -1;
        }
        void push(char item) {
            if (top == items.length - 1) {
                System.out.println("Stack is full");
                return;
            }
            items[++top] = item;
        }
        char pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return '\0';
            }
            return items[top--];
        }
        boolean isEmpty() {
            return top == -1;
        }

        static boolean isBalanced(String expression) {
            Stack stack = new Stack(expression.length());
            for (char ch : expression.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = s.nextLine();
        if (Stack.isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
        s.close();
    }
}
