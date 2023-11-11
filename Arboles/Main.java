public class Main {
    public static void main(String[] args) {
      Arbol<String> arbol = new Arbol<>("A", false);
  
      NodoArbol<String> nodoB = new NodoArbol<>("B");
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoB);
      NodoArbol<String> nodoE = new NodoArbol<>("E");
      arbol.agregarNodoArbol(nodoB, nodoE);
  
      NodoArbol<String> nodoF = new NodoArbol<>("F");
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoF);
      arbol.agregarNodoArbol(nodoF, new NodoArbol<>("J"));
      arbol.agregarNodoArbol(nodoF, new NodoArbol<>("K"));
      arbol.agregarNodoArbol(nodoF, new NodoArbol<>("L"));
  
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), new NodoArbol<>("C"));
  
      NodoArbol<String> nodoD = new NodoArbol<>("D");
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoD);
      NodoArbol<String> nodoG = new NodoArbol<>("G");
      arbol.agregarNodoArbol(nodoD, nodoG);
      NodoArbol<String> nodoM = new NodoArbol<>("M");
      arbol.agregarNodoArbol(nodoG, nodoM);
      arbol.agregarNodoArbol(nodoM, new NodoArbol<>("P"));
      arbol.agregarNodoArbol(nodoM, new NodoArbol<>("Q"));
  
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), new NodoArbol<>("H"));
  
      NodoArbol<String> nodoI = new NodoArbol<>("I");
      arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoI);
      arbol.agregarNodoArbol(nodoI, new NodoArbol<>("N"));
      arbol.agregarNodoArbol(nodoI, new NodoArbol<>("O"));
  
      arbol.imprimirArbol(Recorrido.PREFIJO);
      arbol.imprimirArbol(Recorrido.INFIJO);
      arbol.imprimirArbol(Recorrido.POSFIJO);
    }
  }
  