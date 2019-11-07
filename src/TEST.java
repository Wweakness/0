import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int s=0;
        int h=0;
        int count=0;
        if (n != 0 && n <= 100) {


            while (n >= 3) {
                h = n / 3;
                s = n % 3;
                n = s + h;

                count = count + h;


            }
        }


        if(n==2){
            count=count+1;
        }



        System.out.println(count);
    }

}