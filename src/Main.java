import java.io.*;

public class Main {

  public static void main(String args[]){

    try {

      if (args.length != 1) {
        System.out.println("sytnax: Main <FILE>");
      }
      else {
        // open file as input stream
        InputStream ss = new FileInputStream(args[0]);
        // create parser with file as input stream
        Parser parser = new Parser(ss);
        // get AST root
        SimpleNode root = parser.start();
        // display AST
        root.dump("");
      }
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }

    GsonTest gsonTest = new GsonTest();
  }
}