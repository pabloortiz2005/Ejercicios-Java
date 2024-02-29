Algoritmo primos
	Para N<-2 Hasta 1000 Con Paso 1 Hacer
		x = 1
		c = 0
		Mientras x<=N Hacer
			Si N mod x == 0 Entonces
				c = c+1
			FinSi
			x = x+1
		FinMientras
		Si c==2 Entonces
			Escribir "Numero " N " es primo"
		FinSi
	FinPara
FinAlgoritmo
