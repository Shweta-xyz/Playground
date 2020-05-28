#include<iostream>
using namespace std;
int main()
{
 int n,s,sum=0;
  cin>>n>>s;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum+=a[i];
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";

}