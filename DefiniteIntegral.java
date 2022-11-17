import java.util.function.DoubleUnaryOperator;

public class DefiniteIntegral{
    public static double get(DoubleUnaryOperator function, double start, double end, int div){
        double result = 0, h = (end - start) / div;
        for(int i = 1; i <= div; i++){
            result += function.applyAsDouble(start + i * h); //f(x_i)
        }
        result *= 2;
        result += function.applyAsDouble(start); //f(a)
        result += function.applyAsDouble(end); //f(b)
        result *= h / 2;
        return result;
    }

}