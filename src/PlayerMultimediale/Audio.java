package PlayerMultimediale;

public class Audio extends ElementoMultimediale{

    private final String autore;

    public Audio(String titolo, int durata, String autore){
        super(titolo, durata);
        this.autore = autore;
    }

}
