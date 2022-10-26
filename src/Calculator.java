public class Calculator {
    private double num1;
    private double num2;
    private String operation;

    public Calculator(double num1, double num2, String operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public double calculate(){
        if (operation.equals("*")){
            return num1 * num2;
        }
        if (operation.equals("/")){
            return num1 / num2;
        }
        if (operation.equals("+")){
            return num1 + num2;
        }
        if (operation.equals("-")){
            return num1 - num2;
        }
        if (operation.equals("%")){
            return num1 % num2;
        }
        if (operation.equals("^")){
            return Math.pow(num1, num2);
        }
        return 0;
    }
}
