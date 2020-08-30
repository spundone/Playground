import java.util.*;

class InfixToPostfix {
    // A utility function to return precedence of a given operator, Higher returned
    // value means higher precedence
    static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 1;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    // The main method that converts given infix expression to postfix expression.
    static String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = "";
        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

            // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);

            // If the scanned character is an ')', pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression
                else
                    stack.pop();
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp) {
        // create a stack
        Stack<Integer> stack = new Stack<>();

        // Scan all characters one by one
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if (Character.isDigit(c))
                stack.push(c - '0');

            // If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // Driver method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Actual Infix expression: "); // No Variables Only Actual Numbers
        String inexp = s.nextLine();
        String postexp = (infixToPostfix(inexp));
        System.out.println("The Postfix expression is: " + postexp);
        System.out.println("The Evaluation Value of the Postfix expression is: " + evaluatePostfix(inexp));
        s.close();
    }
}
