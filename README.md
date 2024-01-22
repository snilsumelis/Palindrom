# Palindrome Checker

## Overview
This Java program includes a function to check if a given number is a palindrome. A palindrome is a number that remains the same when its digits are reversed.

## Usage
1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/snilsumelis/Palindrom
    ```

2. Navigate to the project directory:
    ```bash
    cd your-repository
    ```

3. Open the project in your preferred Java IDE.

4. Run the `Main` class in the `src` directory to execute the program.

5. The program includes a sample usage of the `isPalindrome` function, where the number `101` is checked for palindromicity:
    ```java
    public static void main(String[] args) {
        int num = 2476;
        System.out.println(isPalindrome(101));
    }
    ```

## Function Details
The `isPalindrome` function takes an integer as input and returns `true` if the number is a palindrome, and `false` otherwise. It uses a simple algorithm to reverse the digits of the input number and compares it with the original number.

```java
static boolean isPalindrome(int number){
    int temp = number;
    int reverseNum = 0, lastNum;

    while (temp != 0){
        lastNum = temp % 10 ;
        reverseNum = (reverseNum * 10) + lastNum;
        temp /= 10;
    }

    return number == reverseNum;
}
