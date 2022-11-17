import java.util.function.DoubleUnaryOperator;

class Main {
  public static void main(String[] args) {
    DoubleUnaryOperator f = x -> {
        double res = 1;
        for(int i = 0; i < 5; i++) res *= x;
        return res;
    };
    double ans = DefiniteIntegral.get(f, 0, 1, 1000000);
    System.out.println(ans);
  }
}