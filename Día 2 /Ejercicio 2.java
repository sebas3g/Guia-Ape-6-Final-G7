
public class Ejercicio2 {
    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        int posMax = 0;
        int posMin = 0;
        double suma = 0;

        // Recorrer los arreglos
        for (int i = 0; i < notas.length; i++) {

            suma += notas[i];

            if (notas[i] > notas[posMax]) {
                posMax = i;
            }

            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
        }

        // Calcular promedio
        double promedio = suma / notas.length;

        // Mostrar resultados
        System.out.println("===== RESULTADOS =====");

        System.out.println("Nota más alta: " + notas[posMax]);
        System.out.println("Estudiante: " + nombres[posMax]);

        System.out.println("----------------------");

        System.out.println("Nota más baja: " + notas[posMin]);
        System.out.println("Estudiante: " + nombres[posMin]);

        System.out.printf("----------------------%n");
        System.out.printf("Promedio general: %.2f%n", promedio);
    }
}
