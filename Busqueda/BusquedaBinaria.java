import java.util.Arrays;
import java.util.Random;

public class BusquedaBinaria {

    public static int[] MilNumeros() {
        int[] numeros = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            numeros[i] = rand.nextInt(10001);
        }

        return numeros;
    }

    public static int busquedaBinaria(int[] nums, int numABuscar) {
        int primero = 0;
        int ultimo = nums.length - 1;

        while (primero <= ultimo) {
            int centro = (primero + ultimo) / 2;

            System.out.println("Centro: " + centro);

            if (nums[centro] == numABuscar) {
                return centro;
            } else if (nums[centro] < numABuscar) {
                primero = centro + 1;
            } else {
                ultimo = centro - 1;
            }
        }

        return -1;
    }

    public static void quickSort(int[] nums, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int pivote = particion(nums, izquierda, derecha);
            quickSort(nums, izquierda, pivote - 1);
            quickSort(nums, pivote + 1, derecha);
        }
    }

    private static int particion(int[] nums, int izquierda, int derecha) {
        int pivote = nums[derecha];
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (nums[j] < pivote) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[derecha];
        nums[derecha] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] milNumeros = MilNumeros();

        System.out.println("Arreglo antes del ordenamiento:");
        System.out.println(Arrays.toString(milNumeros));

        quickSort(milNumeros, 0, milNumeros.length - 1);

        System.out.println("\nArreglo después del ordenamiento con QuickSort:");
        System.out.println(Arrays.toString(milNumeros));

        int numeroBusqueda = 2710; 

        System.out.println("\nEl número a buscar es: " + numeroBusqueda);

        int resultado = busquedaBinaria(milNumeros, numeroBusqueda);
        if (resultado != -1) {
            System.out.println("\nSe encontró el número en el índice " + resultado);
        } else {
            System.out.println("\nNo se encontró el número");
        }
    }
}
