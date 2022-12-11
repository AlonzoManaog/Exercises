public class Driver {
    //Main Method
    public static void main(String[] args){
        Calculator calculate = new Calculator(5,6);
        System.out.printf("%.1f + %.1f = %.1f\n",calculate.x,calculate.y,calculate.add(calculate.x,calculate.y));//Print Add
        System.out.printf("%.1f * %.1f = %.1f",calculate.x,calculate.y,calculate.multiply(calculate.x,calculate.y));//Print Multiply
    }
}
