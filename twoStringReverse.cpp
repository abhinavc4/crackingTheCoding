#include<iostream>
#include<cstring>
#include<new>
using namespace std;
void reverse(char *str)
{
	int len = strlen(str);
	cout<<"Within reverse: "<<str<<" | length: "<<len<<endl;
	char arr[len+1];
	for(int i = 0 ; i < len ; i++)
	{
		arr[i] = str[len-i-1];
	}
	arr[len] = '\0';
	cout<<"Value of reversed String is:"<<arr<<endl;
	strncpy(str,arr,len);	
}
int main()
{
	char *stringToReverse = new char[20];
	strncpy(stringToReverse,"reverse this",13);
	std::cout<<"Before reversing:"<<stringToReverse<<endl;
	reverse(stringToReverse);
	std::cout<<"After reversing:"<<stringToReverse<<endl;
	return 0;
}