public class CharacterPatter {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 10;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

// ✴️ Important ✴️

/*
 * char ch = 'A'; → You start with the letter A.
 * (Remember: in Java, characters follow ASCII/Unicode order, so 'A' + 1 = 'B',
 * 'B' + 1 = 'C', etc.)
 */

// Output

// A
// BC
// DEF
// GHIJ
// KLMNO
