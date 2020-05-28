#include<iostream>
#include<string.h>
using namespace std;
struct College { 
  char name[100];
  char city[100]; 
  int establishmentYear; 
  float passPercentage;
 void getd(){
  cout<<"Enter name"<<endl;
  cin>>name;
  cout<<"Enter city"<<endl;
  cin>>city;
  cout<<"Enter year of establishment"<<endl;
  cin>>establishmentYear;
  cout<<"Enter pass percentage"<<endl;
  cin>>passPercentage;}
  void display(){
  cout<<"Name:"<<name<<endl;
  cout<<"City:"<<city<<endl;
  cout<<"Year of establishment:"<<establishmentYear<<endl;
  cout<<"Pass percentage:"<<passPercentage<<endl;}
};
void sortname(College c[],int n)
{
for (int i=0;i<n-1;i++)
for (int j=i+1;j<n;j++)
if (strcmp(c[i].name,c[j].name)>0)
            {College temp=c[i];
                c[i]=c[j];
               c[j]=temp;}
}

int main()
{int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  College c[n];
   for(int i=0;i<n;i++)
  { cout<<"Enter the details of college "<<i+1<<endl;
  c[i].getd();}
  sortname(c,n);
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
  cout<<"College:"<<i+1<<endl;
  c[i].display();}
}