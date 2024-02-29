Algoritmo billete
	Escribir "Introduce la distancia en Km"
	Leer dis
	Escribir "Introduce días de instancia"
	Leer dia
	Si dis > 800 Entonces
		Si dia > 7 Entonces
			P = (dis * 2.5) - ((dis * 2.5) * 0.30)
		SiNo
			P = dis * 2.5
		FinSi
	SiNo
		P = dis * 2.5
	FinSi
	Escribir "El precio es " P
FinAlgoritmo
