#include<iostream>
using namespace std;
int main()
{
  int n,i,high=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
   if (arr[i]>high)
     high=arr[i];
  }
  cout<<high;
}