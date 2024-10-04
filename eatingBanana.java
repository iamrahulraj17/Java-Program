public class eatingBanana {
    public static void main(String[] args) {
        int n=4,h=7,a[]={7,15,6,3},t;
        for(int i=0; i<15; i++)
        {
            t=0;
            for(int j=0; j<n; j++)
            {
                t += Math.ceil((double) a[j] / (double) i);
            }
            if(t==h)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
