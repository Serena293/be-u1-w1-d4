package PlayerMultimediale2;

public class Immagine extends ElementoMultimediale2 implements Luminosità {

    int l;

    public Immagine (String titolo, int l){
        super(titolo);

        this.l = l;

    }

    @Override
    public void regolaLum() {
        System.out.println("Regola luminosità, scegli un valore tra 1 e 10");

        for(int i = 1; i<=l; i++ ){
            System.out.println("*");
        }

    }

    public  void  show(){
        System.out.println(getTitolo());
    }
}
