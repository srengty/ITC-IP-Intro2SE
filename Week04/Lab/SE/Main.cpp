#include<iostream>
#include<thread>
#include "SummaryAdapter.hpp"
#include "DetailAdapter.hpp"
using namespace std;
using namespace std::this_thread;
using namespace std::chrono_literals;
int main()
{
    Book book={"Cover.jpg","C++ programming",
        "0000012345","Author1",235,"O'Rielly"};
    void(*ar[])(Book) = {SummaryAdapter, DetailAdapter};
    int option = 0;
    while(true){
        cout<<R"(
    1. Summary view
    2. Detail view
    3. Table view
    Choose an option: )";
    cin>>option;
    cin.ignore(100,'\n');
    switch (option)
    {
    case 1:
    case 2:
    case 3:
        ar[option-1](book); break;
    
    default: cout<<"Unknown option.";
        return 0;
    }
    }
    return 0;
}