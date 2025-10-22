#include <iostream>
#include <thread>
using namespace std;
using namespace std::this_thread;
using namespace std::chrono_literals;
void PrintHello(string txt)
{
    cout << "Hello " << txt;
}
double Sum(double a, double b)
{
    return a + b;
}
double Minus(double a, double b)
{
    return a - b;
}
double Multiple(double a, double b)
{
    return a * b;
}
double Divide(double a, double b)
{
    return a / b;
}
int main()
{
    double a,b;
    //void (*p)(string) = PrintHello;
    //p("everyone"); // call the function
    double (*p2)(double, double) = Sum;
    double(*ar[])(double,double) = {Sum, Minus, Multiple, Divide};
    const char* operators = "+-*/";
    int option;
    cout<<"Input a and b: "; cin>>a>>b;
    cout<<"Operator index (0:Sum, 1:Minus, 2:Multiple, 3: Divide): "; 
    cin>>option;
    cin.ignore(100,'\n');
    cout<<"Result: "<<ar[option](a,b);
    return 0;
}