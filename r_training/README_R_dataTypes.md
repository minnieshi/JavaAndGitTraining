# datatypes
R provides a variety of data types beyond the basic ones. Here's a **complete list of R data types**, including both **atomic types** and **more complex types**:

---

## **1\. Atomic Data Types**

Atomic types represent the simplest types of data in R. Each atomic vector contains elements of only one type.

1. **Logical**:

    - Values: `TRUE`, `FALSE`, `NA` (missing value).
    - Example:

      `x <- c(TRUE, FALSE, NA)`

2. **Integer**:

    - Whole numbers, created using the `L` suffix or functions like `as.integer()`.
    - Example:

      `x <- c(1L, 2L, 3L)  # Integer vector`

3. **Numeric (Double)**:

    - Real numbers (default type for numbers in R).
    - Example:

      `x <- c(1.5, 2.5, 3.0)`

4. **Complex**:

    - Complex numbers with real and imaginary parts.
    - Example:

      `x <- c(1 + 2i, 3 - 4i)`

5. **Character**:

    - Strings or text data.
    - Example:

      `x <- c("apple", "banana", "cherry")`

6. **Raw**:

    - Binary data stored as raw bytes.
    - Example:

      `x <- charToRaw("Hello")`


---

## **2\. Special Data Types**

These are special values that represent specific states in R.

1. **NULL**:

    - Represents the absence of a value or an empty object.
    - Example:

      `x <- NULL`

2. **NA**:

    - Represents missing values (can be logical, integer, numeric, character, etc.).
    - Example:

      `x <- c(1, NA, 3)`

3. **NaN (Not a Number)**:

    - Represents undefined mathematical operations (e.g., `0/0`).
    - Example:

      `x <- 0 / 0`

4. **Inf and -Inf**:

    - Represent positive and negative infinity.
    - Example:

      `x <- c(1 / 0, -1 / 0)`


---

## **3\. Composite Data Types**

These types can store multiple elements or structures.

1. **Vector**:

    - A sequence of elements of the same atomic type.
    - Example:

      `x <- c(1, 2, 3, 4)`

2. **List**:

    - A collection of elements of different types.
    - Example:

      `x <- list(1, "apple", TRUE)`

3. **Matrix**:

    - A two-dimensional array where all elements are of the same atomic type.
    - Example:

      `x <- matrix(1:6, nrow = 2, ncol = 3)`

4. **Array**:

    - A multi-dimensional generalization of matrices (can have more than 2 dimensions).
    - Example:

      `x <- array(1:12, dim = c(2, 3, 2))`

5. **Data Frame**:

    - A table where each column can have a different type.
    - Example:

      `x <- data.frame(Name = c("Alice", "Bob"), Age = c(25, 30))`

6. **Factor**:

    - Used to represent categorical data, with fixed possible values (levels).
    - Example:

      `x <- factor(c("low", "medium", "high"))`

7. **Time Series (`ts`)**:

    - Represents regularly spaced time series data.
    - Example:

      `x <- ts(1:10, start = c(2023, 1), frequency = 12)`


---

## **4\. S3, S4, and Reference Classes (Object-Oriented Types)**

R supports object-oriented programming through three systems: **S3**, **S4**, and **R6**.

1. **S3 Class**:

    - Informal and flexible object-oriented system.
    - Example:

```r
person <- list(name = "Alice", age = 25)
class(person) <- "Person"

```

2. **S4 Class**:

    - Formal object-oriented system with strict class and method definitions.
    - Example:

```r
setClass("Person", 
         slots = list(name = "character", age = "numeric"))
alice <- new("Person", name = "Alice", age = 25)

```

3. **R6 Class**:

    - Reference-based object-oriented system, similar to other OOP languages.
    - Example:

```r
library(R6)
Person <- R6Class("Person",
                  public = list(
                    name = NULL,
                    age = NULL,
                    initialize = function(name, age) {
                      self$name <- name
                      self$age <- age
                    }))
alice <- Person$new("Alice", 25)

```


---

## **5\. Special Data Structures**

1. **Tibble**:

    - A modern version of data frames provided by the `tibble` package.
    - Example:

```r
library(tibble)
x <- tibble(Name = c("Alice", "Bob"), Age = c(25, 30))
```

2. **Date and POSIXct/POSIXlt**:

    - Used for representing dates and date-time.
    - Example:

```r
date <- as.Date("2025-01-01")
datetime <- as.POSIXct("2025-01-01 12:34:56")

```

3. **Environment**:

    - A collection of symbol-value pairs, used for scoping.
    - Example:

```r
env <- new.env()
env$x <- 42

```


---

## **6\. Functions**

- Functions are first-class objects in R, meaning they can be assigned to variables, passed as arguments, and returned by other functions.
- Example:

```r
my_function <- function(x, y) {
  return(x + y)
}

```

---

## **Summary Table**

| **Type** | **Description** |
| --- | --- |
| Logical | Boolean values (`TRUE`, `FALSE`, `NA`) |
| Integer | Whole numbers (`1L`, `2L`) |
| Numeric (Double) | Real numbers (`1.5`, `2.5`) |
| Complex | Complex numbers (`1 + 2i`) |
| Character | Text data (`"apple"`, `"banana"`) |
| Raw | Binary data |
| NULL | Absence of value |
| NA | Missing value |
| NaN | Undefined result (`0/0`) |
| Inf / -Inf | Infinity (`1/0`, `-1/0`) |
| Vector | Sequence of elements of the same type |
| List | Collection of elements of different types |
| Matrix | Two-dimensional array |
| Array | Multi-dimensional array |
| Data Frame | Table-like structure |
| Factor | Categorical data |
| Time Series (`ts`) | Regularly spaced time series |
| S3 Class | Informal object-oriented class |
| S4 Class | Formal object-oriented class |
| R6 Class | Reference-based object-oriented class |
| Tibble | Modern data frame |
| Date / POSIXct | Date and date-time |
| Environment | Collection of symbol-value pairs |

