# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz5/p1.R", echo=TRUE)


f = 50
omega = 2 * pi * f
# 1
VA = complex(mod=220*sqrt(2), arg=0)
cat("VA mod=", Mod(VA), ", arg=", Arg(VA))

# 2
IAB = complex(mod=0.4*sqrt(2), arg=-1.41372)
cat("IAB mod=", Mod(IAB), ", arg=", Arg(IAB))

# 3
Z = VA / IAB
cat("impedance=", Z)

# 4
cat("R1=", Re(Z))

# 5
cat("L1=", Im(Z)/omega)




