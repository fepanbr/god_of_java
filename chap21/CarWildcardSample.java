package chap21;

public class CarWildcardSample {
  public static void main(String[] args) {
    CarWildcardSample sample = new CarWildcardSample();
    sample.callBoundedWildcardMehtod();
  }

  public void callBoundedWildcardMehtod() {
    WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
    wildcard.setWildcard(new Car("Mustang"));
    boundedWildcardMethod(wildcard);
  }

  public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
    Car value = c.getWildcard();
    System.out.println(value);
  }

  public void callBusBoundedWildcardMethod() {
    WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
    wildcard.setWildcard(new Bus("6900"));
    boundedWildcardMethod(wildcard);
  }

  public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
    c.setWildcard(addValue);
    T value = c.getWildcard();
    System.out.println(value);
  }

  public void callGenericMethod() {
    WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
    genericMethod(wildcard, "data");
  }
}
