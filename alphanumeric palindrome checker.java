A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is equal to its reverse
        StringBuilder reversedString = new StringBuilder(cleanedString).reverse();
        return cleanedString.equals(reversedString.toString());
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "0P";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false
        System.out.println(isPalindrome(s3)); // true
    }
}
The input string s is converted to lowercase using toLowerCase().
All non-alphanumeric characters are removed from the string using the regular expression [^a-zA-Z0-9] and the replaceAll method. This leaves only letters and numbers in the string.
The cleaned string is stored in the cleanedString variable.
A StringBuilder object is created from the cleanedString, and its reverse() method is called to obtain the reversed string.
The original cleanedString is compared with the reversed string using the equals() method.
The method returns true if the strings are equal (i.e., the original string is a palindrome), and false otherwise

OPTIMIZED CODE USING POINTERS
class Solution {
    public boolean isPalindrome(String s) {
      if(s==null || s.isEmpty()){
          return true;
      }
      int left = 0;
      int right = s.length()-1;
      while(left<right){
          char leftChar = Character.toLowerCase(s.charAt(left));
          char rightChar = Character.toLowerCase(s.charAt(right));
          if(!Character.isLetterOrDigit(leftChar)){
              left++;
          }else if(!Character.isLetterOrDigit(rightChar)){
              right--;
          }else if(leftChar!=rightChar){
              return false;
          }else{
              left++;
              right--;
          }
      }
      return true;
    }
}
The method first checks if the input string is null or empty. If so, it returns true since null and empty strings are considered palindromes by convention.
Instead of creating a new string and reversing it, the method uses two pointers (left and right) to traverse the string from both ends.
The method uses Character.toLowerCase and Character.isLetterOrDigit to handle case-insensitivity and non-alphanumeric characters directly, without creating a new string or using regular expressions.
The method skips over non-alphanumeric characters by incrementing left or decrementing right until it finds an alphanumeric character.
If the characters at left and right are different (after converting to lowercase), the method returns false immediately, as the string cannot be a palindrome.
If the characters at left and right are the same, the method moves both pointers inward.
If the loop completes without finding any mismatches, the method returns true, indicating that the string is a palindrome.
This optimized version has a time complexity of O(n), where n is the length of the input string, as it only needs to traverse the string once. It also has a constant space complexity, as it uses only a few variables to store the pointers and characters.


