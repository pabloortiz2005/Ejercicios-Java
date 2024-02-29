Algoritmo sueldo
	Escribir "Introduce las horas trabajadas"
	Leer horas
	Escribir "Introduce el Precio por hora"
	Leer phoras
	Si horas > 40 Entonces
		s = (40 * phoras) + ((horas - 40)*(phoras*2))
	SiNo
		s = horas * phoras
	FinSi
	Escribir "El sueldo es" s
FinAlgoritmo
