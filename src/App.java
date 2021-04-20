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

    public static void main(String[] args) throws Exception {
        one();
        two();
    }
}
