package ArrayExercises;

public class CNP {
        public static void main(String[] args) {
            String cnp = "2990219469000";

            int[] constant = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
            int sum = 0;

            for (int i = 0; i < 12; i++) {
                int digit = Character.getNumericValue(cnp.charAt(i));
                sum += digit * constant[i];
            }

            int division = sum % 11;
            int controlDigit = (division < 10) ? division : 1;

            if (controlDigit == Character.getNumericValue(cnp.charAt(12))) {
                System.out.println("CNP valid.");
            } else {
                System.out.println("CNP incorect.");
            }
        }
    }
//What will be the output of the following code snippet?  int a = 1; int[] ia = new int[10]; int b = ia[a]; int c = b + a; System.out.println(b = c);
//2