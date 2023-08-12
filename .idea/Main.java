
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int refil = 1300;
        int bonus = refil / 100;
        if (refil < 1000) {
            balance = balance + refil;
        } else {
            balance = balance + refil + bonus;
        }
        System.out.println(balance);

    }
}