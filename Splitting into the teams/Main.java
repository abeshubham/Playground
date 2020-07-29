#include<iostream>
using namespace std;
int main()
{
 int n,t;
  cin>>n>>t;
  cout<<"The number of friends in each team is "<<(n/t)<<" and left out is "<<(n%t);
  return 0;
}
