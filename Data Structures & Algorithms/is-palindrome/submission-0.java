class Solution {
    public boolean isPalindrome(String s) {
        // 1. Convert to lowercase and change to a char array to handle case-insensitivity
        char[] arrayConversion = s.toLowerCase().toCharArray();

        // 2. Initialize pointers at the beginning and end
        int leftPointer = 0;
        int rightPointer = arrayConversion.length - 1;

        // 3. Loop until the pointers meet in the middle
        while (leftPointer < rightPointer) {
            
            // Skip non-alphanumeric characters from the left
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(arrayConversion[leftPointer])) {
                leftPointer++;
            }
            
            // Skip non-alphanumeric characters from the right
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(arrayConversion[rightPointer])) {
                rightPointer--;
            }

            // 4. Compare the actual characters
            if (arrayConversion[leftPointer] != arrayConversion[rightPointer]) {
                return false; // Found a mismatch, not a palindrome
            }

            // 5. Move both pointers inward for the next check
            leftPointer++;
            rightPointer--;
        }

        // If the loop finished without returning false, it is a valid palindrome
        return true;
    }
}