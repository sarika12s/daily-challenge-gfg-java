class Solution{
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        st.remove((n-1)/2);
        return st;
    }
}