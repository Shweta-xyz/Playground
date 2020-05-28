#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int *p;
  int n,men=0,women=0;
  cin>>n;
   p = (int *)malloc(n*sizeof(int));
     for(int i=0;i<n;i++)
     {cin>>*(p+i);
     if(*(p+i)%2==0)
     women++;
      else 
        men++;
     }
  cout<<men<<endl;
   cout<<women;
  return 0;
}