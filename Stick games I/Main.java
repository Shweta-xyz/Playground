#include<iostream>
using namespace std;
void print(int x)
{
  switch(x)
  {case 0:  
   cout<<"Mani Iyer";
   break;
  case 1:
   cout<<"Arun Gupta";
   break;
  }
}
int main()
{
  int a[2];
  for(int i=0;i<2;i++)
  {
      cin>>a[i];
  }
  int sum=a[0]+a[1];
  if(sum%2==0)
    print(0);
  else
    print(1);
    
}