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
      MyInter3 M1 = () -> {
         System.out.println(" This is print");
      };
      M1.print();
      t.print();
   }

   public static void main(String arg[]) {
      MyClass test = new MyClass(19);
      test.show();
   }
}