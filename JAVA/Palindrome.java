public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int k=num;
        int temp=0;
        while(k>0)
        {
            int d=k%10;
            temp=temp*10+d;
            k/=10;
        }
        System.out.println(num==temp);
    }
}
