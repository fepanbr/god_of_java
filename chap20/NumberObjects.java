package chap20;

public class NumberObjects {
  public long parseLong(String data) {
    Long letLong = -1L;
    try {
      letLong = Long.parseLong(data);
      System.out.println(letLong);
    } catch (NumberFormatException e) {
      System.out.println(data + " is not a number");
    }
    return letLong;
  }

  public void printOtherBase(long value) {
    System.out.println("Original:" + value);
    System.out.println("Binary:" + Long.toBinaryString(value));
    System.out.println("Hex:" + Long.toHexString(value));
    System.out.println("Octal:" + Long.toOctalString(value));
  }

  public static void main(String[] args) {
    NumberObjects sample = new NumberObjects();

    sample.parseLong("r1024");
    sample.parseLong("1024");
    sample.printOtherBase(1024);
  }
}
