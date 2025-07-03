// palindrome number

#include<stdbool.h>
#include<limits.h>

bool isPalindrome(int x) {

    if(x < 0){
        return false;
    }

    int orignal = x;
    int rev = 0;
    int digit;

    while(x != 0){
        digit = x % 10;

         if (rev > (INT_MAX - digit) / 10) {
            return false;  
        }

        rev = rev * 10 + digit;
        x = x / 10; 
    }

    return orignal == rev;
}
