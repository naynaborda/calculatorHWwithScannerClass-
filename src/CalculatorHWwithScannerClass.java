import java.util.Scanner;

public class CalculatorHWwithScannerClass {
    //04/07/2020
    //learning git hub

    //implement scanner class in calculator programme
    //Return type with parameter
    public Double plusMethod(double a, double b, double c, double d)
    {
        return (a + b + c + d);
    }

    //Return type with  parameter
    public float minusMethod(float x, float y, float z)
    {
        return (x - y - z);
    }

    //no return type with parameter
    public void multiplyMethod(long o, long p, long q, long r)
    {

        System.out.println("Multiplication\t=" + "\t" + (o * p * q *r) );
    }

    //no Return Type with  parameter
    public static void dividedMethod(int e, int f)
    {
        System.out.println("Division\t\t=" + "\t" + (e / f));

    }

    //return type with parameter
    public String myName(String FirstName, String LastName) {
        return  FirstName + LastName;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorHWwithScannerClass calculation = new CalculatorHWwithScannerClass();

        System.out.print("Enter a ");
        Double a = scanner.nextDouble();
        System.out.print("Enter b ");
        Double b = scanner.nextDouble();
        System.out.print("Enter c ");
        Double c = scanner.nextDouble();
        System.out.print("Enter d ");
        Double d = scanner.nextDouble();
        System.out.println("Addition = " + calculation.plusMethod(a, b, c, d));



        System.out.print("Enter x ");
        float x = scanner.nextFloat();
        System.out.print("Enter y ");
        float y = scanner.nextFloat();
        System.out.print("Enter z ");
        float z = scanner.nextFloat();
        System.out.println("Subtration = " + calculation.minusMethod(x, y, z));

        System.out.print("Enter  o ");
        long o = scanner.nextLong();
        System.out.print("Enter p ");
        long p = scanner.nextLong();
        System.out.print("Enter q ");
        long q = scanner.nextLong();
        System.out.print("Enter r ");
        long r = scanner.nextLong();
        calculation.multiplyMethod(o, p, q, r);


        System.out.print("Enter e ");
        int e = scanner.nextInt();
        System.out.print("Enter f ");
        int f = scanner.nextInt();
        dividedMethod(e, f);


        System.out.print("Enter firstName ");
        String firstName = scanner.next();
        System.out.print("Enter lastName ");
        String lastName = scanner.next();
        System.out.println(calculation.myName("My Name is " + "Nayna ","Borda"));





    }
}


