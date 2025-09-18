# Funcion remover
def remover_pares(lista):
  mantener = lista[::2]
  lista[:] = mantener

# Entradas
numeros_xd = [1,2,3,4,5,6,7,8,9,10]

#Antes
print(f"La lista de numeros antes sim remover es {numeros_xd}")

# Remover
remover_pares(numeros_xd)

# Despues
print(f"La lista despues de remover numeros es {numeros_xd}")
