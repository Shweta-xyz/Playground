#include <iostream>
using namespace std;
struct Complex{
  int r,i;
}c1,c2,sum,sub,mul;
void add(Complex c1,Complex c2,Complex sum)
{
  sum.r=c1.r+c2.r;
  sum.i=c1.i+c2.i;
   cout<<sum.r;
      if(sum.i>0)
        cout<<"+";
      cout<<sum.i<<"i";
}
void subt(Complex c1,Complex c2,Complex sub)
{
  sub.r=c1.r-c2.r;
  sub.i=c1.i-c2.i;
   cout<<sub.r;
      if(sub.i>0)
        cout<<"+";
      cout<<sub.i<<"i";
}
void mult(Complex c1,Complex c2,Complex mul)
{
  mul.r=c1.r*c2.r-c1.i*c2.i;
  mul.i=c1.r*c2.i+c1.i*c2.r;
   cout<<mul.r;
      if(mul.i>0)
        cout<<"+";
      cout<<mul.i<<"i";
}
int main()
{
  int x;
  cin>>x;
  std::cin >> c1.r;
  std::cin >> c1.i;
  std::cin >> c2.r;
  std::cin >> c2.i;
  switch(x)
  {
    case 1:
     add(c1,c2,sum);
      break;
    case 2:
      subt(c1,c2,sub);
      break;
    case 3:
      mult(c1,c2,mul);
       break;
    default:
      cout<<"Invalid choice";
      break;
      
       
  }
}
  
  
