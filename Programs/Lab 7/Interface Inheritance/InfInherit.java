interface Inf1 {
   public int fact(int n);
}

interface Inf2 extends Inf1 {
   public float ncr(int n, int r);
}

public class InfInherit implements Inf2 {
   public int fact(int n) {
      int i, f = 1;
      for (i = 1; i <= n; i++)
         f = f * i;
      return (f);
   }

   public float ncr(int n, int r) {
      float res;
      res = fact(n) / (fact(n - r) * fact(r));
      return res;
   }

   public static void main(String args[]) {
      // Inf2 obj = new Inf2();
      Inf2 obj = new InfInherit();
      // Interfaceinherit obj = new Interfaceinherit();
      System.out.println("factorial =" + (obj.fact(4)));
      System.out.println("ncr =" + (obj.ncr(4, 2)));
   }
}
