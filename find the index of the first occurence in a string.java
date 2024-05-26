import java.util.Scanner;

public class FirstOccurrenceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to find: ");
        String subStr = sc.nextLine();

        int index = findFirstOccurrenceIndex(str, subStr);

        if (index != -1) {
            System.out.println("The first occurrence of '" + subStr + "' is at index: " + index);
        } else {
            System.out.println("The substring '" + subStr + "' is not found in the string.");
        }

        sc.close();
    }

    public static int findFirstOccurrenceIndex(String str, String subStr) {
        int index = str.indexOf(subStr);
        return index;
    }
}
OUTPUT
Enter the string: yeshaashwini
Enter the substring to find: yesha
The first occurrence of 'yesha' is at index: 0

This program prompts the user to enter a string and a substring. 
Then, it calls the findFirstOccurrenceIndex method, which uses the indexOf method of the String class 
to find the index of the first occurrence of the substring within the string.
If the substring is found, it returns the index, otherwise, it returns -1.
Finally, the program prints out the index or a message indicating that the substring was not found.