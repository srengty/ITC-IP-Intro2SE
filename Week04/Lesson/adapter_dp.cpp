#include <iostream>
#include <sstream>
#include <iomanip>
using namespace std;
// adaptee
long time_in_seconds = 51635;

int *toHoursMinutesSeconds()
{
    int hours = time_in_seconds / 3600;
    int minutes = (time_in_seconds - (hours * 3600)) / 60;
    int seconds = time_in_seconds % 60;
    hours %= 24;
    return new int[]{hours, minutes, seconds};
}
// adapters
string adapter1()
{
    int *hms = toHoursMinutesSeconds();
    string ampm = hms[0] > 12 ? "PM" : "AM";
    hms[0] %= 12;
    stringstream sout;
    sout << hms[0] << ":" << hms[1] << ":" << hms[2] << " " << ampm;
    string tmp;
    getline(sout,tmp);
    return tmp;
}
string adapter2()
{
    int *hms = toHoursMinutesSeconds();
    stringstream sout;
    sout << hms[0] << ":" << hms[1] << ":" << hms[2];
    string tmp;
    sout >> tmp;
    return tmp;
}

// client
void showTime(string (*adapter)())
{
    cout << "The time is: " << adapter() << endl;
}

int main()
{
    string (*p)() = adapter1;
    showTime(p);

    p = adapter2;
    showTime(p);
    return 0;
}