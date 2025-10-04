public class BinToDecimalRevision {

    public static void binaryToDecimal(int binNum) {
        int myNumb = binNum;
        int power = 0;
        int dec = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum /= 10;
        }

        System.out.println("Decimal of " + myNumb + " = " + dec);

    }

    public static void main(String[] args) {
        binaryToDecimal(101110);
    }
}
