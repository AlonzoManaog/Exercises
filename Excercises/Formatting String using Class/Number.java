public class Number {
    double number;
    Number(int number)
    {
        this.number = number;
    }
    Number(double number)
    {
        this.number = number;
    }
    class Precision
    {
        double setPrecision()
        {
            String num = String.format("%.2f", number);
            return Double.parseDouble(num);
        }
    }
}