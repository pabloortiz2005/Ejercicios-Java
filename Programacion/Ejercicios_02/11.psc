Algoritmo bono_trabajadores
	Escribir "Introduce antigüedad"
	Leer ant
	Escribir "Introduce sueldo"
	Leer s
	Si ant>=5 Entonces
		antb = s*1.30
	SiNo
		Si ant>2 Entonces
			antb = s*1.20
		SiNo
			antb = 0
		FinSi
	FinSi
	Si s<=2000 Entonces
		Si s>1200 Entonces
			sb = s*1.5
		SiNo
			sb = s*1.25
		FinSi
	SiNo
		sb = s*1.10
	FinSi
	Si antb = 0 Entonces
		Escribir "No hay bono por antigüedad"
		sf = sb
	SiNo
		Si sb > antb Entonces
			sf = sb
		SiNo
			sf = antb
		FinSi
		Escribir "El precio con el bono por sueldo es " sb " y el precio con el bono por antigüedad es " antb
	FinSi
	Escribir "El sueldo final es " sf
FinAlgoritmo
