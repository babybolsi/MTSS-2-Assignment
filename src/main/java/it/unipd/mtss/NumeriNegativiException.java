////////////////////////////////////////////////////////////////////
// FRANCESCO BASSANI 2042375
// IRENE CIRIOLO 2043682
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumeriNegativiException extends Exception {
    public NumeriNegativiException(){
        super("I numeri negativi non sono accettati");
    }
}
