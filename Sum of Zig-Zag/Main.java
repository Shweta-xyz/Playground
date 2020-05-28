#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,sum=0;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(j=0;j<n;j++)
  {
      sum+=a[0][j]+a[m-1][j];
   }
  if(m==n)
  {for(i=1;i<m-1;i++)
     sum+=a[i][n-1-i];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum<<endl;
}    