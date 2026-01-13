package lab05.task_1_2;

public class SimpleMath {
    public double add(double a, double b){
        return a + b;
    }
    public double minus(double a, double b){
        return a - b;
    }
    public double divide(double a, double b) {
        if(a==0 && b==0) throw new RuntimeException("Infinite possibilities");
        if(b==0) throw new RuntimeException("Divide by zero");
        return a/b;
    }
    // TODO: add methods: multiple
}
