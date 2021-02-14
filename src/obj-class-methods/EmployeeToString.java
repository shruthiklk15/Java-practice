
public class EmployeeToString{
        String empName;
        EmployeeToString(String empName){
            this.empName=empName;
        }
        @Override
        public String toString(){
            return this.empName;
        }

        public static void main(String[] args) {
            EmployeeToString e1 = new EmployeeToString("Employee name is Shruthi");
            System.out.println(e1.toString());
        }
}
