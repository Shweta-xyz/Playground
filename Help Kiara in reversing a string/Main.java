#include <iostream>
#include<stdio.h>
int main()
{
char str[100], rev[100];     
int j, i;    
  	gets(str);
  while(str[i])
    i++;
for( j=0; j < i ;j++)
		rev[j] = str[i-1-j];        
std::cout<<rev;
}