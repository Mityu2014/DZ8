public class Main {
    public static void main(String[] args) {
       CalculatorComplexNumber calc = new CalculatorComplexNumber();
       Decorator dec = new Decorator(calc, new Logger());
       ViewCalculator view = new ViewCalculator(dec);
       view.run();
    }
}