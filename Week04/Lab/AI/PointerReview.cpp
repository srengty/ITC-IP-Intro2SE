#include <iostream>
#include <thread>
using namespace std;
using namespace std::this_thread;
using namespace std::chrono_literals;
int main()
{
    int b = 8;
    int *p = new int(5);
    int &r = *p;
    cout << r << endl; // 5 - because p points a
    r++;
    cout << r << endl; // 6
    r = b + r;
    cout << r << endl; // 
    return 0;
}