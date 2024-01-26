package fibonacci;

public class Fibonacci {
  int[] sequence;

  public void generate(int length) {
    sequence = new int[length];

    sequence[0] = 0;
    sequence[1] = 1;

    for(int position = 2; position < length; position += 1) {
      int valueMinus1 = sequence[position - 1];
      int valueMinus2 = sequence[position - 2];
      sequence[position] = valueMinus1 + valueMinus2;
    }
  }

  @Override
  public String toString() {
    String result = "";
    
    result += "[";
    
    for(int value : sequence) {
      result += value + ", ";
    }
    
    result = result.substring(0, result.length() - 2);
    
    result += "]";

    return result;
  }

}
