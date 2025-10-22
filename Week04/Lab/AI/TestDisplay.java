public class TestDisplay{
    public static void main(String[] args){
        int pages = 235;
        System.out.println(String.format("""
----------------------------------------------------- 
|                                                   | 
|               Cover image (1:2)                   | 
|                                                   | 
----------------------------------------------------- 
| Title...                                    %05d | 
| By ___Author(s)___                                | 
| ISBN: __ISBN__                                    | 
| Edition                                           | 
| Published by ___Publisher___                      | 
-----------------------------------------------------
""", pages));
    }
}