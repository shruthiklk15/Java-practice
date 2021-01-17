class FindNumInArray
{
    public static void main(String[] args) {
        int[] a = {222,20,30,30,40};
        int num = 10;
        boolean isFound = false;
        for (int i=0; i<a.length; i++)
        {
            if(a[i]==num)
            {
                isFound = true;
                System.out.println("Number is present in an array, The given nmber is "+a[i]);
            }
            // else {
            //     System.out.println("Number is not present"); // this will print as many times as for loop iterates
            // }
        }
        if(isFound==false){
            System.out.println("Number is not present");
        }
   }
}