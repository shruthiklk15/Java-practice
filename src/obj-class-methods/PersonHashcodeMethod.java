class PersonHashCodeMethod{
    int age;
    PersonHashCodeMethod(int age){
        this.age=age;
    }

    public int hashCode(){
        return this.age;
    }

    public static void main(String[] args) {
        PersonHashCodeMethod p = new PersonHashCodeMethod(20);
        System.out.println(p.hashCode());
    }
}