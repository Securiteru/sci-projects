package curslive;

public class Bancomat {

    private ContBancar[] conty2= new ContBancar[10];
    private int contCount;



    public void getRequestedSum(ContBancar conty, int withdrawl){
        Chitanta chity=new Chitanta();
        System.out.println(withdrawl+"WITHDRAWL");
        System.out.println(conty.getBalanta()+"CONTY");
        System.out.println(chity.message(withdrawl, conty.getBalanta()));
    }


}
