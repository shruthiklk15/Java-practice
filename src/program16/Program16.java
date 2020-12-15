class Program16{
    public static void main(String[] args){
        char grade = 'c';
        switch (grade) {
            case 'A'|'a':
                System.out.println("FCD");
                break;
            case 'B':
            case 'b':
                System.out.println("FC");
                break;
            case 'C'|'c':
                System.out.println("SC");
                break;
            case 'D'|'d':
                System.out.println("Just pass");
                break;
            case 'E'|'e':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Grade could not match any");
        }
    }
}