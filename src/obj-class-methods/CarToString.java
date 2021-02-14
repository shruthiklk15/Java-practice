public class CarToString{
    @Override
    public String toString(){
        return "car is moving";
    }

    public static void main(String[] args)
    {
        Car c = new Car();
        System.out.println(c);
    }
}