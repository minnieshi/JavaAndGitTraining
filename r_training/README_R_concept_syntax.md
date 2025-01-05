R is a programming language and environment primarily used for statistical computing and graphics. It is widely used in data analysis, statistical modeling, and visualization.

# R language
R is strongly but dynamically typed, functional and interpreted (therefore not compiled)

## **Key Concepts:**

### 1\.  **Vectors**:

    *   The most basic data structure in R. It contains elements of the same type (e.g., numeric, character, logical).
    *   Example:


        `x <- c(1, 2, 3, 4)
        y <- c("a", "b", "c")`

### 2\.  **Data Frames**:

    *   A table-like structure where columns can have different data types (like a spreadsheet).
    *   Example:

        `df <- data.frame(Name = c("Alice", "Bob"), Age = c(25, 30))`

### 3\.  **Functions**:

    *   R has a rich set of built-in functions, and you can also define your own.
    *   Example:

        `my_function <- function(x) {
        return(x^2)
        }
        my_function(3) # Output: 9`

### 4\.  **Packages**:

    *   Extend R's capabilities (e.g., `ggplot2` for visualization, `dplyr` for data manipulation).
    *   Install a package:


        `install.packages("ggplot2")
        library(ggplot2)`

### 5\.  **Control Structures**:

    *   Conditional statements (`if`, `else`).
    *   Loops (`for`, `while`).
    *   Example:

        `if (x > 5) {
        print("Greater than 5")
        } else {
        print("Less than or equal to 5")
        }`

### 6\.  **Plots**:

    *   Basic plotting:

        `plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")`


* * *

## **R Syntax Basics**

### **Assignment**:

*   Use `<-` or `=` to assign values.

    `x <- 10
    y = 20`


### **Basic Data Types**:

*   Numeric, Character, Logical, Integer, Complex.

### **Comments**:

*   Use `#` for comments.

    `# This is a comment`


### **Vectors**:

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

### **Subsetting**:

*   Access elements by index (1-based):

    `vec[1]  # First element`


### **Matrices**:

*   Create with `matrix()`:

    `mat <- matrix(1:9, nrow = 3, ncol = 3)`


### **Data Frames**:

*   Access columns by `$` or `[]`:

    `df$Name
    df[1, ]  # First row`


### **Control Structures**:

*   Example:

    `for (i in 1:5) {
    print(i)
    }`


### **Functions**:

*   Define and use:

    `add <- function(a, b) {
    return(a + b)
    }
    add(5, 10)  # Output: 15`


### **File Operations**:

*   Reading and writing data:

    `df <- read.csv("data.csv")
    write.csv(df, "output.csv")`


* * * 

# Notes from FAQ
below is a collection of notes for the R basic concepts and syntax

## Statement (space, new line)
### **What is a Statement**
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

### **When do newlines matter?**

Newlines matter only when they interrupt a statement that isn’t complete. If R expects more input (e.g., an open parenthesis, bracket, or incomplete expression), it will continue reading the next line.

#### Example 1: Newlines within a statement (allowed)


`mat <- matrix(   c(1, 2, 3),   nrow = 1 ) print(mat)`

R understands that the statement isn’t complete until it encounters the closing parenthesis, so splitting it across multiple lines is fine.

#### Example 2: Breaking a statement incorrectly (error)


`x <-  10`

This produces an error because R expects the assignment to be completed on the same line as `x <-`.

#### New line In other words
A **newline (line break)** in R:

1. **Creates a new statement** when the previous statement is complete.
2. **Is ignored (treated as if it didn’t exist)** when the previous statement is incomplete, meaning R expects more input

**Key Takeaway**

- **If a statement is complete before a newline**, R starts a new statement on the next line → **newline matters**.
- **If a statement is incomplete before a newline**, R ignores the newline and continues reading → **newline does not matter**.

**Newlines in R can**:
- End a complete statement, in which case they matter because they indicate that a new statement begins.
- Be ignored if the statement is incomplete, in which case they don’t matter because R continues reading.

### Summary:
* you can write **multiple statements on a single line**, but you need to separate them with a **semicolon (`;`)**.

* Spaces and new lines generally don’t affect R syntax.
* You can split a single statement across multiple lines, and R will handle it correctly **as long as** the syntax is valid. (self note: this has tricky details)

* * *

## R is functional or not
The statement:

> **"R is strongly but dynamically typed, functional and interpreted (therefore not compiled)"**

describes some key characteristics of the R language. However, in this context, the term **"functional"** does **not** specifically mean that variables are immutable (unlike purely functional languages like Haskell, where immutability is enforced by design).

---

### **What does "functional" mean in R?**

In R, **"functional"** refers to the fact that:

1. **Functions are first-class citizens**:

    - Functions in R can be assigned to variables, passed as arguments to other functions, and returned as values.
    - Example:

    ```r
    f <- function(x) x^2
    g <- function(h, y) h(y)  # Pass a function as an argument
    g(f, 3)
    # Output: 9
    ```

