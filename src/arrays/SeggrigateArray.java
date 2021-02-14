public class SeggrigateArray{
    public static void main(String[] args){
        
        int[] ay={0,1,0,1,0,0,1,0,1,0};
        int n=ay.length;
        int zeroCount=0;
        for(int i:ay){
            if(i==0){

                zeroCount++;
            }
        }
        for (int i=0;i<n;i++){
            if(i<zeroCount){
    
                ay[i] =0;
            }
            else{
    
                ay[i] =1;
            }
        }
        for(int i:ay){
            System.out.println(i+" ");
        }      
    }
    
}