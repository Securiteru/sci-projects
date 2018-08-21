package curslive;

public class ContBancar  {
    private String IBAN;
    private int balanta;

    public ContBancar(String IBAN, int balanta) {
        this.IBAN = IBAN;
        this.balanta = balanta;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public int getBalanta() {
        return balanta;
    }

    public void setBalanta(int balanta) {
        this.balanta = balanta;
    }


}
2