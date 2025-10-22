#pragma once
#include "Book.hpp"
void SummaryAdapter(Book book){
    cout<<R"(
-------------------------
|   )"<<book.Cover<<R"( (2:1)   |
| )"<<book.Title<<R"(    )"<<book.Pages<<R"( Pages |
-------------------------
)";
}