---

This comprehensive list should cover most of the data types you’ll encounter or use in R!


---
# Note (surprise)

## Character
R does not differentiate character and string

## List
R list is like scala tuple, it allows different data types. 
R list each element has a name too, while scala tuple only has positions.

## NULL, NA, NaN
In R, **`NULL`**, **`NA`**, and **`NaN`** are three distinct concepts representing different types of missing or undefined values. Here's a detailed comparison of each:

---

### **1\. `NULL`**

**`NULL`** represents the **absence of a value** or an **empty object**. It is often used to indicate that an object does not exist or is undefined.

#### **Characteristics**

- `NULL` is used to represent missing elements in lists, data frames, or other complex objects.
- `NULL` has **no type** or length (`length(NULL)` is 0).
- It is often used as a placeholder when no value is available.

#### **Examples**

```r
x <- NULL
is.null(x)  # TRUE

length(NULL)  # 0

```

- In a list, an element can be explicitly set to `NULL` to indicate that it is absent:

```r
my_list <- list(a = 1, b = NULL, c = 3)
my_list
# Output: $a [1] 1
#         $c [1] 3

```

---

### **2\. `NA` (Not Available)**

**`NA`** represents a **missing or undefined value** in R. Unlike `NULL`, `NA` is a placeholder for a missing value in a **vector**, **data frame**, or **matrix**.

#### **Characteristics**

- `NA` can appear in vectors, data frames, and matrices.
- `NA` can have different types: `NA_integer_`, `NA_real_`, `NA_character_`, `NA_complex_`.
- Operations involving `NA` generally result in `NA`, unless handled explicitly.
- `is.na()` checks for `NA` values.

#### **Examples**

```r
x <- c(1, 2, NA, 4)
is.na(x)  # FALSE FALSE TRUE FALSE

mean(x)  # NA (because NA is present)

# To ignore NA values in calculations:
mean(x, na.rm = TRUE)  # 2.333333

```

- `NA` can be of different types:

```r
NA_integer_  # Integer NA
NA_real_     # Numeric NA
NA_character_  # Character NA

```

---

### **3\. `NaN` (Not a Number)**

**`NaN`** represents a value that is **undefined mathematically**, such as the result of dividing `0/0` or taking the square root of a negative number.

#### **Characteristics**

- `NaN` is a type of numeric value (`typeof(NaN)` returns `"double"`).
- `NaN` is considered a special case of `NA`, meaning all `NaN` values are also `NA`, but not all `NA` values are `NaN`.
- Use `is.nan()` to check specifically for `NaN` values.
- Use `is.na()` to check for both `NA` and `NaN`.

#### **Examples**

```r
x <- 0 / 0  # NaN
is.nan(x)   # TRUE
is.na(x)    # TRUE (NaN is a special type of NA)

y <- sqrt(-1)  # NaN (complex numbers required)

```

---

### **Key Differences**

| **Aspect** | **`NULL`** | **`NA`** | **`NaN`** |
| --- | --- | --- | --- |
| **Meaning** | Absence of a value or empty object | Missing value | Not a number (undefined result) |
| **Type** | No type | Depends on context (integer, real, character, etc.) | Numeric (`double`) |
| **Length** | 0 | 1 | 1 |
| **Usage** | Used to represent absence of an object or missing elements in lists | Used to represent missing values in vectors, data frames, or matrices | Used for undefined mathematical operations |
| **Check function** | `is.null()` | `is.na()` | `is.nan()` |
| **Special Notes** | Cannot exist in vectors; has length 0 | Can exist in vectors, matrices, and data frames | A special case of `NA`; `is.na()` returns `TRUE` for `NaN` |

---

### **When to Use Each**

- **Use `NULL`**:

    - When you want to represent the **absence of an object** (e.g., a missing list element or an empty return value).
    - When initializing variables or indicating that a function has no result.
- **Use `NA`**:

    - When you want to represent a **missing value** in a vector, matrix, or data frame.
    - For handling datasets with incomplete or missing data.
- **Use `NaN`**:

    - When dealing with **undefined numeric results**, such as division by zero or invalid mathematical operations.
    - To check for invalid computations in numeric data.

---

### **Examples to Clarify Usage**

#### **Example 1: `NULL` vs `NA` in Lists**

```r
my_list <- list(a = 1, b = NULL, c = NA)
length(my_list)  # 3 (NULL is still counted as an element)
is.null(my_list$b)  # TRUE
is.na(my_list$c)    # TRUE

```

#### **Example 2: `NA` vs `NaN` in Calculations**

```r
x <- c(1, 2, NA, NaN)
is.na(x)   # TRUE for both NA and NaN
is.nan(x)  # FALSE FALSE FALSE TRUE (only TRUE for NaN)

```

#### **Example 3: Handling Missing Data with `NA`**

```r
data <- c(10, 20, NA, 40)

# Calculate mean ignoring NA values
mean(data, na.rm = TRUE)  # 23.33333

# Replace NA with a default value
data[is.na(data)] <- 0
print(data)  # [1] 10 20  0 40

```
---

### **Summary**

- **`NULL`** represents the absence of a value or object.
- **`NA`** represents missing data in vectors, matrices, and data frames.
- **`NaN`** represents undefined or invalid numeric results.
- Use `is.null()`, `is.na()`, and `is.nan()` to check for these special values in your R code
