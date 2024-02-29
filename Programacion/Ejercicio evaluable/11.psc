Algoritmo monedas
	Escribir sin saltar 'Ingresa los euros'
	Leer e
	Escribir Sin Saltar 'Ingrese los centimos'
	Leer c
	M1=E
	B500=(M1-M1 MOD 500)/500
	M1=M1 MOD 500
	B200=(M1-M1 MOD 200)/200
	M1=M1 MOD 200
	B100=(M1-M1 MOD 100)/100
	M1=M1 MOD 100
	B50=(M1-M1 MOD 50)/50
	M1=M1 MOD 50
	B20=(M1-M1 MOD 20)/20
	M1=M1 MOD 20
	B10=(M1-M1 MOD 10)/10
	M1=M1 MOD 10
	B5=(M1-M1 MOD 5)/5
	M1=M1 MOD 5
	mon2=(M1-M1 MOD 2)/2
	M1=M1 MOD 2
	M2=c
	
	Mientras M2>=100 Hacer
		Escribir 'Ingrese los centimos de nuevo'
		leer c
		M2=c
	FinMientras
	mon50c=(M2-M2 MOD 50)/50
	M2=M2 MOD 50
	mon20c=(M2-M2 MOD 20)/20
	M2=M2 MOD 20
	mon10c=(M2-M2 MOD 10)/10
	M2=M2 MOD 10
	mon5c=(M2-M2 MOD 5)/5
	M2=M2 MOD 5
	mon2c=(M2-M2 MOD 2)/2
	M2=M2 MOD 2
	mon1c=(M2-M2 MOD 1)/1
	M2=M2 MOD 1
	
	Escribir 'Billetes de 500: ' B500
	Escribir 'Billetes de 200: ' B200
	Escribir 'Billetes de 100: ' B100
	Escribir 'Billetes de 50: ' B50
	Escribir 'Billetes de 20: ' B20
	Escribir 'Billetes de 10: ' B10
	Escribir 'Billetes de 5: ' B5
	Escribir 'Monedas de 1 euro: ' M1
	Escribir 'Monedas de 2 euros: ' mon2
	Escribir 'Monedas de 50 centimos: ' mon50c
	Escribir 'Monedas de 20 centimos: ' mon20c
	Escribir 'Monedas de 10 centimos: ' mon10c
	Escribir 'Monedas de 5 centimos: ' mon5c
	Escribir 'Monedas de 2 centimos: ' mon2c
	Escribir 'Monedas de 1 centimos: ' mon1c
	
	
FinAlgoritmo
