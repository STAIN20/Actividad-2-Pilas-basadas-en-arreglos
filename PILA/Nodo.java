public class Nodo {
	
	private int dato;
	private Nodo nodo;

	public Nodo() {
		this.dato = 0;
		this.nodo = null;
	}

	public Nodo(int dato) {
		this.dato = dato;
		this.nodo = null;
	}

	public int getDato() {
		return dato;
	}

	public Nodo getNodo() {
		return nodo;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}
}