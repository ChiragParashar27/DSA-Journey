class TwoSum{
  public static void main(String[] args) {
       //System.out.println("Hello");
       int[] arr={2,8,5,7,11};
       int target=9;
       for(int i=0; i<arr.length; i++)
       {
        int diff=target-arr[i];
       
      for(int j=i+1; j<arr.length; j++)
      {
        if(diff==arr[j])
          System.out.println(arr[j]+" "+arr[i]+" "+"at "+i+" "+j);
       }
      }    
  }
}