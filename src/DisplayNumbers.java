public class DisplayNumbers {

    public static void main(String[] args) {

        System.out.println("----------- zadanie 1 ------------");
        // zadanie 1 od 91 do -7
//        System.out.println(91);
//        System.out.println(90);
//        System.out.println(89);

        for (int i = 91; i >= -7; i--) {
            System.out.println(i);
        }

        System.out.println("----------- zadanie 2 ------------");

        // zadanie 2
        for(int i = 62349; i <= 62392;i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println("----------- zadanie 3 ------------");
        char a = 'a';
        char z = 'z';
//        System.out.println((int)a);
//        System.out.println((int)z);

        for(int i = 'a'; i <= 'z'; i++){
            System.out.println((char)i);
        }


        System.out.println("----------- zadanie 4 ------------");
        int[][] numbers = {{1,3,4},{1,1},{4,5,5,7,3},{5,1,1,1}};

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}
