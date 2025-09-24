public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 123;
        int OriginalNumber = num;

        int rev = 0;
        int lastDigit;

        while (num > 0) {
            lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        if (OriginalNumber == rev) {
            System.out.println(OriginalNumber + " This is a Palindrome number!");
        } else {
            System.out.println(OriginalNumber + " This is not a Palindrome number!");
        }
    }
}
