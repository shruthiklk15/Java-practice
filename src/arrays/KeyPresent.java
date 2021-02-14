public class KeyPresent{

    public static void main(String[] args){

        int k=3;
        
        int[] ay={9,2,9,5,33,4,6,7,788,4};
        for (int i=0;i<ay.length;i++){

            if(ay[i]==key){

                System.out.println(i);
                return;
            }
             else{
                System.out.println("-1");
             }
        }
    }
}
   