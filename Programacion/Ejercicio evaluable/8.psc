Algoritmo romanos
	n = 1001
	Mientras n>1000 Hacer
		Escribir "Introduce el número"
		Leer n
	FinMientras
	m = trunc(n / 1000) mod 10
	c = trunc(n/100) mod 10
	d = trunc(n/10) mod 10
	u = trunc(n) mod 10
	Según m Hacer
		1:
			Escribir "M"
	FinSegún
	Según c Hacer
		9:
			Escribir Sin Saltar "CM"
		8:
			Escribir Sin Saltar "DCCC"
		7:
			Escribir Sin Saltar "DCC"
		6:
			Escribir Sin Saltar "DC"
		5:
			Escribir Sin Saltar "D"
		4:
			Escribir Sin Saltar "CD"
		3:
			Escribir Sin Saltar "CCC"
		2:
			Escribir Sin Saltar "CC"
		1:
			Escribir Sin Saltar "C"
	FinSegún
	Según d Hacer
9:
	Escribir Sin Saltar "XC"
8:
	Escribir Sin Saltar "LXXX"
7:
	Escribir Sin Saltar "LXX"
6:
	Escribir Sin Saltar "LX"
5:
	Escribir Sin Saltar "L"
4:
	Escribir Sin Saltar "XL"
3:
	Escribir Sin Saltar "XXX"
2:
	Escribir Sin Saltar "XX"
1:
	Escribir Sin Saltar "X"
	FinSegúN
	Según u Hacer
9:
	Escribir Sin Saltar "IX"
8:
	Escribir Sin Saltar "VIII"
7:
	Escribir Sin Saltar "VII"
6:
	Escribir Sin Saltar "VI"
5:
	Escribir Sin Saltar "V"
4:
	Escribir Sin Saltar "IV"
3:
	Escribir Sin Saltar "III"
2:
	Escribir Sin Saltar "II"
1:
	Escribir Sin Saltar "I"
FinSegún
ESCRIBIR Sin Saltar " "
FinAlgoritmo
