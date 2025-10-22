public class SimpleMath {
    public static double addition(double a, double b){
        return a + b;
    }
    public static double division(double a, double b){
        if(a==0 && b==0){
            throw new IllegalArgumentException("Infinity");
        }
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
