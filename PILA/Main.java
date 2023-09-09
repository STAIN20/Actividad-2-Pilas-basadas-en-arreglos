public class Main {
	
	public static void main(String[] args) {
		Pila pila = new Pila();

		pila.insertar(14);
		pila.insertar(27);
		pila.insertar(1);
		pila.insertar(15);
		pila.insertar(10);
		pila.insertar(90);
		pila.insertar(71);
		pila.insertar(37);
		pila.insertar(2);
		pila.insertar(48);

		System.out.println ("Tamano de la pila: " + pila.tamano());

		pila.quitar();
		pila.quitar();
		pila.quitar();
		pila.quitar();

		System.out.println ("Elementos de la pila: " + pila.cima());

		pila.vaciar();

		if(pila.vacio()) {
			System.out.println ("La pila esta vacia");
		} else {
			System.out.println ("La pila no esta vacia");
		}
	}
}