class FindNumInArray
{
    public static void main(String[] args) {
        int[] a = {222,20,30,30,40};
        int num = 10;
        for (int i=0; i<a.length; i++)
        {
            if(a[i]==num)
            {
                System.out.println("Number is present in an array, The given nmber is "+a[i]);
            }
            else {
                System.out.println("Number is not present");
            }
        }
   }
}