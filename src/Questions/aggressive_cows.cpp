// Aggressive Cows

//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
public:


    bool isPossibleSol(vector<int>&stalls, int k, int mid){
        int c =1;
        int pos = stalls[0];
        for(int i=1; i<stalls.size(); i++){
            if(stalls[i]-pos >= mid){
                c++;
                pos = stalls[i];
            }
            if(c==k){
                return true;
            }
        }
        return false;
    }

    int solve(int n, int k, vector<int> &stalls) {
        sort(stalls.begin(), stalls.end());
        int start = 0;
        int end = stalls[stalls.size()-1]-stalls[0];
        int ans = 0;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isPossibleSol(stalls, k, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t = 1;
    cin >> t;

    // freopen ("output_gfg.txt", "w", stdout);

    while (t--) {
        // Input

        int n, k;
        cin >> n >> k;

        vector<int> stalls(n);
        for (int i = 0; i < n; i++) {
            cin >> stalls[i];
        }
        // char ch;
        // cin >> ch;

        Solution obj;
        cout << obj.solve(n, k, stalls) << endl;

        // cout << "~\n";
    }
    // fclose(stdout);

    return 0;
}
// } Driver Code Ends