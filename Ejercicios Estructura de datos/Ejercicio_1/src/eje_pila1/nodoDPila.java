
package eje_pila1;

public class nodoDPila {
    // VARIABLE DONDE LA CUAL SE VA GUARDAR EL VALOR.
    private String V;
    // VARIABLES PARA ENLAZAR EL NODO.
    private nodoDPila Siguiente;
    
     //CONSTRUCTOR DONDE INICIALIZA EL VALOR DE LAS VARIABLES.
    
    public void nodoDPila(){
        this.V = "";
        this.Siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public String getValor() {
        return V;
    }

    public void setValor(String valor) {
        this.V = valor;
    }

    public nodoDPila getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(nodoDPila siguiente) {
        this.Siguiente = siguiente;
    }
    
    
}
