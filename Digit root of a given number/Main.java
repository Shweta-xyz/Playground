#include<iostream>
using namespace std;
int DigitSum(int num)
   {
     int sum = 0;
     while (num > 0)
        {
         sum += num % 10;
         num /= 10;
        }
    if (sum > 9)
        sum = DigitSum(sum);
    return sum;
        }
 int main()
{
    int n;
    cin>>n;
    cout<<DigitSum(n);
}