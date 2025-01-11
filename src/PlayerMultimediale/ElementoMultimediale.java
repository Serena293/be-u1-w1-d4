package PlayerMultimediale;
//Questa è la superclasse dalla quale sarà possibile estendere gli altri elementi
//è astratta in modo tale che non sarà possibile generere ElementoMultimediale, che è troppo generico

public abstract class ElementoMultimediale {
    private static String nome;
   private static int durata;
    private int volume;

    public ElementoMultimediale(String nome, int durata) {
        this.nome = nome;
       // this.durata = durata;
    }

    public void play(){
        System.out.println(nome);
    for(int i = 0; i< durata; i++){
        System.out.println("!");
    }
    }
    public void setVolume(int vol){
        if(vol > 0 && vol <= 10){
            this.volume = vol;
        } else if (vol < 0) {
            System.out.println("Il volume è al minimo");
        } else {
            System.out.println("Il volume è al massimo");
        }
}}
