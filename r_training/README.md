- This file provides documentation about the project, including:
    - Project objectives
    - Instructions for running the analysis
    - Dependencies and how to install them
    - Any special notes about the data or analysis.
## Objective
todo

## Getting started
refer to [README_project_structure](./README_project_structure.md) SECTION "4\. Workflow Comparison"

1. install R (CRAN website)<Comprehensive R Archive Network>
2. install RStudio or IntelliJ (plus R plugin)
3. cd the-project-folder
4. start R, then:
   - either renv::restore()
   - or install renv package (> install.packages("renv")), then: renv::init() and then install the needed packages for your code (eg > install.packages("dplyr as example package")) and then freeze/save dependencies renv.lock (> renv::snapshot())

Later you can always open R project by RStudio or IntelliJ after this initial setup.

If new to R dependency management, read this [dependency management summary including often used command](./README_dependency_management.md)
and this: 
[renv](./README_renv.md)

## How to run the analysis
todo

## Other references
- **RStudio Documentation**: docs.posit.co
- **R for Data Science**: r4ds.had.co.nz
- **RStudio Cheatsheets**: posit.co/resources/cheatsheets/