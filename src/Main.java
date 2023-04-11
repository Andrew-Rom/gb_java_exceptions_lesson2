import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");

            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Incorrect Input");
            }

            int index = scanner.nextInt();

            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива");
            }

            arr[index] = 1;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}