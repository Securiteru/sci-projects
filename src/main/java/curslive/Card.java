package curslive;

public class Card {
    private String expiryDate;
    private int pin;
    private int contBancarCount;

    private ContBancar [] conturi= new ContBancar[5];

    public void addContBancar(ContBancar conty){
        conturi[contBancarCount++]=conty;
    }

    public Card(String expiryDate, int pin) {
        this.expiryDate = expiryDate;
        this.pin = pin;
    }

    public ContBancar[] getConturi() {
        return conturi;
    }
}
