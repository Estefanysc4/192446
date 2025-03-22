import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número límite:");
        int L = input.nextInt();
        int i = 1;
        int T = 0;
        int M = 0;
        int N = 0;
        
        while (i <= L) {
            if (i % 3 == 0) {
                T = T + i;
                System.out.println(i + " es múltiplo de 3");
            }

            if (i % 5 == 0) {
                M = M + i;
                System.out.println(i + " es múltiplo de 5");
            }

            if (i % 3 != 0 && i % 5 != 0) {
                N = N + i;
                System.out.println(i + " no es múltiplo de 3 ni 5");
            }

            i = i + 1;
        }
        System.out.println("Suma de múltiplos de 3: " + T);
        System.out.println("Suma de múltiplos de 5: " + M);
        System.out.println("Suma del resto: " + N);
        input.close();
    }
}
