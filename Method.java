public class Method {

    public static void main(String[] args) {
      System.out.println("Before the method call");
      doSomething();
      System.out.println("After the method call");
    }
      static void doSomething() {
        System.out.println("Inside the method call");
      }
  }
