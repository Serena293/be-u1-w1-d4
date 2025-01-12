package PlayerMultimediale2;

public  class Video2 extends ElementoMultimediale2 implements Riproduci2, Luminosità{

    int d;
    int volume;
    int lum;

    public Video2(String titolo, int d, int volume, int lum) {
        super(titolo);
        this.d = d;
        this.volume = volume;
        this.lum = lum;
    }


    @Override
    public void play() {
        System.out.println(getTitolo());
        for (int i = 1; i < d; i++) {
            System.out.println("!");
        }
    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void regolaLum(){
        System.out.println("Regola luminosità, scegli un valore tra 1 e 10");
               for(int i = 1; i<=lum; i++ ){
            System.out.println("*");
        }
    }


}