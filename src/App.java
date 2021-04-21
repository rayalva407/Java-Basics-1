public class App {

    static void one() {
        int i = 0;
        String str = "*";
        while (i <= 3) {
            System.out.println(str);
            str = str + "*";
            i += 1;
        }
        System.out.println("----------");
    }

    static void two() {
        int i = 4;
        String str = "****";
        System.out.println("----------");
        while (i > 0) {
            System.out.println(str);
            str = str.substring(0, str.length() - 1);
            i -= 1;
        }
    }

    static void three() {
        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) throws Exception {
        three();
    }
}
