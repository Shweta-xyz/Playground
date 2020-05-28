#include<iostream>
using namespace std;
int main()
{
  int n,x,i,b;
 cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n+1];
   cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>x;
  if(x>n)
    cout<<"Invalid Input";
  else
  {
    cout<<"Enter the value to insert\n";
  cin>>b;
  for(i=n+1;i>x-1;i--)
    a[i]=a[i-1];
  a[x-1]=b;
  cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
    cout<<a[i]<<endl;
  }
}