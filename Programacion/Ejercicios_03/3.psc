Algoritmo articulos
	Escribir 'Cuantos articulos compraras'
	Leer n
	Escribir 'Coste del articulo'
	Leer p
	c <- 0
	precio = 0
	preciof <- 0
	Repetir
		Si p>=200 Entonces
			precio <- p*0.85
		SiNo
			Si precio>100 Entonces
				precio <- p*0.88
			SiNo
				precio <- p*0.9
			FinSi
		FinSi
		c <- c+1
		preciof <- preciof+precio
	Hasta Que c=n
	Escribir 'El precio por el articulo sin rebajar es ', p
	Escribir 'El precio por el articulo rebajado es ', precio
	Escribir 'El precio final es ', preciof
FinAlgoritmo
