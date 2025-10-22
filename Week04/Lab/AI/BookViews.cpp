#include <iostream>
#include <thread>
#include <iomanip>
using namespace std;
using namespace std::this_thread;
using namespace std::chrono_literals;
struct Book // adaptee
{
    string Cover;
    string Title;
    string Isbn;
    string Authors;
    int Pages;
    string Publisher;
};
// adaptor 1
void adaptor1(Book *books, int size)
{
    for (int i = 0; i < size; i += 2)
    {
        Book &b = books[i];
        if ((i + 1) < size)
        {
            Book &b1 = books[i + 1];

            cout << R"(
-------------------------   ------------------------- 
|   )";
            cout << setw(11) << b.Cover;
            cout << R"( (2:1)   |   |   )";
            cout << setw(11) << b1.Cover;
            cout << R"( (2:1)   | 
| )";
            cout << setw(10) << b.Title;
            cout << R"(        )" << b.Pages << R"( |   | )";
            cout << setw(10) << b1.Title;
            cout << R"(        )" << b1.Pages << R"( | 
-------------------------   -------------------------)";
        }
        else
        {
            cout << R"(
------------------------- 
|   )";
            cout << setw(11) << b.Cover;
            cout << R"( (2:1)   | 
| )";
            cout << setw(10) << b.Title;
            cout << R"(        )" << b.Pages << R"( |
-------------------------)";
        }
    }
}
// adaptor 2: Table row
void adaptor2(Book *books, int size)
{
    cout << "\n-----------------------------------------------------------------";
    for (int i = 0; i < size; i++)
    {
        Book &b = books[i];
        cout << R"(
|  1| )" << b.Title
             << R"(     | )" << b.Isbn << R"( | )" << b.Authors << R"(   | 1     | )" << b.Publisher << R"( |)";
    }
    cout << "\n-----------------------------------------------------------------";
}
int main()
{
    const int size = 5;
    Book books[5] = {
        {"Cover", "Title5", "0000012345", "Author5", 235, "Publishier5"},
        {"Cover1", "Title1", "0000012346", "Author1", 235, "Publishier1"},
        {"Cover2", "Title2", "0000012347", "Author2", 235, "Publishier2"},
        {"Cover3", "Title3", "0000012348", "Author3", 235, "Publishier3"},
        {"Cover4", "Title4", "0000012349", "Author4", 235, "Publishier4"}};
    void (*p[])(Book *, int) = {adaptor1, adaptor2};
    int option;
    while (true)
    {
        cout << "\n\nChoose a display (0:Grid, 1:Table): ";
        cin >> option;
        if (option >= 0 && option <= 1)
        {
            p[option](books, size);
        }
        else
            break;
    }
    return 0;
}