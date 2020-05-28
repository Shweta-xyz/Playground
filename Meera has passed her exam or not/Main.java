#include<iostream>
using namespace std;
int main()
{
 int n,i,x;
  cin>>n;
  int count=n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>x;
  for(i=0;i<n;i++)
  {
    if(x==arr[i])
    {cout<<"She passed her exam";
     break;}
    count--;
  }
  if(count==0)
    cout<<"She failed";
  return 0;
}