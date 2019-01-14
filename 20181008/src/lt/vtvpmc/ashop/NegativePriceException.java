package lt.vtvpmc.ashop;

public class NegativePriceException extends RuntimeException  {

    // extends RuntimeException gaudo visas sistemines klaidas (tame tarpe ir Exception)
    // extends Exception gaudo numatomas klaidas + privalu rasyti prie metodo


    //pirmas variantas (uzduodam kad zinute dar reikes irasyti (kaip stringa))
    public NegativePriceException (String message) {
        super(message);
    }

    //antras variantas (uzduodam kad zinute jau irasyta (o metodo skliaustai bus tusti)
    public NegativePriceException () {
        super("Antro varianto zinute: kaina negali buti neigiama");
    }
}
