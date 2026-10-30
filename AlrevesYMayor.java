public class AlrevesYMayor {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Entrada.leerEntero("Ingrese el numero " + (i + 1)+ ":");
        }

        mostrarAlreves(numeros);

        mostrarMayor(numeros);
    }

    public static void mostrarAlreves(int[] numeros) {

        System.out.print("Al reves: ");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
    }

    public static void mostrarMayor(int[] numeros) {

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
    }
}