package LabAssignments;
import java.util.Arrays;
public class A1SAQ3 {

	public static void main(String[] args) {
		   
		        int[] numbers = {12, 5, 8, 3, 17, 10};
		        int sum = 0;
		        for (int num : numbers) {
		            sum += num;
		        }
		        Arrays.sort(numbers);
		        System.out.println("Sorted Array in Ascending Order:");
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }

		        System.out.println("\nSum of Array Elements: " + sum);
		    }
		}




