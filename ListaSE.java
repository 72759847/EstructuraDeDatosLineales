package edl;

public class ListaSE<T>
{
    private NodoSE<T> ini;
    private int size;
    public ListaSE(){
        ini = new NodoSE<T>();
        size = 0;
    }

    public void add(T valor){
        NodoSE<T> aux = ini;
        while(!aux.vacio()){
            aux = aux.getSig();
        }
        aux .setDato(valor);
        aux.setSig(new NodoSE<T>());
        size++;
    }

    public void add2 (T valor){
        add2(valor,ini);
    }

    private void add2(T valor ,NodoSE<T> ac){
        if(ac.vacio()){
            ac.setDato(valor);
            ac.setSig(new NodoSE<T>());
        }else{
            add2(valor,ac.getSig());
        }
    }
}
