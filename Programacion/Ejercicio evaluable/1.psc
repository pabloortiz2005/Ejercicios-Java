Algoritmo nota
	f = 0
	t = 0
	pr = 0
	p = 0
	Escribir 'Pon los alumnos que quieras insertar'
	Leer x
	Para i<-1 Hasta x Con Paso 1 Hacer
		Escribir 'introduce el nombre del alumno'
		Leer n
		Escribir 'Nota teorica'
		Leer t
		Escribir 'Nota practica'
		Leer p
		Escribir "Nota problemas"
		Leer pr
		Si  t>=0 Y pr >= 0 Y p>=0 Entonces
			Si f <= 10 Entonces
				f = (p*0.10)+(pr*0.50)+(t*0.40)
				Escribir 'La nota final de ' n ' es ' f
			SiNo
				Escribir "error"
			FinSi
		SiNo
			Escribir "Falta una variable"
		FinSi
	FinPara
FinAlgoritmo
