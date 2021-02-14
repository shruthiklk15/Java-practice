public class StudentEqualsMethod{
    int age;
    StudentEqualsMethod(int age){
        this.age=age;
    }

    // @Override
    public boolean equals(Object obj){
        // StudentEqualsMethod s = (StudentEqualsMethod) obj;
        return this.age == age;
    }

    public static void main(String[] args) {
        StudentEqualsMethod s1 = new StudentEqualsMethod(20);
        StudentEqualsMethod s2 = new StudentEqualsMethod(20);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}