#include<iostream>
#include<thread>
using namespace std;
using namespace std::this_thread;
using namespace std::chrono_literals;
void Show(string txt){
    cout<<txt<<endl;
}
void PrintData(string data){
    cout<<"Data: "<<data<<endl;
}
double Sum(double a, double b){
    return a + b;
}
double Minus(double a, double b){
    return a - b;
}
int main()
{
    double(*p2)(double,double) = Sum;
    double result = p2(34, 90.5);
    p2 = Minus;
    result = p2(34, 90.5);
    void(*ar[])(string) = {Show, PrintData};//array of functions
    void(*p)(string) = Show;
    ar[0]("Happy new year 2025!");
    p = PrintData;
    ar[1]("Happy birthday!");
    return 0;
}