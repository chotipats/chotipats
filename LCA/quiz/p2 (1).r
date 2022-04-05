# source("E:/ComputerEn/Y 1/Semester 2/LCA/tutorial/quiz4/p2.R", echo=TRUE)

omega = 1256.637


VS = complex(mod=5, arg=0)
IP = complex(mod=0.075, arg=-pi/2)

# ZL = function(L) {
#   return 1i * omega * L;
# }

ZL1 = 1i * omega * 10e-3
ZL2 = 1i * omega * 100e-3
ZC1 = 1 / (1i * omega * 0.1e-3)
ZC2 = 1 / (1i * omega * 0.2e-3)
ZRS = 100
ZRP = 80
ZR1 = 50
ZRL = 75

ZT1 = ZL1 + ZC1
ZT2 = 1 / (1/ZR1 + 1/ZC2 + 1/ZL2 + 1/ZRL)


#1
omega
Mod(VS)
Arg(VS)

#2 
omega
Mod(IP)
Arg(IP)

# 3 - 4 - 5 - 6
ZL1
ZL2
ZC1
ZC2

# 7

a = rbind(c(-(1/ZRS + 1/ZRP + 1/ZT1), 1/ZT1), c(1/ZT1, -(1/ZT1 + 1/ZT2)))
b = c(IP-VS/ZRP, 0)
# 8
VB = solve(a, b)[1]
Mod(VB)
Arg(VB)

# 9
VD = solve(a, b)[2]
Mod(VD)
Arg(VD)

# 10
omega
omega / (2 * pi)

# 11
Mod(VD)
Arg(VD)

# 12
Mod(VD/VB)

