public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 1};

        /*

        5, 2, -5
        2, 5, -5
        2, -5, 5
        -5, 2, 5

         */

        // wyświetlenie elementów
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+",");
        }
        System.out.println();

        // sortowanie elementów
        for(int z = 0; z < numbers.length -1; z++){
            for(int i = 0; i < numbers.length-1; i++){
                if(numbers[i] > numbers[i+1]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                }
            }
        }

        // wyświetlenie elementów
        for(int j = 0; j < numbers.length; j++){
            System.out.print(numbers[j]+",");
        }
        System.out.println();
    }
}
