import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scanner.nextInt();
        System.out.println("Enter values");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();

        }
        int result=0;
        for(int i=0;i<n;i++)
        {
            result=result+(A[i]%3);
        }
        int ans=(result%3==0)?1:0;
        System.out.println(ans);
    }
}