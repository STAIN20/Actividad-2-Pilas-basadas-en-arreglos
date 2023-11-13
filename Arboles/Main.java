public class Main {
  public static void main(String[] args) {
    Arbol<String> arbol = new Arbol<>("A", false);
  
    NodoArbol<String> nodoRaiz = arbol.obtenerRaiz();
    NodoArbol<String> nodoB = new NodoArbol<>("B");
    NodoArbol<String> nodoC = new NodoArbol<>("C");
    NodoArbol<String> nodoD = new NodoArbol<>("D");
    NodoArbol<String> nodoE = new NodoArbol<>("E");
    NodoArbol<String> nodoF = new NodoArbol<>("F");
    NodoArbol<String> nodoG = new NodoArbol<>("G");
    NodoArbol<String> nodoH = new NodoArbol<>("H");
    NodoArbol<String> nodoI = new NodoArbol<>("I");
    NodoArbol<String> nodoJ = new NodoArbol<>("J");
    NodoArbol<String> nodoK = new NodoArbol<>("K");
    NodoArbol<String> nodoL = new NodoArbol<>("L");
    NodoArbol<String> nodoM = new NodoArbol<>("M");
    NodoArbol<String> nodoN = new NodoArbol<>("N");
    NodoArbol<String> nodoO = new NodoArbol<>("O");
    NodoArbol<String> nodoP = new NodoArbol<>("P");
    NodoArbol<String> nodoQ = new NodoArbol<>("Q");

    // Nodo A y su descendencia
    arbol.agregarNodoArbol(nodoRaiz, nodoB);
    arbol.agregarNodoArbol(nodoRaiz, nodoC);
    arbol.agregarNodoArbol(nodoRaiz, nodoD);
    // Nodo B y su descendencia
    arbol.agregarNodoArbol(nodoB, nodoE);
    arbol.agregarNodoArbol(nodoB, nodoF);
    // Nodo F y su descendencia
    arbol.agregarNodoArbol(nodoF, nodoJ);
    arbol.agregarNodoArbol(nodoF, nodoK);
    arbol.agregarNodoArbol(nodoF, nodoL);
    // Nodo D y su descendencia
    arbol.agregarNodoArbol(nodoD, nodoG);
    arbol.agregarNodoArbol(nodoD, nodoH);
    arbol.agregarNodoArbol(nodoD, nodoI);
    // Nodo G y su descendencia
    arbol.agregarNodoArbol(nodoG, nodoM);
    // Nodo I y su descendencia
    arbol.agregarNodoArbol(nodoI, nodoN);
    arbol.agregarNodoArbol(nodoI, nodoO);
    // Nodo M y su descendencia
    arbol.agregarNodoArbol(nodoM, nodoP);
    arbol.agregarNodoArbol(nodoM, nodoQ);

  System.out.println("\n--Árbol Ordinario--");
    
  System.out.println();
    arbol.imprimirArbol(Recorrido.PREFIJO);
    arbol.imprimirArbol(Recorrido.INFIJO);
    arbol.imprimirArbol(Recorrido.POSFIJO);

    System.out.println();
    System.out.println("\n--Altura del árbol: " + arbol.obtenerAltura());

        System.out.println("\n--Subarbol B ");
        arbol.imprimirSubArbol(nodoB);
        System.out.println();

        System.out.println("\n--¿El árbol está vacío?");
          System.out.println(arbol.estaVacio() ? "Sí\n" : "No\n");

        String raiz = nodoRaiz.getDato();
        System.out.println("--Raíz del árbol: " + raiz);

         System.out.println("\n--Árbol Binario--");

        Arbol<String> arbolBin = new Arbol<String>("A", true);

        NodoArbol<String> raizBin = arbolBin.obtenerRaiz();
        NodoArbol<String> nodoBinB = new NodoArbol<>("B");
        NodoArbol<String> nodoBinC = new NodoArbol<>("C");
        NodoArbol<String> nodoBinD = new NodoArbol<>("D");
        NodoArbol<String> nodoBinE = new NodoArbol<>("E");
        NodoArbol<String> nodoBinF = new NodoArbol<>("F");
        NodoArbol<String> nodoBinG = new NodoArbol<>("G");
        NodoArbol<String> nodoBinH = new NodoArbol<>("H");
        NodoArbol<String> nodoBinI = new NodoArbol<>("I");
        NodoArbol<String> nodoBinJ = new NodoArbol<>("J");
        NodoArbol<String> nodoBinK = new NodoArbol<>("K");
        NodoArbol<String> nodoBinL = new NodoArbol<>("L");
        NodoArbol<String> nodoBinM = new NodoArbol<>("M");
        NodoArbol<String> nodoBinN = new NodoArbol<>("N");
        NodoArbol<String> nodoBinO = new NodoArbol<>("O");
        NodoArbol<String> nodoBinP = new NodoArbol<>("P");
        NodoArbol<String> nodoBinQ = new NodoArbol<>("Q");

        arbolBin.agregarNodoArbol(raizBin, nodoBinB);
        arbolBin.agregarNodoArbol(nodoBinB, nodoBinE);
        arbolBin.agregarNodoArbol(nodoBinB, nodoBinC);
        arbolBin.agregarNodoArbol(nodoBinE, nodoBinF);
        arbolBin.agregarNodoArbol(nodoBinF, nodoBinJ);
        arbolBin.agregarNodoArbol(nodoBinJ, nodoBinK);
        arbolBin.agregarNodoArbol(nodoBinK, nodoBinL);
        arbolBin.agregarNodoArbol(nodoBinC, nodoBinD);
        arbolBin.agregarNodoArbol(nodoBinD, nodoBinG);
        arbolBin.agregarNodoArbol(nodoBinG, nodoBinM);
        arbolBin.agregarNodoArbol(nodoBinG, nodoBinH);
        arbolBin.agregarNodoArbol(nodoBinM, nodoBinP);
        arbolBin.agregarNodoArbol(nodoBinP, nodoBinQ);
        arbolBin.agregarNodoArbol(nodoBinH, nodoBinI);
        arbolBin.agregarNodoArbol(nodoBinI, nodoBinN);
        arbolBin.agregarNodoArbol(nodoBinN, nodoBinO);

        System.out.println();
        arbolBin.imprimirArbol(Recorrido.PREFIJO);
        arbolBin.imprimirArbol(Recorrido.INFIJO);
        arbolBin.imprimirArbol(Recorrido.POSFIJO);

        System.out.println();
          System.out.println("\n--Altura del árbol: " + arbolBin.obtenerAltura());

        System.out.println("--Subarbol E ");
        arbol.imprimirSubArbol(nodoBinE);
        System.out.println();

        System.out.println("\n--¿El árbol está vacío?");
          System.out.println(arbolBin.estaVacio() ? "Sí\n" : "No\n");

        String raizArbolBin = raizBin.getDato();
        System.out.println("--Raíz del arbol: " + raizArbolBin);

        arbolBin.imprimirSubArbol(nodoBinJ);
  }
  
}
