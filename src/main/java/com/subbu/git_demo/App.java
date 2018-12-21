package com.subbu.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public void addData(String data) {
		System.out.println("data..."+data);
		if(data.equals(Constant.data)) {
			System.out.println("venkat..");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
