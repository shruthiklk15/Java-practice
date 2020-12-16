class Program19{
    public static void main(String[] args) {
        double acc_bal = 20000.00;
        double amt = 2000.00;
        for (int i = 2000;i<=20000;i++){
            acc_bal = acc_bal - amt;
            System.out.println("withdraw success" +i);
        }
        System.out.println("account balance "+acc_bal);
    }
}