#include<iostream>
#include<iomanip>
#include<string.h>
using namespace std;
struct Student { 
    char name[30]; 
    char department[20]; 
    int yearOfStudy; 
    float cgpa; 
    void getd(){
  cout<<"Enter name"<<endl;
  cin>>name;
  cout<<"Enter department"<<endl;
  cin>>department;
  cout<<"Enter year of study"<<endl;
  cin>>yearOfStudy;
  cout<<"Enter cgpa"<<endl;
  cin>>cgpa;}
  void display(){
  cout<<"Name:"<<name<<endl;
  cout<<"Department:"<<department<<endl;
  cout<<"Year of study:"<<yearOfStudy<<endl;
  cout<<"CGPA:"<<setprecision(2)<<cgpa<<endl;}
};
void sortname(Student s[],int n)
{
for (int i=0;i<n-1;i++){
{for (int j=i+1;j<n;j++)
if (strcmp(s[i].name,s[j].name)>0)
            {Student temp=s[i];
                s[i]=s[j];
               s[j]=temp;}}}
}

int main()
{
  int n;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++)
  { cout<<"Enter the details of student "<<i+1<<endl;
  s[i].getd();}
  sortname(s,n);
  cout<<"Details of students"<<endl;
  for(int i=0;i<n;i++)
  {
  cout<<"Student "<<i+1<<endl;
  s[i].display();}
}