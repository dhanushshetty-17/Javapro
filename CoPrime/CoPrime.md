# CoPrime Program (Java)

##  What This Program Does

This is a simple Java program that checks whether **two numbers** entered by the user are **CoPrime numbers** or not.

👉 Two numbers are **CoPrime** if their **GCD (Greatest Common Divisor)** is **1** — that means they don’t share any common factor other than 1.

---

##  Steps of the Program

1. The program asks the user to enter **two numbers**.
2. It calculates the **GCD (Greatest Common Divisor)** of the two numbers using a loop.
3. If the GCD is **1**, it prints that the numbers are **CoPrime**.
4. Otherwise, it prints that the numbers are **not CoPrime**.

---

##  Example

**Input:**

```
Enter the 1st number :
14
Enter the 2nd number :
15
```

**Output:**

```
The numbers 14 and 15 are CoPrime
```

---

##  Code Explanation

### Key Parts:

* `Scanner sc = new Scanner(System.in);` → Lets the user enter numbers from the keyboard.
* `for (int i = 1; i <= a && i <= b; i++)` → Loops through all numbers from 1 up to the smallest of the two numbers.
* `if (a % i == 0 && b % i == 0)` → Checks if `i` divides both numbers (a common factor).
* `gcd = i;` → Keeps updating the greatest common divisor found so far.
* Finally, if `gcd == 1`, it prints that the numbers are CoPrime.

---

##  How to Run the Program

1. Save the file as **CoPrime.java**
2. Open **Command Prompt (Windows)** or **Terminal (Mac/Linux)**
3. Type these commands:

   **To compile:**

   ```
   javac CoPrime.java
   ```

   **To run:**

   ```
   java CoPrime
   ```

---

## Important Notes

* CoPrime means the two numbers **don’t have any common factor** except 1.
* Example: (8, 15) → CoPrime ✅
  (8, 12) → Not CoPrime ❌
* Works for **positive integers**.

---

##  Made By

**Dhanush Shetty**
A simple Java project for beginners to understand **loops, conditions, and GCD calculation**.
