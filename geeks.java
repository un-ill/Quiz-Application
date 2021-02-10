class geeks
{
 public static void main(String []arg)
  {
     try
     {
       System.out.println(1/0);
      }
   //  System.out.println("hello geeks");
    catch(ArithmeticException e)
     {
        System.out.println("Welcome");
      }
  }
}
