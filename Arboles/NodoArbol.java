/**
 * Clase nodo, que depende de "Recorrido"
 * Contiene: nodoArbol, dato del nodo, comprueba si es binario o no, asigna un primer hijo y nodo siguiente hermano
 */
public class NodoArbol <T> {                       
    private T dato;                                 
    private boolean esBinario = false;              
    private NodoArbol <T> primerHijo;               
    private NodoArbol <T> siguienteHermano;         
  
    /**
     * Este es el constructor que inicializa el nodo con el dato proporcionado
     * @param dato
     */
    public NodoArbol (T dato) {
      this.dato = dato;                             
      primerHijo = null;                            
      siguienteHermano = null;
    }
  
    /**
     * Este metodo como tal agrega un hijo y si ya tiene asignado un hijo marcará un error y si ya existe un hijo, lo asigna como
     * otro hijo pero asignado como siguiente hermano
     * @param hijo
     */
    public void agregarHijo (NodoArbol <T> hijo) {
      if (primerHijo == null) {                         
        primerHijo = hijo;
      } else {
        NodoArbol<T> hermano = this.primerHijo;

        if (esBinario) {                                                                            
          if (hermano.siguienteHermano != null) {                                                   
            System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());	
          } else {
            hermano.siguienteHermano = hijo;
          }
        } else {                                                                                    
          while (hermano.siguienteHermano != null) {                                                
            hermano = hermano.siguienteHermano;                                                     
          }
          hermano.siguienteHermano = hijo;
        }      
      }
    }
  
    /**
     * Nos devolvera el valor del primer nodo hijo
     * @return
     */
    public NodoArbol<T> obtenerPrimerHijo () {                  
      return primerHijo;
    }
  
    /**
     * Nos devolverá el siguiente nodo hermano
     * @return
     */
    public NodoArbol<T> obtenerSiguienteHermano () {           
      return siguienteHermano;
    }
  
    /**
     * Devuelve el dato almacenado del nodo
     * @return
     */
    public T getDato () {                                       
      return dato;
    }
  
    /**
     * Este metodo devolvera un "true" o "false" si los nodos son partes del arbol binario
     * @return
     */
    public boolean esBinario () {                            
      return esBinario;                                      
    }
  
    public void setEsBinario (boolean esBinario) {           
      this.esBinario = esBinario;
    }
  
    /**
     * A partir de aca se implementan los metodos de impresion de ordenamiento, sea prefijo, infijo y posfijo, con su respectivo
     * procedimiento
     */
    public void imprimirEnPrefijo() {
      System.out.print(dato + "\t");
      NodoArbol<T> hijo = primerHijo;
  
      while (hijo != null) {                                       
        hijo.imprimirEnPrefijo();                                  
        hijo = hijo.siguienteHermano;                             
      }                                                            
    }
  
    public void imprimirEnInfijo() {
      NodoArbol<T> hijo = primerHijo;
  
      if (hijo != null) {
        hijo.imprimirEnInfijo();
      }
  
      System.out.print(dato + "\t");
      while (hijo != null) {
        hijo = hijo.siguienteHermano;
        if (hijo != null) {
          hijo.imprimirEnInfijo();
        }
      }
    }
  
    public void imprimirEnPosfijo() {
      NodoArbol<T> hijo = primerHijo;
  
      while (hijo != null) {
        hijo.imprimirEnPosfijo();
        hijo = hijo.siguienteHermano;
      }
  
      System.out.print(dato + "\t");
    }
  }