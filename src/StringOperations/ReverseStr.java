class ReverseStr{
    public static void main(String[] args) {
        String s="abcd";
        for (int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
    }
}