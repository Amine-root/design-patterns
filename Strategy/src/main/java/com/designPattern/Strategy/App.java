package com.designPattern.Strategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Context context = new Context();
        context.effectuerOperation(1);
    }
}
