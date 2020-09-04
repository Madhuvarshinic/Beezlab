/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
#include <conio.h>

int main()
{
    int x,y;
    printf("Enter x and y");
    scanf("%d%d",&x,&y);
    printf("\nBefore Swapping \n x=%d\n y=%d",x,y);
    x=x+y;
    y=x-y;
    x=x-y;
    printf("\nAfter Swapping \n x=%d\n y=%d",x,y);

    return 0;
}
