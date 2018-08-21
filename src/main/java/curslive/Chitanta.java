package curslive;

public class Chitanta {
   private boolean status;


    public String message(int withdrawl, int funds){
       return (withdrawl>funds) ? "Error, not enough funds available, you currently have "+funds+" and you tried to withdraw "+withdrawl+"." : "Operation was a success!";
   }
}
