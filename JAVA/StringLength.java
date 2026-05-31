class StringLength{
    public static void main(String[] args) {
        
        String str="Chirag";
        int count=0;
        try{
            while (true) {
                str.charAt(count);
                count++;
            }
        }catch (Exception e)
        {}
           System.out.println("String Length is "+count);
    }
}