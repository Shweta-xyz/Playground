#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int v=0,c=0,w=0,d=0,sy=0;
  string s;
  getline(cin,s);
  for(int i=0;i<s.size();i++)
  {
    if(s[i]=='a'|| s[i]=='e'|| s[i]=='i'|| s[i]=='o'||s[i]=='u'||
       s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
           v++;
    else if ((s[i] >= 'A' && s[i] <= 'Z') || 
            (s[i] >='a' && s[i] <= 'z')) 
           c++;
     else if(s[i]==' ')
       w++;
     else if(s[i]>='0' && s[i]<='9')
       d++;
      else
       sy++;
  }
       cout<<"Vowels:"<<v<<endl;
       cout<<"Consonants:"<<c<<endl;
       cout<<"White Spaces:"<<w<<endl;
       cout<<"Digits:"<<d<<endl;
       cout<<"Symbols:"<<sy<<endl;
}