#include <bits/stdc++.h>
using namespace std;

int first(int arr[], int low, int high, int x){
    
    int res = -1;
    while(low<=high){
        int mid = low +(high-low)/2;
        if(arr[mid]==x){
            res = mid;
            high = mid-1;
        }
        else if(x<arr[mid])
            high = mid -1;
        else
            low = mid+1;
    }
    return res;
}

int last(int arr[], int low, int high, int x){
    
    int res = -1;
    while(low<=high){
        int mid = low +(high-low)/2;
        if(arr[mid]==x){
            res = mid;
            low = mid+1;
        }
        else if(x<arr[mid])
            high = mid -1;
        else
            low = mid+1;
    }
    return res;
}

int countOccurrences(int arr[], int n, int x){
    int first_occ = first(arr, 0, n-1, x);
    int last_occ = last(arr, 0, n-1, x);
    int res = last_occ-first_occ+1;
    return res;
}

// Driver code
int main()
{
    int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 2;
    cout << countOccurrences(arr, n, x);
    return 0;
}