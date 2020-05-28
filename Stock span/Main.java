#include<iostream>
using namespace std;
void stockspan(int t, int *b)
{
  int x=1,y=0;
  cout<<x;
  for(int i=1;i<t;i++)
{
    if(*(b+i)<*(b+i-1))
      cout<<"\n"<<x;
    else{
      y+=2;
      cout<<"\n"<<y;
    }
  }
}
int main()

{
int n;
cin>>n;
int a[n];
for(int i=0;i<n;i++)
cin>>a[i];
stockspan(n,a);
}    
  
