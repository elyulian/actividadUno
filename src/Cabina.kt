class Cabina {
    //precios llamadas
    val  costoMinutoLocal:Double = 50.0
    val  costoMinutoLargaDistancia:Double = 350.0
    val  costoMinutoCelular:Double = 150.0

    //contadores

    private var contadorLlamadas:Int =0
    private var contadorMinutos:Double=0.0
    private var contadorCostoTotal:Double=0.0

    //Variables de clase
    private var minutosUso:Double =0.0
    private var numeroLlamada: String =""



    constructor(minutosUso: Double, numeroLlamada: String) {
        this.minutosUso = minutosUso
        this.numeroLlamada = numeroLlamada
    }

    constructor()
    // Getter para contadorLlamadas
    fun getContadorLlamadas(): Int {
        return contadorLlamadas
    }

    // Getter para contadorMinutos
    fun getContadorMinutos(): Double {
        return contadorMinutos
    }

    // Getter para contadorCostoTotal
    fun getContadorCostoTotal(): Double {
        return contadorCostoTotal
    }

    // Getter para minutosUso
    fun getMinutosUso(): Double {
        return minutosUso
    }

    // Setter para minutosUso
    fun setMinutosUso(value: Double) {
        minutosUso = value
    }

    // Getter para numeroLlamada
    fun getNumeroLlamada(): String {
        return numeroLlamada
    }

    // Setter para numeroLlamada
    fun setNumeroLlamada(value: String) {
        numeroLlamada = value
    }


//Funcion de realizar una llamada local
    fun llamadaLocal():Double{

        contadorLlamadas+=1
        contadorMinutos+= minutosUso
        contadorCostoTotal += (minutosUso * costoMinutoLocal)
        println("Llamada Local realizada con exito")
        return minutosUso*costoMinutoLocal
    }
//Funcion de realizar una llamada a larga distancia

    fun llamadaLargaDistancia():Double{
        contadorLlamadas+=1
        contadorMinutos+= minutosUso
        contadorCostoTotal += (minutosUso * costoMinutoLargaDistancia)
        println("Llamada Larga Distancia realizada con exito")
        return minutosUso*costoMinutoLargaDistancia

    }
    //Funcion de realizar una llamada a celular
    fun llamadaCelular():Double{
        contadorLlamadas+=1
        contadorMinutos+= minutosUso
        contadorCostoTotal += (minutosUso * costoMinutoCelular)
        println("Llamada a celular realizada con exito")
        return minutosUso*costoMinutoCelular
    }
//Funcion de realizar el resumen de la cabina
    fun resumenCabina(){
        print("""---------------------------------------
            |Resumen Cabina
            |Numero de llamadas realizadas ${contadorLlamadas}
            |Duracion total de las llamadas ${contadorMinutos}
            |Costo total de las llamadas ${contadorCostoTotal}
            |-------------------------------------------
        """.trimMargin())
    }
    //Funcion de realizar el reinicio de la cabian
    fun reiniciarCabina(){
        contadorLlamadas=0
        contadorMinutos=0.0
        contadorCostoTotal=0.0
        println("Cabina reiniciada exitosamente")
    }


}