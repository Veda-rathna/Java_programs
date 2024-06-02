#include<iostream>
#include<cstring>
#include<string>
using namespace std;
void count(string str1,string str2){
    int count=0;
    int len1 = str1.length();
    int len2 = str2.length();
    for(int i = 0;i<=len1-len2;i++){
        if(str1.substr(i,len2) == str2){
            count++;
            
        }
    }
    cout<<count;
    
    
}
int main(){
    string a = "HelloworldHello";
    string b = "Hello";
    count(a,b);
    return 0;
}