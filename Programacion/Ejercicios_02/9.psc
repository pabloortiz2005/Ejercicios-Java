Algoritmo descuento
	Escribir 'Introduce el precio del articulo'
	Leer art
	Si art>=100 Entonces
		Si art>200 Entonces
			artD = art - (art*0.15)
		SiNo
			artD = art - (art*0.12)
		FinSi
	SiNo
		artD = art-(art*0.10)
	FinSi
	Escribir "El precio con descuento es " artD
FinAlgoritmo
