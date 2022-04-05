# source("E:/ComputerEn/Y 1/Semester 2/LCA/FE/quiz3/p1.R", echo=TRUE)


# when VCC acting alone
VCC = 12
VS = 4

RI = 20
RB1 = 40
RB2 = 40
RB = 80
RE = 10
RL = 40
RC = 400

eq1 = c(-(1/RB1 +1/RI +1/RB2 +1/RB), 1/RB, 0)
eq2 = c(241/RB, -(241/RB +1/RE), 0)
eq3 = c(-240/RB, 240/RB, -(1/RC +1/RL))

constant = c(-VCC/RB1, 0, -VCC/RC)

a = rbind(eq1, eq2, eq3)

V = solve(a, constant)

VB = V[1]
VE = V[2]
VC = V[3]

VB
VE
VC

# when vs acting alone 
eq1 = c(-(1/RI +1/RB1 +1/RB2 +1/RB), 1/RB, 0)
eq2 = c(241/RB, -(241/RB +1/RE), 0)
eq3 = c(-240/RB, 240/RB, -(1/RC +1/RL))

constant = c(-VS/RI, 0, 0)

a = rbind(eq1, eq2, eq3)

V = solve(a, constant)

VB = V[1]
VE = V[2]
VC = V[3]

VB
VE
VC




