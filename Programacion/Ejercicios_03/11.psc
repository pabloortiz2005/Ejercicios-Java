Algoritmo maximo
	Escribir "Introduce el primer número números"
	Leer n
	c = 1
	Repetir
		c = c+1
		Escribir "Introduce el siguiente número"
		Leer z
		Si n > z Entonces
			n = n
		SiNo
			n = z
		FinSi
	Hasta Que c = 10
	Escribir "El mayor es: " n
FinAlgoritmo
