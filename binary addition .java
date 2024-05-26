import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        String sum = addBinary(binary1, binary2);

        System.out.println("Sum of the two binary numbers: " + sum);

        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) {
                sum += binary1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += binary2.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}

OUTPUT
1011
1101
11000


Suppose we want to add two binary numbers: `1011` and `1101`.


int carry = 0;
int i = binary1.length() - 1;
int j = binary2.length() - 1;
- `carry` is initialized to 0. This variable keeps track of any carry during addition.
- `i` and `j` are initialized to the last index of the binary strings `binary1` and `binary2`, respectively. These indices are used to traverse the binary numbers from right to left.



while (i >= 0 || j >= 0 || carry == 1) {
- This loop iterates until both `i` and `j` become less than 0 (meaning we have processed all digits of both binary numbers) and there's no carry left (`carry == 1`).

int sum = carry;
if (i >= 0) {
    sum += binary1.charAt(i--) - '0';
}
if (j >= 0) {
    sum += binary2.charAt(j--) - '0';
}
- `sum` is initialized with the current value of `carry`. This ensures that any carry from the previous addition is considered in the current addition.
- If `i` (the index of `binary1`) is greater than or equal to 0, we add the binary digit at position `i` to `sum`. We decrement `i` afterward.
- If `j` (the index of `binary2`) is greater than or equal to 0, we add the binary digit at position `j` to `sum`. We decrement `j` afterward.

For our example (`1011` and `1101`):

- In the first iteration, `i` and `j` are both 3 (the last index).
- `sum` starts with the value of `carry`, which is 0.
- We add the rightmost digits of both binary numbers (`1` from `binary1` and `1` from `binary2`) to `sum`. So, `sum` becomes `0 + 1 + 1 = 2`.


result.insert(0, sum % 2);
carry = sum / 2;
- We insert the least significant bit of `sum` (which is `sum % 2`) at the beginning of the `result` string using `insert(0, ...)`.
- We update the value of `carry` for the next iteration by setting it to `sum / 2`. This gives us the carry for the next column.

For our example:

- `sum % 2` is `2 % 2`, which is `0`. So, we insert `0` at the beginning of `result`.
- `sum / 2` is `2 / 2`, which is `1`. So, the carry for the next column becomes `1`.

We continue this process for each digit until we have processed all digits and no carry is left.

finally in this example the carry is 1 again it enters while loop and gets appended in the result.