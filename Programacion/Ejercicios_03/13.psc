Algoritmo ANO
	Escribir "Introduce el mes"
	Leer m
	Escribir "¿Es bisiesto? s/n "
	Leer b
	Según m Hacer
		"enero":
			Escribir "31"
		"febrero":
			Si b="s" Entonces
				Escribir "29"
			SiNo
				Escribir "28"
			FinSi
		"marzo":
			Escribir "31"
		"abril":
			Escribir "30"
		"mayo":
			Escribir "31"
		"junio":
			Escribir "30"
		"julio":
			Escribir "31"
		"agosto":
			Escribir "31"
		"septiembre":
			Escribir "30"
		"octubre":
			Escribir "31"
		"noviembre":
			Escribir "30"
		"diciembre":
			Escribir "31"
		De Otro Modo:
			Escribir "Ese mes esta escrio mal o no esta escrito en minusculas"
	FinSegún
FinAlgoritmo
