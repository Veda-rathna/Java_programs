#include <iostream>
using namespace std;

const int MAX_SIZE = 100;
int list[MAX_SIZE];
int n = 0; // Current number of elements in the list

void Display()
{
    cout << "Elements in the list: ";
    for (int i = 0; i < n; ++i)
    {
        cout << list[i] << " ";
    }
    cout << endl;
}

void Insert()
{
    int data, pos;
    cout << "Enter the data to be inserted: ";
    cin >> data;
    cout << "Enter the position at which element to be inserted: ";
    cin >> pos;

    ``` if (pos == n)
    {
        cout << "Array overflow" << endl;
        return;
    }

    for (int i = n - 1; i >= pos - 1; i--)
    {
        list[i + 1] = list[i];
    }

    list[pos - 1] = data;
    n++;
    Display();

    ```
}

int main()
{
    Insert();
    return 0;
}