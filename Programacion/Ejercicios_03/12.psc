Algoritmo maximo
	Escribir 'Introduce el primer n�mero n�meros'
	Leer n
	c <- 1
	s = n
	h = 0
	Repetir
		c <- c+1
		Escribir 'Introduce el siguiente n�mero'
		Leer z
		Si n<z Entonces
			n <- z
			Si z>h Entonces
				h = z
			FinSi
		SiNo
			n <- z
			Si z<s Entonces
				s = z
			FinSi
		FinSi
	Hasta Que c=20
	Escribir 'El mayor es: ' h " el menor es " s
FinAlgoritmo
