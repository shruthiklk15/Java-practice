public class MarksCompare{
    public static void main(String[] args){
        
        int[] shariq={7,9,9,5};
        int[] ayesha={9,2,9,5};

        // int x=shariq.length;
        // int y=ayesha.length;
        int shariqCount=0;
        int ayeshaCount2=0;

        for (int i=0;i<shariq.length;i++){
            if(shariq[i]>ayesha[i]){
    
               ShariqCount++;
            }
            else if(ayesha[i]>shariqCount[i]){
                ayeshaCount++;
            }
        }
        if(ShariqCount>ayeshaCount) {
            System.out.println("Shariq scored more "+ shariqCount);
        }
        else if(ayeshaCount>ShariqCount){
            System.out.println("Ayesha scored more "+ ayeshaCount);
        }
        else{
            System.out.println("Its a tie");

        }
    }
    
}