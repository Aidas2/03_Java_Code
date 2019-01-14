package lt.vtvpmc.ems.aidas.Pabandymui;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class JavaFile {
  public static void main(String[] args) throws IOException {
    createNewFile();
    createNewDirectory();
    createNewDirectories();
    createTmpFile();
    createTmpFileInSelectedDirectory();
    deleteFile();
    readFilePremission();
    deleteTmpFileOnExit();
    checkFileLastModifiedTimestamp();
    listFileInDirectory();
    listFileInDirectoryWithPaths();
    fileRename();
  }

  public static void createNewFile() throws IOException {
    File file = new File("test.txt");
    boolean bool = file.createNewFile();
    System.out.println("File created: " + bool);
  }

  public static void createNewDirectory() throws IOException {
    File directory = new File("NewDirectory");
    boolean bool = directory.mkdir();
    System.out.print("Directory created? " + bool);
  }

  public static void createNewDirectories() throws IOException {
    File createDirectories = new File("Dir1/Dir2/Dir3");
    boolean bool = createDirectories.mkdirs();
    System.out.print("Directory created? " + bool);
  }

  public static void createTmpFile() throws IOException {
    File tempFile = File.createTempFile("tmp", ".txt");
    System.out.println("File path: " + tempFile.getAbsolutePath());
    tempFile = File.createTempFile("tmp", null);
    System.out.print("File path: " + tempFile.getAbsolutePath());
  }

  public static void createTmpFileInSelectedDirectory() throws IOException {
    File tempFile = File.createTempFile("tmp", ".txt", new File("/home/zwaclaw/")); // Enter your home directory.
    System.out.println("File path: " + tempFile.getAbsolutePath());
  }

  public static void deleteFile() throws IOException {
    File file = new File("test.txt");
    boolean bool = file.delete();
    System.out.println("File deleted: " + bool);
  }

  public static void readFilePremission() throws IOException {
    File file = new File("test.txt");
    boolean boolOne = file.canRead();
    System.out.println("File can be read: " + boolOne);
    boolean boolTwo = file.canWrite();
    System.out.println("You can write to test.txt file: " + boolTwo);
    boolean boolThree = file.canExecute();
    String fileAbsolutePath = file.getAbsolutePath();
    System.out.println(fileAbsolutePath);
    System.out.println(" is executable: " + boolThree);
  }

  public static void deleteTmpFileOnExit() throws IOException {
    File tempFile = File.createTempFile("tmp", ".txt");
    System.out.println("File path: " + tempFile.getAbsolutePath());
    tempFile.deleteOnExit();
  }

  public static void checkFileLastModifiedTimestamp() throws IOException{
    File file = new File("forscanner.txt");
    boolean createNewFile = file.createNewFile();
    boolean existsFile = file.exists();
    if (existsFile) {
      long millisec = file.lastModified();
      Date date = new Date(millisec);
      String path = file.getPath();
      System.out.print(path + " last modified at: " + date);
    }
  }

  public static void listFileInDirectory(){
    File file = new File("..");
    String[] paths = file.list();
    for (String path : paths) {
      System.out.println(path);
    }
  }

  public static void listFileInDirectoryWithPaths(){
    File file = new File("/home/zwaclaw");
    File[] paths = file.listFiles();
    for (File path : paths) {
      System.out.println(path);
    }
  }

  public static void fileRename(){
    File file = new File("test.txt");
    File file1 = new File("test1.txt");
    boolean bool = file.renameTo(file1);
    System.out.print("File renamed? " + bool);
  }
}
