public class basics 
{
    public static void main(String[] args) 
    {
        System.out.println("Recap");

        int result = add(3, 5);
        System.out.println(result);

        subtract(12, 6);

       // int multiple = mult(7, 2);

      //  System.out.println("The method mult was called and it returned 7 * 2. Which = " + multiple);

    }
 
 public static int add(int a, int b) 
    {
        return a + b;
    }

    public static void subtract(int c, int d)
    {
        System.out.println(c - d); 
    }

 /*
    

    public static int mult(int e, int d)
    {
        return e * d;
    }
        */
}

