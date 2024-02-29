Algoritmo numeroscentral
	Escribir "Escribe 3 números"
	Leer a, b, c
	Si a>b Entonces
		Si b>c Entonces
			Si a>c Entonces
				Escribir b " es el central"
			SiNo
				Escribir c " es el central"
			FinSi
		SiNo
			Si a>c Entonces
				Escribir c " es el central"
			SiNo
				Escribir a " es el central"
			FinSi
		FinSi
	SiNo
		Si b>c Entonces
			Si a>c Entonces
				Escribir a " es el central"
			SiNo
				Escribir c " es el central"
			FinSi
		SiNo
			Escribir b " es el central"
		FinSi
	FinSi
FinAlgoritmo
