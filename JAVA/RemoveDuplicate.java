public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,8,1,2,8};
        boolean[] visited=new boolean[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(visited[i])
                continue;
            System.out.println(arr[i]+ " ");
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                }
            }
        }
    }
}
