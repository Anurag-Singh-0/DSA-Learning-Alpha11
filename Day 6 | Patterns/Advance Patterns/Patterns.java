
public class Patterns {

    // public static void Hollow_ractangle(int row, int col){
    //     for(int i = 1; i<=row; i++){
    //         for(int j = 1; j<=col; j++){
    //             if(i == 1 || i == row || j == 1 || j == col){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void tranglePattern(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i + 1; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void inverted_half_pyramid(int num) {
    //     for (int i = 1; i <= num; i++) {
    //            //Space
    //         for (int j = 1; j <= num - i ; j++) {
    //             System.out.print(" ");
    //         }
    //            //Stars
    //         for(int k = 1; k<=i; k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void inverted_half_number_pyramid(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i + 1; j++) {
    //             System.out.print(j + " ");  
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void floyd_tringle(int n ){
    //     int count = 1;
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             System.out.print(count++ + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void zeroOneTrangle(int n){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             if((i + j) % 2 == 0){
    //                 System.out.print("1" + " ");
    //             }else{
    //                 System.out.print("0" + " ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void butterfly_pattern(int n) {
    //     //1st Half
    //     for (int i = 1; i <= n; i++) {
    //         // Strs - i 
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }

    //         //Space - 2 * (n - i)
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print("  ");
    //         }

    //         //Stars - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     // 2nd Half
    //     for (int i = n; i >= 1; i--) {
    //         // Strs - i 
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }

    //         //Space - 2 * (n - i)
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             System.out.print("  ");
    //         }

    //         //Stars - i
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void solid_rombus(int n){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=(n - i); j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 1; k<=n; k++){
    //             System.out.print("* ");
    //         }

    //         System.out.println();
    //     }
    // }

    public static void hollow_rombus(int n){
        for(int i = 1; i<=n; i++){
            // space
            for(int j = 1; j<=(n - i); j++){
                System.out.print(" ");
            }

            //star
            for(int k = 1; k<=n; k++){
                if(i == 1 || i == n || k == 1 || k == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        // Hollow_ractangle(4, 5);
        // tranglePattern(5);
        // inverted_half_number_pyramid(4);
        // floyd_tringle(10);

        // zeroOneTrangle(3);
        // butterfly_pattern(20);

        // solid_rombus(5);
        hollow_rombus(10);
    }
}
