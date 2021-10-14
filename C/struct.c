#include<stdio.h>
#include<string.h>
#include<stdlib.h>
struct employee
{
    int id;
    char name[30]; 
    float salary;
}e1;
int main()
{
    e1.id=100;

    strcpy(e1.name,"Sonu Jaiswal");

     e1.salary=45000;

     printf("%d\t%s\t%f\n",e1->id,e1->name,e1->salary);
    
   return 0;
}
