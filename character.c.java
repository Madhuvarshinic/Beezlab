/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    String str = "Beezlab into Automation";
	    int count=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)!=' ')
	        count++;
	    }
		System.out.println("Number of Characters:"+count);
	}
}
