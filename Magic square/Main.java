#include<iostream>
using namespace std;
int main()
{
  int n,i,j,a[5][5],fr=0,bk=0;
  cin>>n;
  
  for(i=0;i<n;i++)
  {for(j=0;j<n;j++)
      cin>>a[i][j];}
  for(i=0;i<n;i++)
  {for(j=0;j<n;j++)
  {
    if(i==j)
      fr+=a[i][j];
    if(i+j+1==n)
      bk+=a[i][j];}
  }
  if(fr==bk)
    cout<<"Yes";
  else
      cout<<"No";
}