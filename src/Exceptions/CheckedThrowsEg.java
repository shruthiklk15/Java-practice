class CheckedThrowsEg{
    public static void disp() throws InterruptedException{
        for(int i=0;i<=3;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
    public static void main(String[] args) {
        try{
            disp();
        }
        catch(InterruptedException e){
            System.out.println("handled");
        }
    }
}