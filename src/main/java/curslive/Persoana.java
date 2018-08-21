package curslive;

public class  Persoana {

    private String nume;
    private int cnp;
    private int cardCount;
    private Card [] carduri = new Card[3];


    public Persoana(String nume, int cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCNP() {
        return cnp;
    }

    public void setCNP(int CNP) {
        this.cnp = CNP;
    }

    public void addCard(Card cardy){
        carduri[cardCount++]=cardy;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", cnp=" + cnp +
                ", cardCount=" + cardCount +
                '}';
    }

    public Card[] getCarduri() {
        return carduri;
    }
}
