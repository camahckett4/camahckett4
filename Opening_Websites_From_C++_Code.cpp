#include<iostream>
#include<string>
using namespace std;

int main()
{
    int userchoice;
    char again ='A';

    while(again == 'A')
    {
    cout << "=========================================================================" << endl;
    cout << "press 1 to open YOUTUBE " << endl;
    cout << "press 2 to open INSTAGRAM " << endl;
    cout << "press 3 to open TWITTER " << endl;
    cout << "press 4 to open yahoo fiinance" << endl;
    cout << "press 5 to open TD Ameritrade" << endl;
    cout << "what do you want to open: ";
    cin >> userchoice;
    cout << "=========================================================================" << endl;
    if(userchoice == 1)
    {
        system("start https://www.youtube.com/");
    }
    else if(userchoice == 2)
    {
        system("start https://www.instagram.com/");
    }
    else if(userchoice == 3)
    {
        system("start https://www.twitter.com/");
    }
    else if(userchoice == 4)
    {
        system("start https://finance.yahoo.com/");
    }
    else if(userchoice == 5)
    {
        system("start https://www.tdameritrade.com/");
    }
    else 
    {
        cout << "\tinvalid entry!\n";
    }
    }
return 0;
}