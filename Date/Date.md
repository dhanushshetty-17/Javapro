# Date Validation Program (Java)

##  What This Program Does
This is a very simple Java program that checks whether a **given date (number)** is **valid or not**.

👉 The program assumes that a valid date should be between **1 and 31**, just like the days in a month.

---

##  Steps of the Program
1. The program asks the user to enter a **date (number)**.
2. It checks whether the entered number is **less than or equal to 31**.
3. If it is, the program prints **“Date is valid”**.
4. Otherwise, it prints **“Date is not valid”**.

---

##  Example

**Input 1:**
```
Enter the Date :
25
```

**Output 1:**
```
Date is valid
```

**Input 2:**
```
Enter the Date :
45
```

**Output 2:**
```
Date is not valid
```

---

##  Code Explanation

### Important Lines:
- `Scanner sc = new Scanner(System.in);`  
  → Allows the user to type a number from the keyboard.

- `if (num <= 31)`  
  → Checks whether the entered date is within the valid range (1–31).

- `System.out.println("Date is valid");`  
  → Prints the result if the condition is true.

- `else`  
  → Runs if the number is greater than 31, meaning it’s not a valid date.

---

##  How to Run the Program

1. Save the file as **Date.java**
2. Open **Command Prompt (Windows)** or **Terminal (Mac/Linux)**
3. Run the following commands:

   **To compile:**
   ```
   javac Date.java
   ```

   **To run:**
   ```
   java Date
   ```

---

##  Notes
- This program only checks if the date is **between 1 and 31**.
- It does **not check the month**, so it won’t handle months like February (which only has 28 or 29 days).
- Works for **positive integers only**.

---

##  Made By
**Dhanush Shetty**  
A beginner-friendly Java program to practice **if-else conditions and input handling**.
