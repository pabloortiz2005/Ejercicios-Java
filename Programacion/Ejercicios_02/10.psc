Algoritmo becas
	Escribir "Introduce tu edad"
	Leer edad
	Escribir "Introduce la nota"
	Leer n
	Si n>6 Entonces
		Si edad>18 Entonces
			Si n<9 Entonces
				Si n<7.5 Entonces
					Escribir "Beca de 500 euros"
				SiNo
					Escribir "Beca de 1000 euros"
				FinSi
			SiNo
				Escribir "Beca de 2000 euros"
			FinSi
		SiNo
			Si n<9 Entonces
				Si n<8 Entonces
					Escribir "Beca de 100 euros"
				SiNo
					Escribir "Beca de 2000 euros"
				FinSi
			SiNo
				Escribir "Beca de 3000 euros"
			FinSi
		FinSi
	SiNo
		Escribir "Gracias por tu esfuerzo pero no has llegado a la media necesaria"
	FinSi
FinAlgoritmo
