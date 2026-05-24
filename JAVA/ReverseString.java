public class ReverseString {
    public static void main(String[] args) {
        String str="Chirag";
        StringBuilder rStr=new StringBuilder();
        for(int i=str.length()-1; i>=0; i--)
            {
             rStr.append(str.charAt(i));
            }     
         System.out.println(rStr);
    }
}
