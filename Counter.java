public class Counter {
  public static void main(String[] args){
    for (int i = 0; i < 100; i++){
      while (i++ <= 100) {
        if ( i % 3 == 0 ){
          System.out.println("buzz" + " " + i);
        }
        if (i % 5 == 0 ){
          System.out.println("fuzz" + " " + i);
      }
     }
    }
  }
}
