public class b {
    public static void main(String[] args) {
        
        int i,j,k;
        for(i=1;i<=3;i++)
        {
            for(j=3;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
