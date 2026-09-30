class Solution {
    public int reverse(int x) {
        int rev = 0;  // this will store reversed number

        while (x != 0) {
            int digit = x % 10;   // get last digit
            x /= 10;              // remove last digit

            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;  // overflow case
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;  // underflow case
            }

            rev = rev * 10 + digit;  // add digit to reversed number
        }

        return rev;
    }
}
