import java.util.Stack;

public class UASPemKom2023_9 {

    // Method untuk memeriksa keseimbangan kurung
    public static boolean checkBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // Jika kurung tutup dan stack kosong, atau tidak cocok dengan kurung buka teratas
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), currentChar)) {
                    return false;
                } else {
                    stack.pop(); // Cocok, hapus kurung buka yang sesuai dari stack
                }
            }
        }

        // Stack harus kosong jika kurung seimbang
        return stack.isEmpty();
    }

    // Method untuk memeriksa pasangan kurung
    public static boolean isMatchingPair(char char1, char char2) {
        return (char1 == '(' && char2 == ')') ||
               (char1 == '{' && char2 == '}') ||
               (char1 == '[' && char2 == ']');
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";

        if (checkBalancedParentheses(expression1)) {
            System.out.println("Ekspresi matematika 1 memiliki keseimbangan kurung.");
        } else {
            System.out.println("Ekspresi matematika 1 tidak memiliki keseimbangan kurung.");
        }

        if (checkBalancedParentheses(expression2)) {
            System.out.println("Ekspresi matematika 2 memiliki keseimbangan kurung.");
        } else {
            System.out.println("Ekspresi matematika 2 tidak memiliki keseimbangan kurung.");
        }
    }
}
