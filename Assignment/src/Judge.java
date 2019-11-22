public class Judge {
    //I think this assingement is find the node which everyone connect to but not connect to other one
    // my idea is find each node is connected by how many other nodes, if we can find the one has been connected by n-1 number nodes
    // that is the one we look for, if not return -1;
    // n means the number of node;
    public int findJudge (int N, int [][] trust){
        //Creating array to counting how many trust for each person from other
        int[] count = new int[N+1];
        // loop through each array
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        // finding
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1) return i;
        }
        return -1;
    }
}
