package PlayerMultimediale2;


public abstract class ElementoMultimediale2 {
    private static String titolo;

    public ElementoMultimediale2(String titolo) {
        ElementoMultimediale2.titolo = titolo;
    }

public String getTitolo(){
    System.out.println(titolo);
    return  titolo;
}

public void setTitolo(String titolo){
        ElementoMultimediale2.titolo = titolo;
}
}


