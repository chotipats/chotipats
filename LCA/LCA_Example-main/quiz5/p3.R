# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz5/p3.R", echo=TRUE)

Mod(100 + 20i)

# 5
VRMS = 500
P = 100
pf = 0.8

Z = complex(mod=VRMS^2*pf/P, arg=acos(pf))
cat("Z=", Z)

# 6
VRMS = 500
P = 100
pf = 0.9
Z = complex(mod=VRMS^2*pf/P, arg=-acos(pf))
cat("Z=", Z)

