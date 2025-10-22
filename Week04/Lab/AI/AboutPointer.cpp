#include<iostream>
#include<thread>//parallel tasks
using namespace std;
using namespace std::this_thread;//sleep_for() function
using namespace std::chrono_literals;// date and time
int main()
{
    cout<<"Hello ";
    sleep_for(500ms);
    cout<<"everyone!\n";
    sleep_for(500ms);
    cout<<"Happy ";
    sleep_for(500ms);
    cout<<"new year!\n";
    return 0;
}