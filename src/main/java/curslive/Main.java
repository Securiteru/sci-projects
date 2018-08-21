package curslive;

public class Main {
    public static void main(String[] args) {
        Persoana persy=new Persoana("Adrian", 199999999);
        Card cardy=new Card("May, 2018", 1632);
        ContBancar conty=new ContBancar("33242424242", 45);
        Bancomat banky= new Bancomat();

        persy.addCard(cardy);
        cardy.addContBancar(conty);

        banky.getRequestedSum(persy.getCarduri()[0].getConturi()[0], 66);




    }

}
