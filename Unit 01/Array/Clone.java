public class Clone {
  public static void main(String[] args) {
    int myArray[] = { 1, 2, 3, 4, 5 };
    int cloneArray[] = myArray.clone();
    System.out.println(myArray == cloneArray);
  }
}
