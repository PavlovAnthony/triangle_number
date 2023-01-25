package DZ1;
import java.util.Scanner;
public class DZ_triangle_number {
    

public class triangle_number {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int a = Sc.nextInt();
        Sc.close();
        System.out.println("Вычисленное треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}
}
