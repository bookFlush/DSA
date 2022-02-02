#include <iostream>
using namespace std;

int binarySearch(int arr[],int low, int high, int x){
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid] == x)
            return mid;
        else if(x<arr[mid])
            high = mid-1;
        else
            low = mid+1;
    }
}
 
int main(void)
{
    int arr[] = { 2, 3, 4, 10, 40 };
    int x = 10;
    int n = sizeof(arr) / sizeof(arr[0]);
    int result = binarySearch(arr, 0, n - 1, x);
    (result == -1)
        ? cout << "Element is not present in array"
        : cout << "Element is present at index " << result;
    return 0;
}