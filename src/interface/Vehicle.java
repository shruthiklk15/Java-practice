// interface vehicle
// {
//     void vehicle();
// }

// class car implements vehicle{
//     public void vehicle()
//     {
//         System.out.println("Travelling vehicle using car");
//     }
// }

class person
{
    void travel(vehicle arg)
    {
        System.out.println("travelling vehicle");
        arg.vehicle();
    }
}
class mainclass3
{
    public static void main(String[] args) {
        person p1=new person();
        p1.travel(new car());
    }
}