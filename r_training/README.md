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
