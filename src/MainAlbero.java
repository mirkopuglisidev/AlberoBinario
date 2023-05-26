import java.util.*;

import static java.lang.Thread.sleep;

public class MainAlbero {
    public static void main(String[] args) throws InterruptedException {

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

    public static void inserimentoRandom(AlberoBinario albero) throws InterruptedException {
        final int RANDOM_MAX = 10;

        int quantita = (int) (Math.random() * RANDOM_MAX + 1);

        System.out.println("La radice dell'albero è " + albero.getRadice().getValore() + ", farò " + quantita + " inserimenti...");

        int inseriti[] = new int[quantita];

        int valoreRandom = -1;
        Boolean contenuto = false;
        for(int i=0; i<quantita; i++) {
            do{
                valoreRandom = (int) (Math.random() * RANDOM_MAX + 1);
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
            sleep(1000);
            inseriti[i] = valoreRandom;
            albero.inserimento(new Nodo(valoreRandom), albero.getRadice());
        }
    }
}
