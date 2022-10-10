package homework7


    fun main(){

        val samsungTV=TV("Samsung","A5","78",false,11)
        val lgTV=TV(Pair("LG","C25"),"45",false,9)
        println(samsungTV.TvInfo())
        println(lgTV.TvInfo())

        // On/Off TV
        println("state of power TV : ${samsungTV.power}")
        samsungTV.changePower()
        println("state of power TV after changing: ${samsungTV.power}")
        if (!samsungTV.power){samsungTV.changePower()}//TV mode:ON

        //volume control
        println("volume before increasing: ${samsungTV.currentVolume}")
        samsungTV.VolumeUp(6)//6 times click "Up"
        println("volume after increasing: ${samsungTV.currentVolume}")

        println("volume before decreasing: ${samsungTV.currentVolume}")
        samsungTV.VolumeDown(2)//2 times click "Down"
        println("volume after decreasing: ${samsungTV.currentVolume}")

        //checking channel switching
        println("channels list after setting this tv :${samsungTV.getAllChannels()}")
        println("current channel when TV on: ${samsungTV.getCurrentChannel()}")
        println("set on 5th channel: ${samsungTV.switchChannel(5)}")
        for (i in 1..samsungTV.countOfChannels+2) {
            println("switch channel to up: ${samsungTV.switchChannel("up")}")
        }
        for (i in 1..samsungTV.countOfChannels+2) {
            println("switch channel to down: ${samsungTV.switchChannel("down")}")
        }


    }
