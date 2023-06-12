public class Generics {

  public static void main(String[] args) {

    String arg = "he;;p";
    printSomeThing(arg);

  }

  private static <T> T printSomeThing(T intenger) {
    System.out.println(intenger);
    return intenger;
  }
}
