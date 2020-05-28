#include <iostream>
using namespace std;
int main()
{
 int m,n;
  cin>>m>>n;
  int a[m][n],b[m][n],x[m][n];
  for(int i=0;i<m;i++)
{ for(int j=0;j<n;j++)
      cin>>a[i][j];
}
  for(int i=0;i<m;i++)
{ for(int j=0;j<n;j++)
      cin>>b[i][j];
}
  for(int i=0;i<m;i++)
  {for(int j=0;j<n;j++)
    {  x[i][j]=a[i][j]+b[i][j];
       cout<<x[i][j]<<" ";
    }
   cout<<"\n";
  } 
}