2. **R encourages a functional programming style**:

    - Many operations in R can be expressed using higher-order functions (functions that take other functions as arguments), such as `lapply()`, `sapply()`, `map()` from the `purrr` package, etc.
    - Example:

    ```r
    lapply(1:5, function(x) x^2)
    # Output: list(1, 4, 9, 16, 25)
    ```

3. **Functions are used as the primary means of abstraction**:

    - R heavily relies on functions for structuring code and performing computations.

---

### **Are variables immutable in R?**

No, variables in R are **not immutable**. You can reassign values to variables freely:

```r
x <- 10
x <- x + 5
print(x)  # Output: 15

```

This shows that variables in R are **mutable**, meaning you can change their values after they are created.

---

### **Does R support immutability?**

While immutability is not enforced by the language, you can adopt an **immutable coding style** by:

1. Avoiding reassignment of variables.
2. Using functions that do not modify their inputs directly but instead return new outputs (common in functional programming).

Example of an immutable coding style:

```r
add_five <- function(x) {
  x + 5
}

y <- 10
z <- add_five(y)
print(y)  # Original y is unchanged (immutable style)
print(z)  # Output: 15
```

---

### **Summary**

- **"Functional" in R** means that functions are first-class citizens, and the language supports and encourages a functional programming style.
- **R variables are mutable**, meaning you can reassign values to them.
- While immutability is not enforced by R, you can adopt an immutable style by avoiding reassignment and using pure functions.

---

## R self-help
documentation and navigation about a function or a package

you **can view the source code of R functions** directly in an IDE (like RStudio or IntelliJ) or from the R console. Since R is an **interpreted language**, much of its code (especially functions from the base packages) is written in R itself and can be inspected easily.

---

### **1\. How to View the Source Code of a Function**

You can simply type the name of the function **without parentheses** in the R console to display its source code.

#### **Example for `lapply`**:

```r
lapply
```

This displays:

```r
function (X, FUN, ...) {
  FUN <- match.fun(FUN)
  if (!is.vector(X) || is.object(X)) X <- as.list(X)
  .Internal(lapply(X, FUN))
}

```

- This shows that `lapply` is implemented in R but calls an internal C function (`.Internal(lapply(X, FUN))`) for its core logic.
- The **`.Internal`** functions are written in C and compiled into R’s core binary, so you won’t see their detailed implementation in R directly.

---

### **2\. How to Check Which Package a Function Belongs To**

To find out which package a function comes from, use the `getAnywhere()` or `find()` functions.

#### **Method 1: `getAnywhere()`**

```r
getAnywhere(lapply)
```

This will output:

```text
A single object matching ‘lapply’ was found
It was found in the following places
  package:base
  namespace:base

```

This tells you that `lapply` is part of the **`base` package**.

#### **Method 2: `find()`**

```r
find("lapply")
```

This returns:

```r
[1] "package:base"
```

This is a quicker way to determine the package.

---

### **3\. How to View the Source Code of Internal C Functions**

For functions that call **`.Internal()`**, **`.Primitive()`**, or **`.Call()`**, their core logic is implemented in R’s underlying C code. While you can’t view the C code directly from the R console, you can:

