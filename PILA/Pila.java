public class Pila {
	
	private Nodo cima;
	private int tamano;

	public Pila() {
		cima = null;
		tamano = 0;
	}

	public void insertar(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		nuevoNodo.setNodo(cima);
		cima = nuevoNodo;
		tamano++;
	}

	public void quitar() {
		if (!vacio()){
			cima = cima.getNodo();
			tamano--;
		}
	}

	public boolean vacio() {
		return cima == null;
	}

	public void vaciar() {
		cima = null;
		tamano = 0;
	}

	public int cima() {
		if (!vacio()) {
			return cima.getDato();
		} else {
			throw new RuntimeException ("La pila esta vacia");
		}
	}

	public int tamano() {
		return tamano;
	}
}