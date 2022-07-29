#include<iostream>
#include<conio.h>

using namespace std;

class stock
{
public:

    int buy;
    int sell;
    int limit2;
    int t;
    void output();
    void input();
    void output2();

    stock();
    stock(int a);
};
class PLT
{
public:
    int selll;
    int buyy;
    int limit3;
    int x;

    void input1();
    void output4();
    void output5();
    PLT();
    PLT(int p);
};
class Aon
{
public:
    int sell1;
    int buy1;
    int limit5;
    int y;

    void input2();
    void output6();
    void output7();
    Aon();
    Aon(int s);
};

int CCIV = 0;
int PLTR = 1;
int AONE = 2;
int userchoice;

string convert(int n)
{
    if(n == 0)
    {
        return "CCIV";
    }
    else if(n == 1)
    {
        return "PLTR";
    }
    else if(n == 2)
    {
        return "AONE";
    }
    
    return "N/A";
}
int main()
{
    PLT limit1;
    PLT limit3(22);

    stock limit;
    stock limit2(25);

    Aon limit4;
    Aon limit5(11);

    cout << "=========================================================" << endl;
        cout << "\tWhat Stock Do You Want To Invest In\n\n";
        cout << "Enter 0 for CCIV" << endl;
        cout << "Enter 1 for PLTR" << endl;
        cout << "Enter 2 for AONE" << endl;
        cout << "your choice: ";
        cin >> userchoice;
    cout << "=========================================================" << endl;
    if(userchoice == 0)
    {
        cout << "\t      Stock: CCIV\n";
        limit2.input();
        cout << endl;
        limit2.output();
        cout << endl;
        limit2.output2();
        cout << endl;
    }
    else if(userchoice == 1)
    {
        cout << "\t      Stock: PLTR\n";
        limit3.input1();
        cout << endl;
        limit3.output4();
        cout << endl;
        limit3.output5();
        cout << endl;
    }
    else if (userchoice == 2)
    {
        cout << "\t      Stock: AONE\n";
        limit4.input2();
        cout << endl;
        limit4.output6();
        cout << endl;
        limit4.output7();
        cout << endl;
    }
    
    return 0;
}
void stock::output()
{
    cout << "You're buying " << "$" << buy << " worth of shares at " << "$" << limit2 << endl;
    t = buy/limit2;
    cout << "=========================================================" << endl;
    cout << "\t\tShares\n\n";
    cout << "Total amount of shares: " << t;
    cout << endl;
}
void stock::input()
{
    cout << "=========================================================" << endl;
    cout << "\t\tMoney\n\n";
    cout << "Enter how much money you want to invest: ";
    cin >> buy;
    cout << endl;
}

void stock::output2()
{
    cout << "=========================================================" << endl;
    cout << "\t\tSell Price\n\n";
    cout << "Enter desired sell price: "; 
    cin >> sell;
    cout << endl;
    cout << "=========================================================" << endl;
    cout << "\t\tProfit\n\n";
    cout << "If bought at " << "$" << limit2 << " and sold at " << "$" << sell 
        << " your profit will be "<< "$" << t*sell-buy;
}
void PLT::input1()
{
    cout << "=========================================================" << endl;
    cout << "\t\tMoney\n\n";
    cout << "Enter how much money you want to invest: ";
    cin >> buyy;
    cout << endl;
}
void PLT::output4()
{
    cout << "You're buying " << "$" << buyy << " worth of shares at " << "$" << limit3 << endl;
    x = buyy/limit3;
    cout << "=========================================================" << endl;
    cout << "\t\tShares\n\n";
    cout << "Total amount of shares: " << x;
    cout << endl;
}
void PLT::output5()
{
    cout << "=========================================================" << endl;
    cout << "\t\tSell Price\n\n";
    cout << "Enter desired sell price: "; 
    cin >> selll;
    cout << endl;
    cout << "=========================================================" << endl;
    cout << "\t\tProfit\n\n";
    cout << "If bought at " << "$" << limit3 << " and sold at " << "$" << selll
        << " your profit will be "<< "$" << x*selll-buyy;
}
void Aon::input2()
{
    cout << "=========================================================" << endl;
    cout << "\t\tMoney\n\n";
    cout << "Enter how much money you want to invest: ";
    cin >> buy1;
    cout << endl;
}
void Aon::output6()
{
    cout << "You're buying " << "$" << buy1 << " worth of shares at " << "$" << limit5 << endl;
    y = buy1/limit5;
    cout << "=========================================================" << endl;
    cout << "\t\tShares\n\n";
    cout << "Total amount of shares: " << y;
    cout << endl;
}
void Aon::output7()
{
    cout << "=========================================================" << endl;
    cout << "\t\tSell Price\n\n";
    cout << "Enter desired sell price: "; 
    cin >> sell1;
    cout << endl;
    cout << "=========================================================" << endl;
    cout << "\t\tProfit\n\n";
    cout << "If bought at " << "$" << limit5 << " and sold at " << "$" << sell1
        << " your profit will be "<< "$" << y*sell1-buy1;
}
stock::stock()
{
    limit2 = 25;
}
stock::stock(int a)
{
    limit2 = a;
}
PLT::PLT()
{
    limit3 = 22;
}
PLT::PLT(int p)
{
    limit3 = p;
}
Aon::Aon()
{
    limit5 = 11;
}
Aon::Aon(int s)
{
    limit5 = s;
}

