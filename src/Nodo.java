public class Nodo {

    // proprietà del vertice
    private Nodo sx;
    private Nodo dx;
    private int valore;

    //costruttore
    Nodo(int valore){
        sx = null;
        dx = null;
        this.valore = valore;
    }

    int getValore(){
        return this.valore;
    }

    Nodo getFiglioDestro(){
        return this.dx;
    }

    Nodo getFiglioSinistro(){
        return this.sx;
    }

    public Boolean esisteFiglioDestro(){
        return (this.dx != null);
    }

    public Boolean esisteFiglioSinistro(){
        return (this.sx != null);
    }

    public void setFiglioSinistro(Nodo nodo){
        this.sx= nodo;
    }

    public void setFiglioDestro(Nodo nodo){
        this.dx= nodo;
    }
}