- **Access R’s C source code online**:

    - The source code for R is publicly available in its [GitHub repository](https://github.com/wch/r-source) or on CRAN’s source archive.
    - For example, the C implementation of `lapply` can be found in the file [`apply.c`](https://github.com/wch/r-source/blob/trunk/src/main/apply.c).
- **Search for the C code in your local R installation**: If you have the R source code downloaded locally, you can search through the C files. On macOS or Linux, you can use `grep`:

```shell
grep -R "lapply" /path/to/R/source/
```

---

### **4\. How to Get Detailed Documentation for a Function**

To see the official documentation of a function, use `?function_name` or `help("function_name")`.

#### **Example**:

```r
?lapply
```

This shows the official documentation, including:

- A description of what `lapply` does.
- Its arguments and return value.
- Examples of usage.

---

### **5\. How to See All Functions in a Package**

If you want to explore all the functions in a package (e.g., `base`), you can use the `ls()` function:

```r
ls("package:base")
```

Alternatively, for more detailed information about a package, use `help(package = "package_name")`:

```r
help(package = "base")
```

---

### **Summary**

- You can view the source code of most R functions by typing their name without parentheses.
- To find which package a function belongs to, use `getAnywhere()` or `find()`.
- Functions that call **`.Internal()`** or **`.Primitive()`** are implemented in R’s underlying C code, which can be viewed in the R source code.
- Use `?function_name` to access the official documentation of a function.

---

## R self-help explore

there are **browsing tools in R** that allow you to explore packages and their functions in an interactive and user-friendly way, where you can see all available packages and click/expand to view the functions under each package.

Here are some popular options:

---

### **1\. `help.start()` (Built-in HTML Help Browser)**

R provides a built-in HTML help system that you can use to browse packages and their functions.

#### **How to Use:**

1. Run the following command in R:
```r
help.start()
```
2\. This will open a web browser window showing R’s help system.
3\. In the browser, click on **"Packages"** to see a list of installed packages.
4\. Click on a package name to view its documentation, including a list of functions.

---

### **2\. `utils::help()` with a GUI**

If you’re using **RStudio**, the "Help" pane provides a built-in interface to browse packages and their functions. You can:

1. Go to the "Help" tab in RStudio.
2. Click **"Packages"** to view a list of installed packages.
3. Click a package to expand and browse its functions.

---

### **3\. `pkgdown` Websites for Packages**

Many popular R packages have their documentation hosted on dedicated websites using **`pkgdown`**, which provides a clean, searchable interface.

- You can find `pkgdown` sites by visiting a package's CRAN page and looking for a "Reference" or "Website" link.
- For example:
    - dplyr Reference
    - ggplot2 Reference

---

### **4\. Using `help(package = ...)` with RStudio's Help Pane**

If you're using RStudio, running `help(package = "base")` or any other package will display the package's help page in the Help pane, where you can browse through the functions interactively.

```r
help(package = "base")
```

---

### **5\. Using `pak::pkg_search()` for Searching and Exploring Packages**

The **`pak`** package, developed by RStudio, offers a convenient way to search and browse packages interactively.

#### **Example**:

```r
install.packages("pak")
pak::pkg_search("data")
```

This will show a list of packages related to "data" and allow you to browse them.

---

### **6\. Using `devtools::install_github()` to Browse Development Packages**

If you're interested in browsing packages hosted on GitHub, you can use **`devtools`** to install and explore them.

```r
devtools::install_github("author/package")

```

---

### **7\. External Tools: R Documentation Browsers**

There are also external tools and websites that provide a searchable interface for R packages:

- **[RDocumentation](https://www.rdocumentation.org/)**: A comprehensive website for searching and browsing R packages and functions.
- **[Metacran](https://www.r-pkg.org/)**: Provides a web-based interface for browsing CRAN packages.

---

### **Summary**

If you want an interactive browsing experience within R:

- Use `help.start()` for a built-in HTML browser.
- Use RStudio’s "Help" pane to browse packages interactively.
- Visit external documentation sites like **RDocumentation** or **pkgdown** websites for specific packages.

---

## R `import`/`use` a package
In **R**, the concept of **"importing"** packages or modules is primarily done using the `library()` or `require()` functions. However, unlike languages like Python (which has an explicit `import` keyword), R uses a combination of:

1. **`library()` or `require()`**: To load entire packages.
2. **Selective imports**: Through the **NAMESPACE** mechanism (used in packages).

---

### **1\. Using `library()` or `require()`**

- In most R scripts, you load an entire package by calling:

```r
library(ggplot2)
```

- This makes all exported functions from the package available in your current R session.

- For example, after running `library(ggplot2)`, you can directly call functions like `ggplot()` without prefixing them with `ggplot2::`.


---

### **2\. Selective Imports Using `::` or `:::`**

R allows you to **selectively import functions** from a package without loading the entire package using the **`::`** or **`:::`** operators.

- **`package::function`**: Accesses exported functions from the package.

```r
ggplot2::ggplot(data, aes(x, y))  # Use ggplot() without loading the entire package

```

- **`package:::function`**: Accesses non-exported (internal) functions. This is generally discouraged unless you have a specific reason.

```r
ggplot2:::print.ggplot  # Access an internal function
```

This approach is useful when:

- You only need one or two functions from a package.
- You want to avoid polluting your namespace with all the functions from a package.

---

### **3\. Importing in R Packages**

When developing an **R package**, you can control which functions from other packages are made available using the **NAMESPACE** file or the `Imports` field in the **`DESCRIPTION`** file.

#### **NAMESPACE File Directives**

- `import(package)`: Imports all exported functions from a package.

```text
import(ggplot2)
```

- `importFrom(package, function1, function2, ...)`: Imports specific functions from a package.

```text
importFrom(ggplot2, ggplot, aes)
```

This ensures that only the specified functions are imported, keeping the package's namespace clean.

#### **`DESCRIPTION` File**

In the `DESCRIPTION` file of an R package, you list dependencies under the `Imports` or `Depends` fields:

```text
Imports: ggplot2, dplyr
```

This tells R that your package depends on these packages but doesn’t attach them automatically when your package is loaded (unlike `Depends`).

---

### **4\. How `library()` Differs from Python’s `import`**

| **Aspect** | **R (`library()`)** | **Python (`import`)** |
| --- | --- | --- |
| **Imports entire package** | Yes, `library()` loads the entire package. | No, you can selectively import modules or functions. |
| **Selective import** | Yes, using `::` or `importFrom` in NAMESPACE. | Yes, via `from module import function`. |
| **Namespace pollution** | All exported functions become available unless `::` is used. | Only explicitly imported names are available. |
| **Internal functions** | Accessible via `:::` (non-exported functions). | Can be accessed by prefixing with `_`, but discouraged. |

---

### **Summary**

- R doesn’t have an explicit `import` keyword like Python, but you can load entire packages using `library()` or `require()`.
- For selective imports, you can use the `::` operator to access specific functions without loading the whole package.
- In R package development, the `Imports` field in the `DESCRIPTION` file and the `importFrom` directive in the NAMESPACE file provide finer control over imports.
