import java.util.Scanner;

public class BusquedaConteo {

    public static void main(String[] args) {
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero a buscar: ");
        int buscado = teclado.nextInt();

        int contador = 0;
        int posicion = -1; // -1 indica que aún no se ha encontrado

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                if (posicion == -1) { // solo se guarda la primera aparición
                    posicion = i;
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe");
        } else {
            System.out.println("El numero " + buscado + " aparece " + contador + " vez/veces.");
            System.out.println("Primera posicion: " + posicion);
        }

        teclado.close();
    }
}
