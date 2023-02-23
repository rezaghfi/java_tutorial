package j1_basics;

public class Sample {

  public int attribute1;
  Sample() {
    System.out.println("ana constructor with no parameter");
  }

  Sample(int a) {
    System.out.println("ana constroctor with parameter. a =" + a);
  }

  // this is method
  public void javaVariable() {
    // data type in java
    char a = 'a', b = 'b';
    int c = 1;
    short d = 1;
    long e = 1232323232;
    float f = 1.34f;
    double g = 232343.34343;
    byte h = 12;
    //Double i = new Double(123232.3434);

    System.out.println("a , b are character and they values are: " + a + ", " + b);
    System.out.println("c is integer and its value is: " + c + "\ne is short and its value is: " + d + "\nf is float and its values is:" + f + "\ng is double and its values is:" + g);
  }

  public void javaIterative() {
    int arr[] = new int[10];
    int i = 1000;
    do {
      System.out.println("do while body have one or more run");
    } while (i < 100);
    for (int j : arr) {
      i = i / 2;
      j = (int) i;
      System.out.println("j value in for each Iterator is:" + j);
    }
  }

}
