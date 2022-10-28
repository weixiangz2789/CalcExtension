import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();
        int index = 0;
        String operation = "";
        if (expression.indexOf("-") != -1 ){
            index = expression.indexOf("-");
            operation = "-";
        }
        if (expression.indexOf("-") != -1 && expression.indexOf("-") == 0){
            String temp = expression.substring(1);
            index = temp.indexOf("-") + 1;
            operation = "-";
        }
        if (expression.indexOf("*") != -1) {
            index = expression.indexOf("*");
            operation = "*";
        }
        if (expression.indexOf("/") != -1){
            index = expression.indexOf("/");
            operation = "/";
        }
        if (expression.indexOf("+") != -1){
            index = expression.indexOf("+");
            operation = "+";
        }
        if (expression.indexOf("%") != -1){
            index = expression.indexOf("%");
            operation = "&";
        }
        if (expression.indexOf("^") != -1){
            index = expression.indexOf("^");
            operation = "^";
        }
        double num1 = Double.parseDouble(expression.substring(0, index-1));
        double num2 = Double.parseDouble(expression.substring(index + 2, expression.length()));
        Calculator calc = new Calculator(num1, num2, operation);
        System.out.println(calc.calculate());

    }
}
