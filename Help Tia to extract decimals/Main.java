#include<iostream>
#include<string>
using namespace std;
int main()
{
   string num;
   cin>>num;
   cout<<"Floating part is : ";
   int pos = num.find("."); 
   if (pos != string::npos) 
      cout<< num.substr(pos + 1); 
}