public class App {

    static void one() {
        int i = 0;
        String star = "*";
        while (i <= 3) {
            System.out.println(star);
            star = star + "*";
            i += 1;
        }
        System.out.println("----------");
    }

    public static void main(String[] args) throws Exception {
        one();
    }
}
