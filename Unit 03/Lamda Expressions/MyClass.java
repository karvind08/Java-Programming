interface MyInter3 {
   void print();
}

public class MyClass {
   int a;

   MyClass(int x) {
      this.a = x;
   }

   void show() {
      MyInter3 t = () -> {
         System.out.println("a = " + a);
      };
      t.print();
   }

   public static void main(String arg[]) {
      MyClass test = new MyClass(19);
      test.show();
   }
}