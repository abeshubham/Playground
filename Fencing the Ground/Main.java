#include<iostream>
using namespace std;
int main()
{
  int l,b,p=0,area=0;
  cin>>l;
  cin>>b;
  p = (l+b);
  p=p*2;
  area = (l*b);
  
  cout<<"Required length is "<< p <<" m"<<endl;
  cout<<"Required area of carpet is "<< area <<" sqm";
  return 0;
  
}