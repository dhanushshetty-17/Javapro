# Ascending Order Program (Java)

##  What This Program Does

This is a simple Java program that asks the user to enter **three different numbers** and then shows them in **ascending order** (from smallest to biggest).

---

##  Steps of the Program

1. The program asks you to type **three numbers**.
2. It compares the numbers using **if-else statements**.
3. It then prints them in **ascending order**.

---

##  Example

**Input:**

```
Enter 3 numbers: Assuming all numbers are unique
12
5
9
```

**Output:**

```
Ascending order is:
5 9 12
```

---

##  Code Explanation
Key Parts:

`Scanner sc = new Scanner(System.in);`  
Used to take user input.

Nested if-else structure:  
It checks all possible combinations of numbers to ensure correct ordering.

Example logic:

```java
if (num1 < num2 && num1 < num3) {
    // num1 is smallest
    if (num2 < num3)
        System.out.println(num1 + " " + num2 + " " + num3);
    else
        System.out.println(num1 + " " + num3 + " " + num2);
}
```

---

##  How to Run the Program

1. Save the file with the name **Acending.java**
2. Open **Command Prompt (Windows)** or **Terminal (Mac/Linux)**
3. Type the following commands:

   **To compile:**
   ```
   javac Acending.java
   ```

   **To run:**
   ```
   java Acending
   ```

---

##  Important Notes

* Make sure all three numbers are **different**.
* If you enter the same number twice, the result may not be correct.
* The program only works for **integers** (whole numbers).

---

##  Made By

**Dhanush Shetty**  
A beginner-friendly Java project to understand how **if-else conditions** work.
