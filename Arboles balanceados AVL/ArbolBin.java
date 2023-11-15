public class ArbolBin {
    private NodoAVL raiz;

    // Constructor sin parámetros
    public ArbolBin() {
        raiz = null;
    }

    // Método para insertar un nodo
    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    private NodoAVL insertar(NodoAVL nodo, int valor) {
        if (nodo == null) {
            return new NodoAVL(valor);
        } else if (valor < nodo.valor) {
            nodo.izquierda = insertar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertar(nodo.derecha, valor);
        }
        nodo.altura = 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        int balance = getBalance(nodo);
        if (balance > 1 && valor < nodo.izquierda.valor) {
            return rotarDerecha(nodo);
        }
        if (balance < -1 && valor > nodo.derecha.valor) {
            return rotarIzquierda(nodo);
        }
        if (balance > 1 && valor > nodo.izquierda.valor) {
            nodo.izquierda = rotarIzquierda(nodo.izquierda);
            return rotarDerecha(nodo);
        }
        if (balance < -1 && valor < nodo.derecha.valor) {
            nodo.derecha = rotarDerecha(nodo.derecha);
            return rotarIzquierda(nodo);
        }
        return nodo;
    }

    private NodoAVL rotarDerecha(NodoAVL y) {
        NodoAVL x = y.izquierda;
        NodoAVL T2 = x.derecha;
        x.derecha = y;
        y.izquierda = T2;
        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;
        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;
        return x;
    }

    private NodoAVL rotarIzquierda(NodoAVL x) {
        NodoAVL y = x.derecha;
        NodoAVL T2 = y.izquierda;
        y.izquierda = x;
        x.derecha = T2;
        x.altura = Math.max(altura(x.izquierda), altura(x.derecha)) + 1;
        y.altura = Math.max(altura(y.izquierda), altura(y.derecha)) + 1;
        return y;
    }

    private int altura(NodoAVL N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    private int getBalance(NodoAVL N) {
        if (N == null)
            return 0;
        return altura(N.izquierda) - altura(N.derecha);
    }

    // Método para buscar un nodo
    public boolean buscar(int valor) {
        return buscar(raiz, valor) != null;
    }

    private NodoAVL buscar(NodoAVL nodo, int valor) {
        if (nodo == null || nodo.valor == valor) {
            return nodo;
        }
        if (valor < nodo.valor) {
            return buscar(nodo.izquierda, valor);
        } else {
            return buscar(nodo.derecha, valor);
        }
    }

    // Método para eliminar un nodo
    public void eliminar(int valor) {
        raiz = eliminar(raiz, valor);
    }

    private NodoAVL eliminar(NodoAVL nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }
        if (valor < nodo.valor) {
            nodo.izquierda = eliminar(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = eliminar(nodo.derecha, valor);
        } else {
            if (nodo.izquierda == null) {
                return nodo.derecha;
            } else if (nodo.derecha == null) {
                return nodo.izquierda;
            }
            nodo.valor = minValor(nodo.derecha);
            nodo.derecha = eliminar(nodo.derecha, nodo.valor);
        }
        nodo.altura = 1 + Math.max(altura(nodo.izquierda), altura(nodo.derecha));
        int balance = getBalance(nodo);
        if (balance > 1 && getBalance(nodo.izquierda) >= 0) {
            return rotarDerecha(nodo);
        }
        if (balance > 1 && getBalance(nodo.izquierda) < 0) {
            nodo.izquierda = rotarIzquierda(nodo.izquierda);
            return rotarDerecha(nodo);
        }
        if (balance < -1 && getBalance(nodo.derecha) <= 0) {
            return rotarIzquierda(nodo);
        }
        if (balance < -1 && getBalance(nodo.derecha) > 0) {
            nodo.derecha = rotarDerecha(nodo.derecha);
            return rotarIzquierda(nodo);
        }
        return nodo;
    }

    private int minValor(NodoAVL nodo) {
        int minv = nodo.valor;
        while (nodo.izquierda != null) {
            minv = nodo.izquierda.valor;
            nodo = nodo.izquierda;
        }
        return minv;
    }

    // Método para imprimir el árbol
    public void imprimir() {
        imprimir(raiz, "", true);
    }

    private void imprimir(NodoAVL nodo, String indentacion, boolean ultimo) {
        if (nodo != null) {
            System.out.println(indentacion + (ultimo ? "└── " : "├── ") + nodo.valor);
            imprimir(nodo.izquierda, indentacion + (ultimo ? "    " : "│   "), false);
            imprimir(nodo.derecha, indentacion + (ultimo ? "    " : "│   "), true);
        }
    }
    
}
