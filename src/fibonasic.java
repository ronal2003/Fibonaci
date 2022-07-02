public class fibonasic {
    public static void main(String[] args) {


                int i=0, a=0, b=1, c=0;
                for(i=0; i<10; i++) {
                    System.out.print(a + ",");
                    if (i <9) {
                        c = a + b;
                        a = b;
                        b = c;
                    } else {
                        System.out.print(a);
                    }
                }
            }
        }



