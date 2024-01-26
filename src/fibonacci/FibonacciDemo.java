package fibonacci;

public class FibonacciDemo {

  public static void main(String[] args) {
    Fibonacci fibonacci = new Fibonacci();
    
    fibonacci.generate(10);
    System.out.println(fibonacci);
  }

}
