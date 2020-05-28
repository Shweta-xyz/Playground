#include <iostream>
using namespace std;
 
struct Dist {
  float inch;
  int feet;
};
 
int main() {
  Dist d1,d2, sum;
    cin >> d1.feet >> d1.inch;
    cin >> d2.feet >> d2.inch; 
  sum.inch=d1.inch+d2.inch;
  sum.feet=d1.feet+d2.feet;
   if(sum.inch > 12){
        sum.feet++;
        sum.inch-=12;
    }
    cout<< sum.feet<<"'-" <<sum.inch<<"\"" ;
    return 0;
}
 
