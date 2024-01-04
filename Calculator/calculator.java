import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("Calculation of Two Numbers - (number1,operator,number2)");

            System.out.println("Enter Number 1 : ");
            float num1 = sc.nextInt();

            System.out.println("Enter Operator : \n (operator you have: +,-,*,/,%,==,!=,>,<,>=,<=)");
            String ops = sc.next();

            System.out.println("Enter Number 2 : ");
            float num2 = sc.nextInt();

            switch (ops) {
                case "*":
                    System.out.println("Answer : " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Answer : " + (num1 / num2));
                    break;
                case "-":
                    System.out.println("Answer : " + (num1 - num2));
                    break;
                case "+":
                    System.out.println("Answer : " + (num1 + num2));
                    break;
                case "%":
                    System.out.println("Answer : " + (num1 % num2));
                    break;
                // case "++":
                // System.out.println("Answer : " + (num1 ++ num2));
                // break;
                // case "--":
                // System.out.println("Answer : " + (num1 -- num2));
                // break;
                // case "=":
                //     System.out.println("Answer : " + (num1 = num2));
                //     break;
                // case "+=":
                //     System.out.println("Answer : " + (num1 += num2));
                //     break;
                // case "-=":
                //     System.out.println("Answer : " + (num1 -= num2));
                //     break;
                // case "*=":
                //     System.out.println("Answer : " + (num1 *= num2));
                //     break;
                // case "/=":
                //     System.out.println("Answer : " + (num1 /= num2));
                //     break;
                // case "%=":
                //     System.out.println("Answer : " + (num1 %= num2));
                //     break;
                // case "&=":
                //     System.out.println("Answer : " + (num1 &= num2));
                //     break;
                // case "|=":
                //     System.out.println("Answer : " + (num1 |= num2));
                //     break;
                // case "^=":
                //     System.out.println("Answer : " + (num1 ^= num2));
                //     break;
                // case ">>=":
                //     System.out.println("Answer : " + (num1 >>= num2));
                //     break;
                // case "<<=":
                //     System.out.println("Answer : " + (num1 <<= num2));
                //     break;
                case "==":
                    System.out.println("Answer : " + (num1 == num2));
                    break;
                case "!=":
                    System.out.println("Answer : " + (num1 != num2));
                    break;
                case ">":
                    System.out.println("Answer : " + (num1 > num2));
                    break;
                case "<":
                    System.out.println("Answer : " + (num1 < num2));
                    break;
                case ">=":
                    System.out.println("Answer : " + (num1 >= num2));
                    break;
                case "<=":
                    System.out.println("Answer : " + (num1 <= num2));
                    break;
                // case "&&":
                // System.out.println("Answer : " + (num1 && num2));
                // break;
                // case "||":
                // System.out.println("Answer : " + (num1||num2));
                // break;
                // case "!":
                // System.out.println("Answer : " + (num1 ! num2));
                // break;
                default:
                    System.out.println("Check your operator.");
                    break;
            }
        }

    }
}
