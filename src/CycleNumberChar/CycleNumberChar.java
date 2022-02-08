package CycleNumberChar;

public class CycleNumberChar {

    public static void main(String[] args) {

        char c = 'c';
        char rC = 'с';
        char jS = 'ィ';
        int[] charArray = new int[3];
        charArray[0] = c;
        charArray[1] = rC;
        charArray[2] = jS;

        for (int value : charArray) {
            System.out.println(value);
        }
    }
}