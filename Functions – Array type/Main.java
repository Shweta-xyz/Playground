#include<iostream>
using namespace std;
int func(int m,int *a)
{
  int i,even=0,odd=0;
  for(i=0;i<m;i++)
  {
    if (a[i]%2==0)
      even++;
    else 
      odd++;
  }
  if(even==m)
    return 1;
  else if(odd==m)
    return 2;
  else
    return 3;
}
int main()
{
  int n,i,x;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  x=func(n,a);
    switch(x)
    {
      case 1:
        cout<<"The array is Even";
        break;
        case 2:
        cout<<"The array is Odd";
        break;
        case 3:
        cout<<"The array is Mixed";
        break;
    }
  
}