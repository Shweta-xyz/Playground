#include<iostream>
using namespace std;
int small(int p,int q)
{ int smal=0;
  if(p<q)
  smal=p;
  else
   smal=q;
 return smal;
  }
int gcd(int a,int b, int sm)
{
  if(a%sm==0 && b%sm==0)
   return sm;
  else
    sm--;
  gcd(a,b,sm);
}
int main()
{
  int x,y;
  cin>>x>>y;
  int sma=small(x,y);
  cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<gcd(x,y,sma);
}