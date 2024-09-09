public class Reduce {
    public static void main(String[] args) {
        int a = 0;
        int i = 100;
        while (i > 0){
            if (i % 2 == 0) {
                i = i / 2;
                a++;
            }
            else {
                i = i - 1;
                a++;
                }
            }
        System.out.println(a);
        }
    }

