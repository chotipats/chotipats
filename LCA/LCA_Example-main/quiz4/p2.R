# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz4/p2.R", echo=TRUE)

VS = complex(mod=5, arg=0)
IP = complex(mod=0.075, arg=-pi/2)
omega = 1256.637

ZRS = 100
ZRP = 80
ZL1 = 1i * omega * 10e-3
ZC1 = 1 / (1i* omega * 0.1e-3)
ZR1 = 50
ZC2 = 1 / (1i * omega * 0.2e-3)
ZL2 = 1i * omega * 100e-3
ZRL = 75

ZT1 = ZL1 + ZC1
ZT2 = 1 / (1/ZR1 +1/ZC2 +1/ZL2 +1/ZRL)

eq1 = c(-(1/ZRS +1/ZRP +1/ZT1), 1/ZT1)
eq2 = c(1/ZT1, -(1/ZT1 +1/ZT2))

constant = c(IP -VS/ZRS, 0)

a = rbind(eq1, eq2)

VB = solve(a, constant)[1]
cat("VB: mod=", Mod(VB), ",arg=", Arg(VB))


VD = solve(a, constant)[2]
cat("VD: mod=", Mod(VD), ",arg=", Arg(VD))