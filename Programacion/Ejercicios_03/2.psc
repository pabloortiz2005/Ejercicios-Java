Algoritmo ceros
	Escribir "Cuantas cantidades vas a introducir"
	Leer n
	c = 0
	Repetir
		c = c + 1
		Escribir "Escribe el número " c
		Leer numero
		Si numero >= 0 Entonces
			Si numero = 0 Entonces
				igual0 = igual0 + 1
			SiNo
				mayor0 = mayor0 + 1
			FinSi
		SiNo
			menor0 = menor0 + 1
		FinSi
	Hasta Que c = n
	Escribir "Mayores de 0 = " mayor0 ", menores de 0 " menor0 ", iguales a 0 = " igual0
FinAlgoritmo
