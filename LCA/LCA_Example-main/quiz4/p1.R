# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz4/p1.R", echo=TRUE)

VS = complex(mod=20, arg=0)

omega = 100

ZR1 = 40
ZL1 = 1i * omega * 400e-3
ZC1 = 1 / (1i * omega * 500e-6)


# 1 
cat("VS: mod=", Mod(VS), ",arg=", Arg(VS))

# 2 - 3 - 4
cat("impedance R1:", ZR1)
cat("impedance L1:", ZL1)
cat("impedance C1:", ZC1)

# 5
VB = VS / ((ZR1 * (1/ZR1 +1/ZL1 +1/ZC1)))
cat("VB: mod=", Mod(VB), "arg=", Arg(VB))

# 6
IX = VB / ZL1
cat("IX: mod=", Mod(IX), "arg=", Arg(IX))

# 7
cat("Omega of IX:", omega)

# 8



