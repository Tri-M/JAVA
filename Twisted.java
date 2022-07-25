import java.util.*;
class Main {
public static void main(String args[] ) throws Exception {
Scanner kb=new Scanner(System.in);
int n=kb.nextInt();
int ni=0,l=0,r1=0,r2=n-1,c1=0,c2=n-1;
int[][] a=new int[n][n];
int[] b=new int[n*n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=kb.nextInt();
b[ni]=a[i][j];
++ni;
}
}
ni=0;
Arrays.sort(b);
while(l<+     n*n)
{for(int i=c1;i<=c2;i++)
{a[r1][i]=b[ni];
l++;
ni++;
}
for(int j=r1+1;j<=r2;j++)
{
a[j][c2]=b[ni];
l++;
ni++;
}
for(int i=c2-1;i>=c1;i--)
{
a[r2][i]=b[ni];
l++;
ni++;
}
for(int j=r2-1;j>=r1+1;j--)
{
a[j][c1]=b[ni];
++l;
++ni;
}
r1++;
r2--;
c1++;
c2--;
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(""+a[i][j]+" ");
}
System.out.println("");
}
}
}
