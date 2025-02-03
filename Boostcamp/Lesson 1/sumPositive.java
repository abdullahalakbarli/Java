public class sumPositive {
    public static int sumPos(int[] numbers){
        int sum = 0;
        int i = 0;

        while (i < numbers.length){
            if (numbers[i] > 0){
                sum += numbers[i];
            }
        i++;
        }
        return sum;
    }
}
