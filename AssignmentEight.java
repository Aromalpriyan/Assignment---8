import java.util.Arrays;
public class AssignmentEight {
    public static void main(String[] args) {
        int[]numbers = {12,43,56,78,34,23,89,90,65,31};
            System.out.println(Arrays.toString(numbers));
            int sum = 0;
            for(int i : numbers){
                sum +=i;
            }
            System.out.println(sum);

            int min = numbers[0];
            int max = numbers[0];
            for(int i : numbers){
                if(i> max){
                    max=i;
                }
                if(i < min){
                    min=i;
                }
            }
            System.out.println("The max value of number is " + max);
            System.out.println( "The min value of number is " + min);

            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));

        }
    }
