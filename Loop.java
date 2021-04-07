public class Loop {

    public static void main(String[] args) {
      double startValue = 6.0;
      double factorial = 1.0;
      int iVal = 5;

      while(startValue > 1) {
        factorial *= startValue;
        startValue--;
      }
      System.out.println("the factorial of 6 is: " + factorial);

      do {
        System.out.print(iVal);
        System.out.print(" * 2 = ");
        iVal *= 2;
        System.out.println("the answer is " + iVal);
      } while(iVal < 1492);

      for (int i = 1; i < 129; i *= 2){
        System.out.println(i);
      }

    }
}
