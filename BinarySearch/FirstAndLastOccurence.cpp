#include <bits/stdc++.h>
using namespace std;

int first(int arr[], int low, int high, int x, int n){
    
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

int last(int arr[], int low, int high, int x, int n){
    
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

int main()
{
    int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
    int n = sizeof(arr) / sizeof(int);
 
    int x = 2;
    printf("First Occurrence = %d\t",
           first(arr, 0, n - 1, x, n));
    printf("\nLast Occurrence = %d\n",
           last(arr, 0, n - 1, x, n));
 
    return 0;
}