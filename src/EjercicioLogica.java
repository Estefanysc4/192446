import java.util.Scanner;

public class EjercicioLogica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.println("ingrese el nombre del conductor");
            String nombre = input.nextLine();
            System.out.println("ingrese la velocidad del conductor");
            int Velocidad = input.nextInt();
            input.nextLine();
            double multa = (Velocidad - 60) * 2.5;

            if (Velocidad > 60) {
                System.out.println("el conductor  " + nombre + " debe pagar una multa de  " + multa);

            } else {
                System.out.println("feliciades");
            }
        }

        input.close();
    }
}
