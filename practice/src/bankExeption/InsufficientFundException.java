package bankExeption;

public class InsufficientFundException extends Exception{

    public InsufficientFundException( String msg){
         super(msg);
     }

}