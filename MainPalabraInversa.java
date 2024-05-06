import java.util.Scanner;

public class MainPalabraInversa {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Dame una palabra ");
        String setPalabra = opc.nextLine();

        StringBuilder palabrainvertida = new StringBuilder();
        for (int x = setPalabra.length() - 1; x >= 0; x--) {
            palabrainvertida.append(setPalabra.charAt(x));
        }
        System.out.println("La palabra ivertida es: "+ palabrainvertida.toString());
    }
}