package PlayerMultimediale2;

public class Audio2 extends ElementoMultimediale2 implements Riproduci2 {

   private String autore;
   private int durata;
   private int volume;
 final private int volMax = 10;
 final private int volMin = 0;

     public Audio2(String titolo, String autore, int durata, int volume){
        super(titolo);

        this.autore = autore;
        this.durata = durata;
        this.volume = volume;
        }


    @Override
    public void play() {
        System.out.println(getTitolo());
        for (int i = 1; i < durata; i++) {
            System.out.println("!");
        }
    }

   /* public void regolaVolume() {
        if (volume >= volMax) {
            System.out.println("Il volume è al massimo");
        } else if (volume <= volMin) {
            System.out.println("Il volume è al minimo");
        } else {
            System.out.println("Il volume è: " + volume);
        }
    } */

    public void alzaVolume() {
        if (volume < volMax) {
            volume++;
            System.out.println("Volume aumentato a: " + volume);
        } else {
            System.out.println("Il volume è già al massimo");
        }
    }

   public  void abbassaVolume(){
       if (volume > volMin) {
           volume--;
           System.out.println("Volume diminuito a: " + volume);
       } else {
           System.out.println("Il volume è già al minimo");
       }
   }
}