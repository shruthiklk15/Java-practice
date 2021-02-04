public class EvenNumbers {
    public static void even(int x, int n){
        if(x<=n){
            System.out.println(x+" ");
            even(x+2,n);
        }
    }
    public static void main(String[] args) {
        even(2,20);
    }
}