
package eje_pila1;

public class pilaEnlazada {
    private nodoDPila inicio;
    private int tamaño;
    
    
    public void Pila(){
        inicio = null;
        tamaño = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public String[] Separar(String cadena){
        String[] cadenas = cadena.split("");
        
        String array[] = new String[cadenas.length];
        int contar = 0;
        for (int i = 0; i < cadenas.length; i++) {
            array[i] = cadenas[i];
            contar = cadenas.length;

        }
        
        return array;
    }
    
    
    public int getTamanio(){
        return tamaño;
    }
    
    
    
    public void apilar(String valor){
        nodoDPila nuevo = new nodoDPila();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            inicio = nuevo;
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    } 
     
    public void retirar(){
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            tamaño--;
        }
    }
    
     
    public String cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("LA PILA SE ENCUENTRA VACIA.");
        }
    }
    
    public void listar(){
        
        nodoDPila aux = inicio;
        
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    
    public void imprimelista(){
        
        
        nodoDPila aux = inicio;
        
        while(aux != null){
           
            
            System.out.print(aux.getValor());
            
            aux = aux.getSiguiente();
            
        }
        
    } 
    
}
