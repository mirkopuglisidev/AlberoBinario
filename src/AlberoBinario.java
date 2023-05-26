public class AlberoBinario {

    private Nodo radice;

    AlberoBinario(Nodo nodo){
        this.radice = nodo;
    }

    public void inserimento(Nodo nodo, Nodo sorgente){
        if(nodo.getValore() < sorgente.getValore()) {
            if(!sorgente.esisteFiglioSinistro())
                sorgente.setFiglioSinistro(nodo);
            else{
                inserimento(nodo, sorgente.getFiglioSinistro());
            }
        }
        else if(nodo.getValore() > sorgente.getValore()) {
            if(!sorgente.esisteFiglioDestro())
                sorgente.setFiglioDestro(nodo);
            else{
                inserimento(nodo, sorgente.getFiglioDestro());
            }
        }
    }

    public Nodo getRadice(){
        return radice;
    }

    public void inOrder(Nodo nodo){
        if(nodo.esisteFiglioSinistro()) inOrder(nodo.getFiglioSinistro());
        System.out.print(nodo.getValore()+" ");
        if(nodo.esisteFiglioDestro())inOrder(nodo.getFiglioDestro());
    }
}