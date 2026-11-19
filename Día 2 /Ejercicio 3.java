import java.util.Arrays;

public class IntegradorArrays {
    public static void main(String[] args) {
        // 1. Arreglo original
        int[] datos = {14, 7, 25, 3, 18};

        // 2. Crear una copia real con Arrays.copyOf
        int[] copia = Arrays.copyOf(datos, datos.length);

        // 3. Ordenar solo la copia con Arrays.sort
        Arrays.sort(copia);

        // 4. Mostrar ambos arreglos con Arrays.toString
        System.out.println("Arreglo original: " + Arrays.toString(datos));
        System.out.println("Arreglo copia ordenado: " + Arrays.toString(copia));

        // 5. Indicar el segundo número mayor (penúltimo índice al estar ordenado ascendentemente)
        int segundoMayor = copia[copia.length - 2];
        System.out.println("Segundo número mayor: " + segundoMayor);

        // 6. Posición del 14 en la copia usando Arrays.binarySearch
        int posicion14 = Arrays.binarySearch(copia, 14);
        System.out.println("Posición del 14 en la copia (índice): " + posicion14);
    }
}
