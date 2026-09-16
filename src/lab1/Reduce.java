package lab1;

public class Reduce {
    static void main(String[] args) {
        count = 0;
        n = 100;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
                count += 1;
            } else {
                n -= 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}
