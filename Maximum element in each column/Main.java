#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
      cin>>a[i][j];
  }
  for(j=0;j<n;j++)
  {int max=0;
  for(i=1;i<m;i++)
  {
     if(a[i][j]>max)
      max=a[i][j];
   }
   cout<<max<<endl;
  }
}  