Algoritmo reloj
	h = 0
	m = 0
	s = 0
	c = 1
	Mientras c = 1 Hacer
		s = s + 1
		Si s >= 60 Entonces
			m = m + 1
			s = 0
		FinSi
		Si m >= 60 Entonces
			h = h + 1
			m = 0
		FinSi
		Si h >= 24 Entonces
			h = 0
			s = 0
			m = 0
			Escribir "Nuevo d�a"
		FinSi
		Escribir h, ":" m, ":" s
		esperar 1 Segundos
	FinMientras
FinAlgoritmo
