#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int m1[r][c],m2[r][c],sum[r][c];
  for (i = 0; i < r; i++)
  {
    for (j = 0; j < c; j++)
      cin>>m1[i][j];
   }
   for (i = 0; i < r; i++)
  {
    for (j = 0; j < c; j++)
      cin>>m2[i][j];
   }
   for (i = 0; i < r; i++)
  {
    for (j = 0; j < c; j++)
    { sum[i][j]=m1[i][j]+m2[i][j];
      cout<<sum[i][j]<<" ";
    }
     cout<<"\n";
  }
}
  