package sez;

import sez.modb.Calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int sum;
        Calc calc = new Calc();
        sum = calc.doSum(5,7);
        System.out.println("Sum = "+sum);
    }
}