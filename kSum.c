#include<stdio.h>
int main()
{
    int n,m,i;
    scanf("%d%d",&n,&m);
    int a[n],sum=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        if(m>0)
        {
            sum+=a[i];
            m--;
        }
    }
    printf("%d",sum);
    return 0;
}