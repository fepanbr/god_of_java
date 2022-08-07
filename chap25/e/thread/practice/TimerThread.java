package chap25.e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
  public void run() {
    printCurrentTime();
  }

  public void printCurrentTime() {
    try {
      int i = 0;
      while (i < 10) {

        System.out.println(new Date().toString() + " " + System.currentTimeMillis());
        Thread.sleep(1000);
      }
      Thread.interrupted();
    } catch (InterruptedException ie) {
      ie.printStackTrace();
    }

  }
}
