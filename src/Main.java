import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();
        int index;
        if (expression.indexOf("*") != -1){
            index = (expression.indexOf("*");
        }
        if (expression.indexOf("/") != -1){
            index = (expression.indexOf("/");
        }
        if (expression.indexOf("+") != -1){
            index = (expression.indexOf("+");
        }
        if (expression.indexOf("-") != -1){
            index = (expression.indexOf("-");
        }
        if (expression.indexOf("%") != -1){
            index = (expression.indexOf("%");
        }
        if (expression.indexOf("^") != -1){
            index = (expression.indexOf("^");
        }
        double num1 = Integer.parseInt(expression.substring(0, index-1));
        double num2 = Integer.parseInt(expression.substring(index + 1, expression.length()));
    }
}
