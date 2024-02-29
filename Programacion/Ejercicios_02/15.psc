Algoritmo mes
	Escribir "Escribe el dia"
	Leer d
	Escribir "Escribe el mes"
	Leer m
	Escribir "Escribe el año"
	Leer a
	d = d + 1
	Si m = 12 y d > 31 Entonces
		a = a + 1
		m = 1
		d = 1
	SiNo
		Si m = 2 Entonces
			
			
			Si d > 28 Entonces
				m = m + 1
				d = 1
			FinSi
		SiNo
			Si m = 4 o m = 6 o m = 9 o m = 11 Entonces
				Si d >30 Entonces
					m = m + 1
					d = 1
				FinSi
			SiNo
				Si d > 31 Entonces
					m = m + 1
					d = 1
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir d
	Escribir m
	Escribir a
FinAlgoritmo
