import java.util.ArrayList;



public class Carrito implements Interface {

    ArrayList<Elemento>lista = new ArrayList<>();
    
    @Override
    public ArrayList<Elemento> agrega(Elemento element) {
        lista.add(element);
        return lista;
    }

    @Override
    public int numeroDeElementos() {
        return lista.size();
    }
    public double importeTotal(){
        double importe = 0;

        for (Elemento elemento : lista) {
            importe += elemento.getPrecio() * elemento.getCantidad();
        }

        return importe;
    }
    @Override
    public String toString() {
        String resultado = "";
        
        for (Elemento elemento : lista) {
            resultado += elemento.toString() + "\n";
        }
        return resultado;
    }

    
}
