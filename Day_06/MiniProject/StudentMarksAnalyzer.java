package Day_06.MiniProject;
import java.util.Scanner;


//Student Marks Analyzer
public class StudentMarksAnalyzer {

    static int calculateTotal(int[] array) {
        int total = 0;
        for(int arrayElement : array) {
            total += arrayElement;
        }
        return total;
    }

    // static double calculateAverage(int total,int num) {
    //     return (double) total/num;
    // }

    static double calculateAverage(int[] array) {
        int total = calculateTotal(array);
        return (double) total / array.length;
    }

    static int findMaximum(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    static int findMinimum(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int countPassed(int[] array) {
        int countPass = 0;
        for(int arrayElement : array){
            if(arrayElement >= 40) {
                countPass++;
            }
        }
        return countPass;
    }

    static int countFailed(int[] array) {
        int countFail = 0;
        for(int arrayElement : array) {
            if(arrayElement < 40) {
                countFail++;
            }
        }
        return countFail;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Students : ");
        int n = sc.nextInt();

        System.out.println("Marks : ");
        int[] marks = new int[n];
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.println("Total  = " + calculateTotal(marks));
        System.out.println("Average  = " + calculateAverage(marks));
        System.out.println("Maximum  = " + findMaximum(marks));
        System.out.println("Minimum  = " + findMinimum(marks));
        System.out.println("Passed  = " + countPassed(marks));
        System.out.println("Failed  = " + countFailed(marks));


        sc.close();
    }
}
