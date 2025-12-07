class P1
{
    public static void main(String[] args)
    {
        System.out.println("enter the number: ");
        int n = 4;
        long factorial = 1;
        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
