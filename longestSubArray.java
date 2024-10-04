public class longestSubArray {
    public static void main(String[] args) {
        int a[]={2,3,5,1,1,3};
        int k=5,count=1;
        for(int i=0; i<a.length; i++)
        {
            for(int j=i; j<a.length; j++)
            {
                if(a[i]+a[j]==k)
                {
                    count++;
                    System.out.println(count);
                    System.out.println(a[i]+" "+a[j]);
                    //System.out.println(a[j]+" ");
                }
            }
        }
    }
}
