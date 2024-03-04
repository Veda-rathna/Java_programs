package Final_keyword;

class Excep6

{

    public static void main(String args[])

    {

        try // outer try block

        {

            try // inner try block1

            {

                System.out.println("going to divide");

            }

            catch (ArithmeticException e)

            {

                System.out.println(e);

            }

            try // inner try block2

            {

                int a[] = new int[5];

                a[5] = 4;

            }

            catch (ArrayIndexOutOfBoundsException e) // // catch block of inner try block2

            {

                System.out.println(e);

            }

        } // outer try

        catch (Exception e) // catch block of outer

        {

            System.out.println("normal flow of execution");

        }

    }

}