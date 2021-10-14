#include<iostream>
using namespace std;
class abc;
class xyz
{
private:
    int a;
public:
    void setdata(int m)
    {
        a=m;
    }
    friend void avg(xyz,abc);
};
class abc
{
private:
    int b;
public:
    void setdata(int n)
    {
        b=n;
    }
    friend void avg(xyz,abc);
};
void avg(xyz x,abc y)
{
    cout<<"AVERAGE IS "<<(x.a+y.b)/2;
}

int main()
{
    xyz x1;
    abc a1;
    x1.setdata(19);
    a1.setdata(39);
    avg(x1,a1);
 return 0;
}
