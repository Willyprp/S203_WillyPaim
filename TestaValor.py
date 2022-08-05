import math

val = input("Entre com um número")
val = int(val)

if math.pow(val,3) > 100:
    print (f"{val} elevado ao cubo é maior que 100")
else:
    print (f"{val} elevado ao cubo é menor que 100")