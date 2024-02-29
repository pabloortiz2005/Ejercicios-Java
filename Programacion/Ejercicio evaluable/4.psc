Algoritmo nota
	Escribir "Pon los alumnos que quieras insertar"
	Leer x
	Para i<-1 Hasta x Con Paso 1 Hacer
		Si x <> 0 Entonces
			Escribir "introduce el nombre del alumno"
			Leer n
			Escribir "Nota teorica"
			Leer t
			Escribir "Nota practica"
			Leer p
			f = 0
			t = t * 0.60
			p = p * 0.40
			f = t + p
			Escribir "La nota final es " f
		FinSi
	FinPara
FinAlgoritmo
