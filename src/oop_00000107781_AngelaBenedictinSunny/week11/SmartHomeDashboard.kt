package oop_00000107781_AngelaBenedictinSunny.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    homeDevices.apply{
        add(SmartDevice("Lampu Pintar", "Lighting", true, 12))
    }.also{
        println("Added ${it}");
    }

    homeDevices.add(SmartDevice("Ezviz Outdoor", "Camera").apply{
        isOnline = true
        powerLoad = 5
    }.also{
        println("(LOG) Kamera Terhubung")
    })


    var objekACInverter = run{
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(objekACInverter)

    var picoloAutoFeeder = run{
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    }
    homeDevices.add(picoloAutoFeeder)

    val searchResult = homeDevices.find{
        it.category == "Camera"
    }

    searchResult?.let{
        it.diagnose()
    }
    println(searchResult)

}