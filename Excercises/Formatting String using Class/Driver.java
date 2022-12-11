public class Driver {
    public static void main (String[] args){
        Number number = new Number(3.1146789);
        System.out.println("Original number: " + number.number);
        Number.Precision precision = number.new Precision();
        System.out.println("Resultant number: " + precision.setPrecision());
    }
}
