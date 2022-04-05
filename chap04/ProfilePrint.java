package chap04;

public class ProfilePrint {
  byte age = 0;
  String name = "";
  boolean isMarried = false;

  public void setAge(byte age) {
    this.age = age;
  }

  public byte getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setMarried(boolean flag) {
    this.isMarried = flag;
  }

  public boolean getMarried() {
    return this.isMarried;
  }

  public static void main(String[] args) {
    ProfilePrint print = new ProfilePrint();
    print.setAge((byte) 32);
    print.setName("철현");
    print.setMarried(false);
    System.out.println("나이:" + print.getAge());
    System.out.println("이름:" + print.getName());
    System.out.println("결혼:" + print.getMarried());
  }
}
