#include<stdio.h>
int main()
{
    char c;
    scanf("%c",&c);
    if((c>='a' && c<='z') || (c>='A' && c<='Z'))
    {
        printf("Alphabet");
    }
    else
    {
        printf("No");    
    }
    return 0;
}