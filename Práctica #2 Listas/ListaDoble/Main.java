public class Main {

    public static void main(String[] args) {

        System.out.println("Lista Doblemente Enlazada");
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        lista.insertar(5);
        lista.insertar(59);
        lista.insertar(91);
        lista.insertar(-17);
        lista.insertar(73);
        lista.insertar(34);
        lista.insertar(40);

        lista.eliminar(2);
        lista.eliminar(3);

        // Obtener el valor en el índice 3
        int valor = lista.obtener(3);
        System.out.printf("Valor en el indice 3: %d\n", valor);

        // Mostrar la longitud de la lista
        int longitud = lista.longitud();
        System.out.printf("Longitud de la lista: %d\n", longitud);
    }
}