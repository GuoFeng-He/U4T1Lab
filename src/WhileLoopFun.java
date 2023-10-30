public class WhileLoopFun {
    public WhileLoopFun() { }

    public void printDigits(int number) {
        String numberStr = "" + number;
        int idx = numberStr.length() - 1;
        while (idx >= 0){
            System.out.println(numberStr.substring(idx, idx + 1));
            idx--;
        }
    }

    public int countLetter(String word, String letter) {
        int idx = 0;
        int returnValue = 0;
        while (idx != word.length()){
            if (word.substring(idx, idx + 1).equals(letter)){
                returnValue++;
            }
            idx++;
        }
        return returnValue;
    }

    public int maxDoubles(int number, int threshold) {
        int returnValue = 0;
        while (number <= threshold){
            number *= 2;
            if (number <= threshold){
                returnValue++;
            }
        }
        return returnValue;
    }

    public boolean isPrime(int number) {
        int divisor = 2;
        while (divisor < number || number == 1){
            if (number % divisor == 0 || number == 1){
                return false;
            }
            divisor++;
        }
        return true;
    }
}
