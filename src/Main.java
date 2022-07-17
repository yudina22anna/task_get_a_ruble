public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int bonus;
        if (refill<1000){
            bonus = 0;
        }
        else {
            bonus = refill/100;
        }
        int total_balance = balance + refill + bonus;
        System.out.println(total_balance);
    }
}
