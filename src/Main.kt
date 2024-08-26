fun main() {
    //creacion de nuestras cabinas
    val cabinaUno = Cabina()
    val cabinaDos = Cabina()
    val cabinaTres = Cabina()
    val cabinaCuatro = Cabina()
    val cabinaCinco = Cabina()
    //Variable de ingreso del usuario
    var opcion: Int = 0
    var opcionSecundaria: Int = 0
    var opcionlimpieza: Int = 0
    var numero: String
    var minutos: Double


    var generalCosto:Double
    var generalLlamadas:Int
    var generalDuracionLlamadas:Double

    do {


        print(
            """
        |¡Bienvenido a TelefoniK!
        |¿Que cabina desea usar?
        |1. Cabina #1
        |2. Cabina #2
        |3. Cabina #3
        |4. Cabina #4
        |5. Cabina #5
        |
        |Otras funcionalidades
        |6. Informe General
        |7. Reiniciar
        |
    """.trimMargin()
        )
        opcion = readln().toInt()
        when (opcion) {
            1 -> {
                print(
                    """Ingrese el tipo de llamada
            |1. llamada Local
            |2. llamada Larga distancia
            |3. llamada Celular
            |
            """.trimMargin()
                )
                opcionSecundaria = readln().toInt()
                println("Ingrese el numero")
                numero = readln()
                println("Ingrese la cantidad de minutos")
                minutos = readln().toDouble()
                cabinaUno.setNumeroLlamada(numero)
                cabinaUno.setMinutosUso(minutos)
                when (opcionSecundaria) {
                    1 -> {
                        cabinaUno.llamadaLocal()
                    }

                    2 -> {
                        cabinaUno.llamadaLargaDistancia()
                    }

                    3 -> {
                        cabinaUno.llamadaCelular()
                    }
                }
                cabinaUno.resumenCabina()
            }

            2 -> {
                print(
                    """Ingrese el tipo de llamada
            |1. llamada Local
            |2. llamada Larga distancia
            |3. llamada Celular
            |
            """.trimMargin()
                )
                opcionSecundaria = readln().toInt()
                println("Ingrese el numero")
                numero = readln()
                println("Ingrese la cantidad de minutos")
                minutos = readln().toDouble()
                cabinaDos.setNumeroLlamada(numero)
                cabinaDos.setMinutosUso(minutos)
                when (opcionSecundaria) {
                    1 -> {
                        cabinaDos.llamadaLocal()
                    }

                    2 -> {
                        cabinaDos.llamadaLargaDistancia()
                    }

                    3 -> {
                        cabinaDos.llamadaCelular()
                    }
                }
                cabinaDos.resumenCabina()
            }

            3 -> {
                print(
                    """Ingrese el tipo de llamada
            |1. llamada Local
            |2. llamada Larga distancia
            |3. llamada Celular
            |
            """.trimMargin()
                )
                opcionSecundaria = readln().toInt()
                println("Ingrese el numero")
                numero = readln()
                println("Ingrese la cantidad de minutos")
                minutos = readln().toDouble()
                cabinaTres.setNumeroLlamada(numero)
                cabinaTres.setMinutosUso(minutos)
                when (opcionSecundaria) {
                    1 -> {
                        cabinaTres.llamadaLocal()
                    }

                    2 -> {
                        cabinaTres.llamadaLargaDistancia()
                    }

                    3 -> {
                        cabinaTres.llamadaCelular()
                    }
                }
                cabinaTres.resumenCabina()
            }
            4 -> {
                print(
                    """Ingrese el tipo de llamada
            |1. llamada Local
            |2. llamada Larga distancia
            |3. llamada Celular
            |
            """.trimMargin()
                )
                opcionSecundaria = readln().toInt()
                println("Ingrese el numero")
                numero = readln()
                println("Ingrese la cantidad de minutos")
                minutos = readln().toDouble()
                cabinaCuatro.setNumeroLlamada(numero)
                cabinaCuatro.setMinutosUso(minutos)
                when (opcionSecundaria) {
                    1 -> {
                        cabinaCuatro.llamadaLocal()
                    }

                    2 -> {
                        cabinaCuatro.llamadaLargaDistancia()
                    }

                    3 -> {
                        cabinaCuatro.llamadaCelular()
                    }
                }
                cabinaCuatro.resumenCabina()
            }
            5 -> {
                print(
                    """Ingrese el tipo de llamada
            |1. llamada Local
            |2. llamada Larga distancia
            |3. llamada Celular
            |
            """.trimMargin()
                )
                opcionSecundaria = readln().toInt()
                println("Ingrese el numero")
                numero = readln()
                println("Ingrese la cantidad de minutos")
                minutos = readln().toDouble()
                cabinaCinco.setNumeroLlamada(numero)
                cabinaCinco.setMinutosUso(minutos)
                when (opcionSecundaria) {
                    1 -> {
                        cabinaCinco.llamadaLocal()
                    }

                    2 -> {
                        cabinaCinco.llamadaLargaDistancia()
                    }

                    3 -> {
                        cabinaCinco.llamadaCelular()
                    }
                }
                cabinaCinco.resumenCabina()
            }
            6 -> {
                generalCosto = cabinaUno.getContadorCostoTotal()+cabinaDos.getContadorCostoTotal()+cabinaTres.getContadorCostoTotal()+cabinaCuatro.getContadorCostoTotal()+cabinaCinco.getContadorCostoTotal()
                generalLlamadas=cabinaUno.getContadorLlamadas()+cabinaDos.getContadorLlamadas()+cabinaTres.getContadorLlamadas()+cabinaCuatro.getContadorLlamadas()+cabinaCinco.getContadorLlamadas()
                generalDuracionLlamadas = cabinaUno.getContadorMinutos()+cabinaDos.getContadorMinutos()+cabinaTres.getContadorMinutos()+cabinaCuatro.getContadorMinutos()+cabinaCinco.getContadorMinutos()
                print(
                    """
        |-----------------------------------------------------------
        |                  RESUMEN GENERAL
        | Costo total en pesos de la línea ${generalCosto}
        | Numero total de llamadas realizadas ${generalLlamadas}
        | Duración total de llamadas en minutos ${generalDuracionLlamadas}
        | Calculo del costo promedio por minuto ${generalCosto/generalDuracionLlamadas}
        | -----------------------------------------------------------
        
    """.trimMargin())
            }

            7 -> {
                print("""Ingrese la cabina que desea reiniciar
                    | 1. Cabina #1
                    | 2. Cabina #2
                    | 3. Cabina #3
                    | 4. Cabina #4
                    | 5. cabina #5    
                """.trimMargin())
                opcionlimpieza = readln().toInt()
                when(opcionlimpieza){
                    1->cabinaUno.reiniciarCabina()
                    2->cabinaDos.reiniciarCabina()
                    3->cabinaTres.reiniciarCabina()
                    4->cabinaCuatro.reiniciarCabina()
                    5->cabinaCinco.reiniciarCabina()
                }
            }
            else -> println("Ingrese una opción valida")

        }
    } while (opcion >= 1 && opcion <= 7)
}



