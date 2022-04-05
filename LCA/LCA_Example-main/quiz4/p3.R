# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz4/p3.R", echo=TRUE)

V1 = complex(mod=5, arg=0)
V2 = complex(mod=5, arg=0)
V3 = complex(mod=5, arg=0)
F1 = 100
F2 = 200
F3 = 300
omega1 = 2 * pi * F1
omega2 = 2 * pi * F2
omega3 = 2 * pi * F3

# when V1 acting alone
omega = omega1
V = V1
######################
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

VE = V
VD = V / (ZT1 * (1/ZT1 +1/ZT2))

cat("V1 acting alone VE: mod=", Mod(VE), ",arg=", Arg(VE))
cat("V1 acting alone VD: mod=", Mod(VD), ",arg=", Arg(VD))

# when V1 acting alone
omega = omega2
V = V2
######################
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

VE = V
VD = V / (ZT1 * (1/ZT1 +1/ZT2))

cat("V2 acting alone VE: mod=", Mod(VE), ",arg=", Arg(VE))
cat("V2 acting alone VD: mod=", Mod(VD), ",arg=", Arg(VD))

# when V3 acting alone
omega = omega3
V = V3
######################
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

VE = V
VD = V / (ZT1 * (1/ZT1 +1/ZT2))

cat("V3 acting alone VE: mod=", Mod(VE), ",arg=", Arg(VE))
cat("V3 acting alone VD: mod=", Mod(VD), ",arg=", Arg(VD))


