package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {57, 2, 36, 12, 8, 133, 86, 72};

        System.out.println("The original array: ");
        print(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int buffer = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = buffer;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }

            print(numbers);
        }

        System.out.println("The output array: ");
        print(numbers);
    }

    private static void print(int[] numbers) {
        System.out.print("[");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
