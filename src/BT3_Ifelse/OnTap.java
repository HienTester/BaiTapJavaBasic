package BT3_Ifelse;

public class OnTap {
    static void disPlay(int n) {
        if (n > 8) {
            System.out.println("Gioi");
        } else if (n < 8) {
            System.out.println("TrungBinh");
        } else {
            System.out.println("Kha");
        }
    }

    public static void main(String[] args) {
        int a = 28;
        int b = 30;
        int c = 10;
        int d = 10;
        String name = "Hien";
        String diaChi = "Nghe An";


        //Toán tử số học
        System.out.println("Toan tu so hoc : ");
        System.out.println(a %= 5);
        System.out.println(--b);

        // Toán tử quan hệ
        System.out.println("Toan tu quan he: ");
        System.out.println(name == "Hien");
        System.out.println(diaChi != "Ha Noi");
        System.out.println(a >= b);

        // Toán tử logic
        System.out.println("Toan tu logic: ");
        System.out.println((b >= 30) && name != "Hoa");
        System.out.println((name == "Hien") || b < 30);

        // Toán từ điều kiện
        System.out.println("Toan tu dieu kien: ");
        String p = (c - d == 0) ? " c tru cho d" : " d tru cho c";
        System.out.println(p);

        // Toán tử gán
        int x, y, z;
        x = y = z = 15;
        System.out.println("Toan tu gan: ");
        System.out.println(x + y + z);

        //Điều kiện if else
        System.out.println("Toan tu dieu kien: ");
        disPlay(7);

    }
}
