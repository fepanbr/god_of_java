package chap26.e.io;

import java.io.File;

public class FileSample {
  public static void main(String[] args) {
    FileSample sample = new FileSample();
    String pathName = File.separator + "godofjava" + File.separator + "text";
    sample.checkPath(pathName);
    sample.makeDir(pathName);
    sample.checkFileMethods(pathName);
  }

  public void checkPath(String pathName) {
    File file = new File(pathName);
    System.out.println(pathName + " is exist? =" + file.exists());
  }

  public void makeDir(String pathName) {
    File file = new File(pathName);
    System.out.println("Make " + pathName + " result = " + file.mkdir());
  }

  public void checkFileMethods(String pathName) {
    File file = new File(pathName);
    System.out.println(pathName + " is directory? = " + file.isDirectory());
    System.out.println(pathName + " is file? = " + file.isFile());
    System.out.println(pathName + " is hidden? = " + file.isHidden());
  }
}
