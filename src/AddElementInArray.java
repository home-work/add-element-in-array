import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // in ra mảng
        System.out.println("Nhập vào kích thước của phần tử: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i]+"\t");
        }

        //Thêm phần tử vào mảng
        System.out.println("Vị trí muốn thêm: ");
        int position = scanner.nextInt();

        System.out.println("Giá trị thêm vào:");
        int addValue = scanner.nextInt();

        int[] arrayAdded = new int[size + 1];

        System.out.println("Mảng sau khi thêm là:");
        for (int i = 0; i < arrayAdded.length; i++) {
            if (i < position - 1) {
                arrayAdded[i] = array[i];
            } else if (i == position-1) {
                arrayAdded[i] = addValue;
            } else {
                arrayAdded[i] = array[i - 1];
            }
            System.out.printf(arrayAdded[i] + "\t");
        }
    }
}
