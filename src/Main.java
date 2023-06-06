import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng vào đây:");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 ngày",month);
                break;
            case 3:
                System.out.printf("Tháng %d có 31 ngày.",month);
                break;
            case 4:
                System.out.printf("Tháng %d có 30 ngày.",month);
                break;
            case 5:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            case 6:
                System.out.printf("Tháng %d có 30 ngày",month);
                break;
            case 7:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            case 8:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            case 9:
                System.out.printf("Tháng %d có 30 ngày",month);
                break;
            case 10:
                System.out.printf("Tháng %d có 31  ngày",month);
                break;
            case 11:
                System.out.printf("Tháng %d có 30  ngày",month);
                break;
            case 12:
                System.out.printf("Tháng %d có 31 ngày",month);
                break;
            default:
                System.err.println("không có tháng này vui lòng nhập lại từ 1-12");
                main(args);
        }
    }
}