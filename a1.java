class B
{
   public static void main(String[] args)
   {
      C c1=new C();
    //  System.out.println(c1.a);       //CTE(Direct Access is restricted)
      System.out.println(c1.test());  //10;(Indirect Access)
   }
}