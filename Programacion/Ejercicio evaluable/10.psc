Algoritmo gasolina
	Escribir 'Introduce gasolina gastada'
	Leer gg
	Escribir 'valor gasolina por litro'
	Leer e
	Escribir 'km recorrido'
	Leer k
	Escribir 'tiempo en horas'
	Leer t
	Escribir 'tiempo en minutos'
	Leer tm
	tt <- t+(tm/60)
	kg <- gg/k
	ke <- e*kg
	kg100 <- kg*100
	ke100 <- ke*100
	vkh <- k/tt
	vkm <- (k*100)/(tt*3600)
	Escribir 'gasto gasolina por kilometro ', kg
	Escribir 'gasto euro por kilometro ', ke
	Escribir 'gasto gasolina por 100 kilometro ', trunc(kg100)
	Escribir 'gasto dinero por 100 kilometro ', trunc(ke100)
	Escribir 'Velocidad km/h ', trunc(vkh)
	Escribir 'Velocidad m/s ', trunc(vkm)
FinAlgoritmo
