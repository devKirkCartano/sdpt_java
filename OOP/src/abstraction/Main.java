package abstraction;



public class Main {

    public static void main(String[] args) {

        Bank b;
        b = new BDO();
        System.out.println("BD0 rate of Interest : " + b.getInterestRate());
        b = new DBP();

        System.out.println("DBP rate of Interest : " + b.getInterestRate());
    }
}
