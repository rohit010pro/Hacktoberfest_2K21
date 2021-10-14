#include<iostream>
using namespace std;
class A
{
public:
    void show()
    {
        cout<<"Roll "<<endl;
    }
};
class B
{
public:
    void show()
    {
        cout<<"Marks "<<endl;
    }
};
class C: public A,public B
{

};
int main()
{
    C obj;
    obj.show();
    obj.B::show();

}



