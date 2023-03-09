import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] arr = createArr();
        double min = arr[0][0];

        // in ra mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            ;
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Gía trị nhỏ nhất: "+ min);

    }

    static double[][] createArr() {
        System.out.println("nhập số hàng: ");
        int row = scanner.nextInt();

        System.out.println("nhập số cột: ");
        int column = scanner.nextInt();
        double[][] arr = new double[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhập phần tử thứ " + i + "." + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

}