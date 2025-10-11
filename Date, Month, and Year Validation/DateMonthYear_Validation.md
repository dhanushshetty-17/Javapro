# Date, Month, and Year Validation Program (Java)

## 🌟 What This Program Does
This is a simple Java program that asks the user to enter **day**, **month**, and **year** separately.  
It checks if each value is **valid** and then displays the complete date in the format:  
👉 `day/month/year`

---

## 🧩 Steps of the Program
1. The program asks the user to enter:
   - **Day**
   - **Month**
   - **Year**
2. It checks each value using **if conditions**:
   - Day must be between **1 and 31**  
   - Month must be between **1 and 12**  
   - Year must be a **4-digit number** (between 1000 and 9999)
3. If any value is invalid, it shows a message asking for a **valid input**.
4. Finally, it prints the **full date**.

---

## 🖥️ Example

**Input:**
```
Enter the day :
15
Enter the month :
8
Enter the year :
2024
```

**Output:**
```
Date is : 15/8/2024
```

---

**Example 2 (Invalid Input):**
```
Enter the day :
40
Enter the month :
13
Enter the year :
98
```

**Output:**
```
Enetr the valid day !
Enetr the valid month !
Enetr the valid year !
Date is : 40/13/98
```

---

## 💡 Code Explanation

### Important Lines:
- `Scanner sc = new Scanner(System.in);`  
  → Allows the user to type input from the keyboard.

- `if(day > 31 || day <= 0)`  
  → Checks if the entered day is between **1 and 31**.

- `if(month > 12 || month <= 0)`  
  → Checks if the entered month is between **1 and 12**.

- `if(year > 9999 || year <= 999)`  
  → Makes sure the entered year is a **4-digit number**.

- `System.out.println("Date is : "+day+"/"+month+"/"+year);`  
  → Displays the date in proper format.

---

## ⚙️ How to Run the Program

1. Save the file as **DateMonthYear.java**
2. Open **Command Prompt (Windows)** or **Terminal (Mac/Linux)**
3. Run the following commands:

   **To compile:**
   ```
   javac DateMonthYear.java
   ```

   **To run:**
   ```
   java DateMonthYear
   ```

---

## 🧾 Notes
- This program only checks **basic validity** (range checking).  
- It does **not check exact month-day combinations**, like:
  - February having 28 or 29 days.
  - April, June, September, and November having only 30 days.  
- You can improve it later using **conditional logic** for specific months or **leap year** checks.

---

## 🧑‍💻 Made By
**Dhanush Shetty**  
A beginner-friendly Java project to understand how to use **if conditions** and **user input validation**.
