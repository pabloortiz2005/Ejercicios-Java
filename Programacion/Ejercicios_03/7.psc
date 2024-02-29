Algoritmo suma_impares
	Escribir 'Escribe N para hacer la suma de los impares hasta N'
	Leer n
	c = 0
	f = 0
	Repetir
		c = c + 1
		a = c
		Si a%2 <> 0 Entonces
			f = f + a
		FinSi
	Hasta Que c>=n
	Escribir "La suma es " f
FinAlgoritmo
