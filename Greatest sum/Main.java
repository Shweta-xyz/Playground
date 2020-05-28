#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  int great=0,max=0;
  int grea=0,ma=0;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {for(j=0;j<n;j++)
      cin>>a[i][j];
  }
  cout<<"Sum of rows is ";
  for(i=0;i<n;i++)
  {int sum=0;
  for(j=0;j<m;j++)
  {
      sum+=a[i][j];
   }
   cout<<sum<<" ";
   if(great<sum)
   {great=sum;
   max=i+1;}
  }
  cout<<"\nRow "<<max<<" has maximum sum\n";
  cout<<"Sum of columns is ";
  for(j=0;j<n;j++)
  {int su=0;
  for(i=0;i<m;i++)
 {
      su+=a[i][j];
   }
   cout<<su<<" ";
   if(grea<su)
   {grea=su;
   ma=j+1;}
  }
  cout<<"\nColumn "<<ma<<" has maximum sum";
} 