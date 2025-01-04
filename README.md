# Language

## typing
### Static vs dynamic
The distinction between static typing and dynamic typing in programming languages primarily revolves around how and when type-checking occurs in a program
### strong vs weak
The distinction between strong typing and weak typing relates to how strictly a programming language enforces type rules, especially when it comes to implicit type conversions (often called "type coercion").
### matrix
a matrix categorizing programming languages based on their **type strength** (strong vs. weak) and **type checking** (dynamic vs. static):

| **Language** | **Strong & Static** | **Strong & Dynamic** | **Weak & Static** | **Weak & Dynamic** |
| --- | --- | --- | --- | --- |
| **C++** | ✅ |  |  |  |
| **Java** | ✅ |  |  |  |
| **Rust** | ✅ |  |  |  |
| **Scala** | ✅ |  |  |  |
| **Go** | ✅ |  |  |  |
| **Python** |  | ✅ |  |  |
| **Ruby** |  | ✅ |  |  |
| **JavaScript** |  |  |  | ✅ |
| **PHP** |  |  |  | ✅ |
| **C** |  |  | ✅ |  |
| **Perl** |  |  |  | ✅ |
| **TypeScript** | ✅ (when fully typed) | ✅ (when partially typed) |  |  |

* * *

# Structure
One Git Repo for Multiple Independent Projects:
While there are clear benefits, it's not always the right approach. Here are some considerations:

#### **1\. Independence and Scaling**

*   If projects are truly independent, having them in separate repositories ensures they can evolve independently without being tied to the history, tags, or branches of other projects.

#### **2\. Complexity in Git History**

*   The Git history might become cluttered with unrelated changes from other projects, making it harder to focus on the history of a specific project.

#### **3\. CI/CD Complexity**

*   Setting up CI/CD pipelines can become more complex as you need to ensure pipelines are scoped correctly for individual projects.

#### **4\. Permissions**

*   If certain projects should have restricted access, a single repository might complicate permission management.

#### **5\. Repository Size**

*   As the repository grows with more projects, it might become large and slow to clone or fetch, especially for contributors only interested in a subset of the projects.

# about using IntelliJ for multiple projects
*   If the projects are independent but managed in one Git repository, it's best to add each project as a **module** in IntelliJ.
*   If IntelliJ prompts to auto-detect them as Maven or Gradle projects, you can accept and configure them individually.
*   Use separate IntelliJ projects only if the projects are entirely unrelated and don’t need to be worked on together.
