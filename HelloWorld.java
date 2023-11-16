public class HelloWorld {
  public static void main(String[] args) {
    if (args.length > 0) {
      for (String arg : args) {
        System.out.println("Hello, " + arg);
      }
    } else {
      System.out.println("Hello Java world!");
    }
  }
}
