import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int[] arr = new int[10];
//            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//
//            if (!scanner.hasNextInt()) {
//                throw new IllegalArgumentException("Incorrect Input");
//            }
//
//            int index = scanner.nextInt();
//
//            if (index < 0 || index >= arr.length) {
//                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива");
//            }
//
//            arr[index] = 1;
//        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("Unknown error");
//        }
//    }




//    public static void main(String[] args) {
//        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
//        System.out.println(sum);
//    }
//
//    private static int sum2d(String[][] arr) {
//        int sum = 0;
//        try {
//            if (arr == null) {
//                throw new NullPointerException("Null array");
//            }
//
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i].length < 5) {
//                    throw new IndexOutOfBoundsException("IndexOutOfBounds");
//                }
//
//                for (int j = 0; j < 5; j++) {
//
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                }
//            }
//        } catch(NullPointerException | NumberFormatException | IndexOutOfBoundsException exception){
//            exception.printStackTrace();
//        } catch (Exception exception){
//            System.out.println("Unknown error");
//        }
//        return sum;
//    }





//
//    public static void main(String[] args) {
//        InputStream inputStream;
//        try {
//            String[] strings = {"apple", "orange"};
//            String strings1 = strings[2];
//            test();
//            int a = 1 / 0;
//            inputStream = new FileInputStream("/broken_reference");
//        } catch (Throwable e) {
//            e.printStackTrace();
//      /*  } catch (StackOverflowError error) {
//            System.out.println("Что-то сломалось");*/
//        } finally {
//            System.out.println("Я все равно выполнился");
//        }
//        System.out.println("Я жив!");
//    }
//
//    private static void test() throws IOException {
//        File file = new File("1");
//        file.createNewFile();
//        FileReader reader = new FileReader(file);
//        reader.read();
//        test();
//    }
}