package lab05;

public class StatisticsCalculator {

    // Find minimum value
    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    // Find maximum value
    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    // Find mean (average)
    public static double findMean(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    // Find median
    public static double findMedian(int[] numbers) {
        int[] arr = numbers.clone();

        // Manual sorting (Bubble Sort)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9};

        System.out.println("Numbers: 5, 3, 8, 1, 9");
        System.out.println("Min = " + findMin(numbers));
        System.out.println("Max = " + findMax(numbers));
        System.out.printf("Mean = %.2f%n", findMean(numbers));
        System.out.println("Median = " + findMedian(numbers));
    }
}