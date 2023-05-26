import java.util.*;

public class MainAlbero {
    public static void main(String[] args) {

        int rnd = (int) (Math.random() * 100 + 1);
        AlberoBinario albero = new AlberoBinario(new Nodo(rnd));

        System.out.println("ALBERO CREATO CORRETTAMENTE");
        inserimentoRandom(albero);
        System.out.print("\nSTAMPE");
        System.out.print("\nStampa in-order: ");
        albero.inOrder(albero.getRadice());
        System.out.print("\nStampa pre-order: ");
        albero.preOrder(albero.getRadice());
        System.out.print("\nStampa post-order: ");
        albero.postOrder(albero.getRadice());
    }

    public static void inserimentoRandom(AlberoBinario albero){
        int quantita = (int) (Math.random() * 10 + 1);

        System.out.println("La radice dell'albero è " + albero.getRadice().getValore() + ", farò " + quantita + " inserimenti...");

        int inseriti[] = new int[quantita];

        int valoreRandom = -1;
        Boolean contenuto = false;
        for(int i=0; i<quantita; i++) {
            do{
                valoreRandom = (int) (Math.random() * 20 + 1);
                contenuto = false;

                for(int x: inseriti){
                    if(x==valoreRandom)
                        contenuto = true;
                }
                if(contenuto){
                    System.out.println("!!!! Generato numero doppio ("+valoreRandom+")");
                }
            }while(contenuto);

            System.out.println(i+1 +" inserimento) Inserisco il valore " + valoreRandom + " nell'albero");
            inseriti[i] = valoreRandom;
            albero.inserimento(new Nodo(valoreRandom), albero.getRadice());
        }
    }
}
