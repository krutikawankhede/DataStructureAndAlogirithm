package Arrays;

public class QuickFind {

    private int[] id;
    public QuickFind(int N)
    {
        id = new int[N];
        for(int i =0; i<N; i++)
        {
            id[i]=i;                             //set id of each object to itself(N array access)

        }
    }

    //Basic operation which is very expensiove
//    public void union(int N, int p, int q)
//    {
//        if(p<N && q<N) {
//            int pid = id[p];
//            int qid = id[q];
//
//            for (int i = 0; i < id.length; i++) {
//                if (id[i] == pid) {
//                    id[i] = qid;
//                }
//            }
//        }
//    }

    public int root(int i)
    {
        while(i != id[i])               //Chase parent pointer until reach root
        {
            i=id[i];
        }
        return i;
    }

    public void union(int p,int q){   //Change the root of p to point to root of q in an array to form a tree
        int i = root(p);
        int j = root(q);
        id[i]=j;
    }


    public boolean quickFind(int p, int q){
        return id[p]==id[q];
    }
}
