#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  string s;
  getline(cin,s);
   int j = 0; 
    for (int i = 0; i < s.size(); i++) { 
          
        // Store only valid characters 
        if ((s[i] >= 'A' && s[i] <= 'Z') || 
            (s[i] >='a' && s[i] <= 'z')) 
        {  
            s[j] = s[i]; 
            j++; 
        } 
    } 
    cout << s.substr(0, j); 
}