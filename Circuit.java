public class Circuit {
 // And gate
  public static int and(int a, int b) {
    return (a & b) == 1 ? 1 : 0;
  }
  // Or gate
  public static int or(int a, int b) {
    return (a | b) == 1 ? 1 : 0;
  }
  // Xor gate
  public static int xor(int a, int b) {
    return (a ^ b) == 1 ? 1 : 0;
  }

  // 1 bit adder
  public static int[] adder(int a, int b) {
    int carry = and(a, b);
    int sum = xor(a, b);
    return new int[] {carry, sum};
    
  }

  public static void main(String[] args) {
    // Your code goes here
    // 8  is 1000 in binary
    // 10 is 1010 in binary
    // 8 + 10 = 18 in decimal
    // 18 is 10010 in binary
    
    int[] result = adder(0, 0);
    System.out.println(result[0] + " " + result[1]);


  }
}