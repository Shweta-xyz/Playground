#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j;
  cin>>r>>c;
  int m1[r][c];
  for (i = 0; i < r; i++)
  {
    for (j = 0; j < c; j++)
     cin>>m1[i][j];
  }
   for (i = 0; i < c; i++)
   {
    for (j = 0; j < r; j++)
     cout<<m1[j][i]<<" ";
    cout<<"\n";
   }
}