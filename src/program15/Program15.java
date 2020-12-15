class Program15{
    public static void main(String[] args){
        double acc_bal = 10000.00;
        double amount_entered = 50000.00;
        double expected_pin = 1234;
        double entered_pin = 134;
        if( expected_pin==entered_pin){
            if(acc_bal>amount){
                System.out.println("Withdraw successfull");
            }
            else {
                System.out.println("Insufficient Balance.The available balance is "+acc_bal);
            }
        }
        else {
            System.out.println("Invalid pin.Please enter the correct pin");
        }
       
    }
}