#include<iostream>
using namespace std;

int main(){
    int age, weight;
    
    cin>>age;
    cin>>weight;
    
    if(age>=18){
        if(weight>=50){
            cout<<"Eligible to donate blood:)";
        }
        else{
            cout<<"Not eligible to donate blood:(";
        }
    }
    else{
        cout<<"Not eligible to donate blood:(";
    }
    
    return 0;
}