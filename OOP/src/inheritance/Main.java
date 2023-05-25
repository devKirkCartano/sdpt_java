package inheritance;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("John", "Male", 18);


        Person t = new Toddler("Alenere","Female",2, "Ball");
        Person k = new Kid("jaymar","male", 5, "Tennis", 1);

        p.checkStatus();
        t.checkStatus();
        k.checkStatus();
        
        Toddler t1 = new Kid("Mar","male", 5, "Tennis", 5);
        t1.checkStatus();


    }
}
