import  java.util.Scanner;

public class LibraryBookBorrowingAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] books = new int[15];
        int total = 0;
        int mostBooks = 0;
        int countAtLeastFive = 0;

        // Input books borrowed by 15 students
        for (int i = 0; i < books.length; i++) {

            while (true) {
                System.out.print("Enter books borrowed by Student "
                        + i + ": ");

                if (sc.hasNextInt()) {
                    int input = sc.nextInt();

                    if (input >= 0) {
                        books[i] = input;
                        break;
                    } else {
                        System.out.println(
                                "Invalid input! Enter a nonnegative integer.");
                    }

                } else {
                    System.out.println(
                            "Invalid input! Enter an integer.");
                    sc.next();
                }
            }

            total += books[i];

            if (books[i] >= 5) {
                countAtLeastFive++;
            }

            if (books[i] > mostBooks) {
                mostBooks = books[i];
            }
        }

        // Calculate average
        double average = (double) total / books.length;

        // Display results
        System.out.println("\n===== BORROWING ANALYSIS =====");

        System.out.println("Total books borrowed: " + total);
        System.out.printf("Average books borrowed: %.2f\n", average);

        System.out.println("Most books borrowed: " + mostBooks);
        System.out.println("Student(s) who borrowed the most:");

        for (int i = 0; i < books.length; i++) {
            if (books[i] == mostBooks) {
                System.out.println("Student index: " + i);
            }
        }

        System.out.println(
                "Students who borrowed at least 5 books: "
                + countAtLeastFive);

        sc.close();
    }
}
