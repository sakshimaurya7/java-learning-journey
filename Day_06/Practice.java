package Day_06;

public class Practice {
    
    static int calculateSum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double calculateAverage(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    static int findMax(int[] numbers) {
        int max = numbers[0];
        for( int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int findMin(int[] numbers) {
        int min = numbers[0];
        for( int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    static boolean search(int[] numbers, int target) {
        for(int number : numbers) {
            if (number == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //create an array
        int[] marks = {90, 85, 92, 78};
        //Array Index
        System.out.println(marks[0]);
        //Array Length
        System.out.println("Length of marks array: " + marks.length);
        //Traversing an array
        System.out.println("Traversing the marks array:");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Enhanced for loop
        System.out.println("Enhanced For Loop");
        for(int mark : marks) {
            System.out.println(mark);
        }

        //Find sum of an array
        System.out.println("Sum of an Array : " + calculateSum(marks));


        //Find Average
        System.out.println("Average of an array : " + calculateAverage(marks));

        //Find Maximum Number
        System.out.println("Maximum Number in an array : " + findMax(marks));

        //Find Minimum Number
        System.out.println("Minimum Number in an array : " + findMin(marks));

        //Searching an element in an array
        System.out.println("Is 92 present in the array? " + search(marks, 92));
        System.out.println("Is 80 present in the array? " + search(marks, 80));

        
    }
}
