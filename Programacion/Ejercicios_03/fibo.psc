Algoritmo suma
	Escribir 'Introduce N para hacer fibonacci'
	Leer N
	a <- 1
	b <- 1
	Para i<-1 Hasta N-2 Con Paso 1 Hacer
		c <- a+b
		a <- b
		b <- c
	FinPara
	Escribir 'Fin de fibonacci de ', N, ' elementos es ', b
FinAlgoritmo
