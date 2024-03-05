package main;

public class DescobrirLogica {

	public static void main(String[] args) {
		// a) 1, 3, 5, 7, ___
        System.out.println(" a):");
        for (int i = 1; i <= 7; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n O próximo elemento é 9");

        // b) 2, 4, 8, 16, 32, 64, ____
        System.out.println("\n b):");
        int num = 2;
        for (int i = 1; i <= 6; i++) {
            num *= 2;
            System.out.print(num + " ");
        }
        System.out.println("\n O próximo elemento é 128");

        //  c) 0, 1, 4, 9, 16, 25, 36, ____
        System.out.println("\n c):");
        for (int i = 0; i <= 6; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n O próximo elemento é 49");

        // d) 4, 16, 36, 64, ____
        System.out.println("\n d):");
        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i * i + " ");
        }
        System.out.println("\n O próximo elemento é 100");

        // e) 1, 1, 2, 3, 5, 8, ____
        System.out.println("\n e):");
        int a = -1;
        int b = -1;
        for (int i = -1; i <=5; i++) {
            int next = a + b;
            if (next == -1) {
                next =1;
            }
            a = b;
            b = next;
            System.out.print(next + " ");
        }
        
      System.out.println("\n O próximo elemento é 13");

      // f)2,10 ,12 ,16 ,17 ,18 ,19 ,____
      System.out.println("\n f):");
      int n=2;
      for(int i=0;i<6;i++){
          n+=i+8;
          System.out.print(n+" ");
      }
      System.out.println("\n O próximo elemento é 21");
    }

	

}
