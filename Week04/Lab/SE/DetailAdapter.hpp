#pragma once
#include "Book.hpp"
void DetailAdapter(Book book){
    cout<<R"(
---------Detail----------
|   )"<<book.Cover<<R"( (2:1)   |
| )"<<book.Title<<R"(    )"<<book.Pages<<R"( Pages |
-------------------------
)";
}