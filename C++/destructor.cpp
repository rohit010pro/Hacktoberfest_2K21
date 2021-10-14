#include<iostream>
using namespace std;
class sample
{
 public:
  sample()
  {
      int count;
   ++count;
   cout<<"constuctor= "<<count<<endl;
  }
  ~sample()
  {
      int count;
   cout<<"Detructor= "<<count<<endl;
   --count;
  }
};
int main()
{
    sample s1,s2,s3,s4;
    cout<<"De-no. of object"<<endl;

return 0;
}
