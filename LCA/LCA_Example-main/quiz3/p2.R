# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz3/p2.R", echo=TRUE)

# Voc
VS = 4
RI = 20
RBB = 20
RB = 80
RE = 10
RC = 400
R1 = 400

eq1 = c(-(1/RI +1/RBB +1/RB), 1/RB, 0)
eq2 = c(241/RB, -(241/RB +1/RE), 0)
eq3 = c(-240/RB, 240/RB, -1/RC)

constant = c(-VS/RI, 0, 0)

a = rbind(eq1, eq2, eq3)

V = solve(a, constant)

VC = V[3]
Voc = VC

# find Isc

# eq3 changed 
eq3 = c(-240/RB, 240/RB, -(1/RC +1/R1))
a = rbind(eq1, eq2, eq3)

V = solve(a, constant)
VC = V[3]

Isc = VC / R1


# Rth = Rn
Rth = Voc / Isc




