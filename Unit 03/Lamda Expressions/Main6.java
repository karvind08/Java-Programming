
interface Speaker1 {
    public String say(String name);
}

public class Main6 {
    public static void main(String[] args) {

        // Lambda expression with a single parameter.
        Speaker1 S1 = (name) -> {
            return "Hello, " + name;
        };

        System.out.println(S1.say("Arvind"));

        // You can omit function parentheses

        Speaker1 S2 = name -> {
            return "Hello, " + name;
        };

        System.out.println(S2.say("Hello"));

        // can omit the return statement and curly brackets because it has only one
        // statement in the function body

        Speaker1 S3 = name -> "Hello, " + name;

        System.out.println(S3.say("Lambda Expression"));

    }
}
