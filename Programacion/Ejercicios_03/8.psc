Algoritmo suma_pares
	c <- 0
	f <- 0
	Repetir
		c <- c+1
		a <- c
		Si a%2=0 Entonces
			f <- f+a
		FinSi
	Hasta Que c=1000
	Escribir 'La suma es ', f
FinAlgoritmo
