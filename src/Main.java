public class Main {

    static boolean isPalindrom(int number){

        int temp = number;
        int reversenum= 0, lastnum;

        while (temp != 0){
            lastnum = temp % 10 ;
            reversenum = (reversenum*10) + lastnum;
            temp /= 10;

        }
        if(number==reversenum)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        int num = 2476;

        System.out.println(isPalindrom(101));



    }
}
