import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainAlbero {
    public static void main(String[] args) {

        int rnd = (int) (Math.random() * 100 + 1);
        AlberoBinario albero = new AlberoBinario(new Nodo(rnd));

        System.out.println("ALBERO CREATO CORRETTAMENTE");
        inserimentoRandom(albero);
        System.out.println("Stampa in-order: ");
        albero.inOrder(albero.getRadice());
    }

    public static void inserimentoRandom(AlberoBinario albero){
        int quantita = (int) (Math.random() * 10 + 1);

        System.out.println("La radice dell'albero è " + albero.getRadice().getValore() + ", farò " + quantita + " inserimenti...");

        int inseriti[] = new int[quantita];

        int valoreRandom = -1;
        for(int i=0; i<quantita; i++) {
            do{
                valoreRandom = (int) (Math.random() * 100 + 1);
            }while(Arrays.asList(inseriti).contains(valoreRandom));

            System.out.println(i+1 +" inserimento) Inserisco il valore " + valoreRandom + " nell'albero");
            inseriti[i] = valoreRandom;
            albero.inserimento(new Nodo(valoreRandom), albero.getRadice());
        }
    }
}
