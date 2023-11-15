import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArbolBin arbol = new ArbolBin();
        Scanner scanner = new Scanner(System.in);

        // Insertar valores
        System.out.println("Por favor, introduce los valores que deseas insertar en el árbol (separados por espacios):");
        String[] valores = scanner.nextLine().split(" ");
        for (String valor : valores) {
            arbol.insertar(Integer.parseInt(valor));
        }

        // Imprimir el árbol
        System.out.println("Árbol después de insertar los valores:");
        arbol.imprimir();

        // Buscar un nodo
        System.out.println("Por favor, introduce el valor del nodo que deseas buscar:");
        int valorBusqueda = scanner.nextInt();
        if (arbol.buscar(valorBusqueda)) {
            System.out.println("El nodo con el valor " + valorBusqueda + " se encontró en el árbol.");
        } else {
            System.out.println("El nodo con el valor " + valorBusqueda + " no se encontró en el árbol.");
        }

        // Eliminar un nodo
        System.out.println("Por favor, introduce el valor del nodo que deseas eliminar:");
        int valorEliminacion = scanner.nextInt();
        arbol.eliminar(valorEliminacion);

        // Imprimir el árbol después de la eliminación
        System.out.println("Árbol después de eliminar el nodo:");
        arbol.imprimir();

        scanner.close();
    }
}

