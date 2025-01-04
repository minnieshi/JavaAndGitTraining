R is a programming language and environment primarily used for statistical computing and graphics. It is widely used in data analysis, statistical modeling, and visualization.

## R language
R is strongly but dynamically typed, functional and interpreted (therefore not compiled)

### **Key Concepts:**

1.  **Vectors**:

    *   The most basic data structure in R. It contains elements of the same type (e.g., numeric, character, logical).
    *   Example:


        `x <- c(1, 2, 3, 4)
        y <- c("a", "b", "c")`

2.  **Data Frames**:

    *   A table-like structure where columns can have different data types (like a spreadsheet).
    *   Example:


        `df <- data.frame(Name = c("Alice", "Bob"), Age = c(25, 30))`

3.  **Functions**:

    *   R has a rich set of built-in functions, and you can also define your own.
    *   Example:


        `my_function <- function(x) {
        return(x^2)
        }
        my_function(3) # Output: 9`

4.  **Packages**:

    *   Extend R's capabilities (e.g., `ggplot2` for visualization, `dplyr` for data manipulation).
    *   Install a package:


        `install.packages("ggplot2")
        library(ggplot2)`

5.  **Control Structures**:

    *   Conditional statements (`if`, `else`).
    *   Loops (`for`, `while`).
    *   Example:


        `if (x > 5) {
        print("Greater than 5")
        } else {
        print("Less than or equal to 5")
        }`

6.  **Plots**:

    *   Basic plotting:


        `plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")`


* * *

### **R Syntax Basics**

#### **Assignment**:

*   Use `<-` or `=` to assign values.

    `x <- 10
    y = 20`


#### **Basic Data Types**:

*   Numeric, Character, Logical, Integer, Complex.

#### **Comments**:

*   Use `#` for comments.

    `# This is a comment`


#### **Vectors**:

*   Create with `c()`:
    `vec <- c(1, 2, 3)`
* what does c stand for?
the function c() stands for "combine" or "concatenate". It is used to create vectors by combining individual elements into a single vector.
* element types
```r
vec <- c(1, "apple", TRUE)
print(vec)
# Output: [1] "1"     "apple" "TRUE"

```
Since R requires all elements of a vector to be of the same type, it coerces the elements to a common type (in this case, character).

#### **Subsetting**:

*   Access elements by index (1-based):

    `vec[1]  # First element`


#### **Matrices**:

*   Create with `matrix()`:

    `mat <- matrix(1:9, nrow = 3, ncol = 3)`


#### **Data Frames**:

*   Access columns by `$` or `[]`:

    `df$Name
    df[1, ]  # First row`


#### **Control Structures**:

*   Example:

    `for (i in 1:5) {
    print(i)
    }`


#### **Functions**:

*   Define and use:

    `add <- function(a, b) {
    return(a + b)
    }
    add(5, 10)  # Output: 15`


#### **File Operations**:

*   Reading and writing data:

    `df <- read.csv("data.csv")
    write.csv(df, "output.csv")`

#### ** statement** (space, new line)
##### **What is a Statement**
In R, a **statement** is a complete unit of code that performs an action or produces a result. A statement can be:

- **An assignment**: Assigning a value to a variable.

  `x <- 10`

- **A function call**: Calling a function with arguments.

  `print("Hello, world!")`

- **An expression**: Evaluating an expression.

  `2 + 2`

R recognizes the end of a statement when:

1. The line ends **without expecting more input** (e.g., after a complete expression).
2. A **semicolon (`;`)** explicitly separates two statements on the same line.

##### **When do newlines matter?**

Newlines matter only when they interrupt a statement that isn’t complete. If R expects more input (e.g., an open parenthesis, bracket, or incomplete expression), it will continue reading the next line.

###### Example 1: Newlines within a statement (allowed)


`mat <- matrix(   c(1, 2, 3),   nrow = 1 ) print(mat)`

R understands that the statement isn’t complete until it encounters the closing parenthesis, so splitting it across multiple lines is fine.

###### Example 2: Breaking a statement incorrectly (error)


`x <-  10`

This produces an error because R expects the assignment to be completed on the same line as `x <-`.

##### In other words
A **newline (line break)** in R:

1. **Creates a new statement** when the previous statement is complete.
2. **Is ignored (treated as if it didn’t exist)** when the previous statement is incomplete, meaning R expects more input

**Key Takeaway**

- **If a statement is complete before a newline**, R starts a new statement on the next line → **newline matters**.
- **If a statement is incomplete before a newline**, R ignores the newline and continues reading → **newline does not matter**.

**Newlines in R can**:
- End a complete statement, in which case they matter because they indicate that a new statement begins.
- Be ignored if the statement is incomplete, in which case they don’t matter because R continues reading.

##### Summary:
* you can write **multiple statements on a single line**, but you need to separate them with a **semicolon (`;`)**.

* Spaces and new lines generally don’t affect R syntax.
* You can split a single statement across multiple lines, and R will handle it correctly as long as the syntax is valid. (this is a tricky thing)
