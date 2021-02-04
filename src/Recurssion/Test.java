public class Test {
    public static void even(int x){
        if(x>1){
            System.out.println(x+" ");
            even(x-2);
        }
        System.out.println(x+1+" ");
    }
    public static void main(String[] args) {
        even(10);
    }
}

//binary to decimal,fibonacci, factorial