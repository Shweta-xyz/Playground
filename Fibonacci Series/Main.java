#include<iostream>
using namespace std;
int fib(int x)
{
  if(x==1)
    return 0;
  else if(x==2)
    return 1;
  else
    return fib(x-2)+fib(x-1);
  
}
int main()
{
  int n;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
  return 0;
}