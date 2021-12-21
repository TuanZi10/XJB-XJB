public class VolatileExp {
    public static void main(String[] args) {

    }

    int a = 0;
    boolean flag = false;

    public void write() {
        a = 1;
        flag = true;
    }

    public void read() {
        if (flag) {
            System.out.println(a);
        }
    }
}
