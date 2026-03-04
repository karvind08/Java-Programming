interface speaker {
  public String say();
}

public class Main5 {
  public static void main(String[] args) {
    speaker s = () -> {
      return "Lambda Expression";
    };
    System.out.println(s.say());
  }
}
