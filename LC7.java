// reverse integer
//Input: x = -123
//Output: -321

//Input: x = 120
//Output: 21

//Input: x = 1534236469
//Output: 0  (Because reverse overflows 32-bit range)

class Solution {
    public int reverse(int x) {
        int result = 0;

        while(x != 0)
        {
            int digit = x % 10;
            x = x / 10;
            
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || 
               (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;

        }

        return result;
    }
}
