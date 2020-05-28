#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,max=0;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
      cin>>a[i][j];
  }
 for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
  {
     if(a[i][j]>max)
      max=a[i][j];
   }
  }
   cout<<"The maximum element is "<<max<<endl;
}  