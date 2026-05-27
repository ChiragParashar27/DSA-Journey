public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,5,4,5,4,6};
        boolean[] visited=new boolean[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            if(visited[i])
                continue;
            int count=1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                    break;
                }
            }
            if(count>1)
            System.out.println(arr[i]+ " "+count);
            
        }
    }
}
