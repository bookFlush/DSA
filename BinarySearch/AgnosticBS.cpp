#include <iostream>
using namespace std;

int binarySearch(int arr[], int low, int high, int element){
    bool asc = arr[low]<arr[high];
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid] == element)
            return mid;
        if(asc){
            if(element<arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        else{
            if(element<arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
    }
    return -1;
}

int main()
{
    int arr[] = { 40, 10, 5, 2, 1 };
    // int arr[] = {1, 2,2 ,3,10, 320};
    int x = 10;
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << binarySearch(arr, 0, n - 1, x);
 
    return 0;
}