# dependency declaration
if (!require("ggplot2")) {
  install.packages("ggplot2")
}
library(ggplot2)


# PLAY WITH USEFUL package STATEMENTS
# listing Installed Packages
# installed.packages()

# pkg <- installed.packages()
# write.csv(pkg, "packages.csv")

# PLAY WITH PLOTTING
# below had issues for margin
# par(mar = c(2, 2, 2, 2))  # Smaller margins
# plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")
#
# below had issues for margin
# dev.new(width = 8, height = 6)  # Open a new plot window with specified size
# plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")

# below works
# explicitly open a larger plotting device, such as x11() (on Linux), windows() (on Windows), or quartz() (on macOS):
# quartz(width = 8, height = 6)  # For macOS
# plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")

# below works
# Export to PDF
pdf("plot_output.pdf", width = 8, height = 6)
plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")
dev.off()
# below works
getwd()
# setwd("./r_training")
# Export to PNG
png("plot_output.png", width = 800, height = 600)
plot(1:10, main = "Simple Plot", xlab = "X-axis", ylab = "Y-axis")
dev.off()

## PLAY WITH function lapply/sapply
inclusiveRange <- 1:5
inclusiveRange
lapply(1:5, function(x) x^2)
# Output: list(1, 4, 9, 16, 25)

help(lapply)
