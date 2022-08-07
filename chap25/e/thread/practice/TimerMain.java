package chap25.e.thread.practice;

public class TimerMain {
  public static void main(String[] args) {
    TimerThread thread = new TimerThread();
    thread.start();

  }
}
