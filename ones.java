/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void printNumbers(int start,int n,int m){
        int  count=0;
        String str= "" +m;
        char ch = str.charAt(0);
        for(int i=start;i<=n;i++){
            str = "";
            str =str+i;
            if(i==m || str.indexOf(ch) >= 0)
               count++;
        }
        System.out.print(count);
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the start range:");
	    int start=sc.nextInt();
	    System.out.print("Enter the end range:");
	    int n=sc.nextInt();
	    int m=1;
	    System.out.print("output:");
		printNumbers(start,n,m);
	}
}
