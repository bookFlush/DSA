#include <iostream>
using namespace std;

int binarySearch(int arr[], int n, int x){
    int low = 0, high = n-1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid] == x)
            return mid;
        else if(x<arr[mid])
            low = mid+1;
        else
            high = mid-1;
    }
}
 
// Driver Code
int main()
{
    int arr[] = { 5, 4, 3, 2, 1 };
    int N = sizeof(arr) / sizeof(arr[0]);
    int X = 4;
      
    int res =  binarySearch(arr, N, X);
    printf(" %d " , res);
    return 0;
}