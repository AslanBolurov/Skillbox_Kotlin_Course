package homework7

class TV(val brand:String
        ,val model:String
        ,val size:String="46"
        ,var power:Boolean=false
        ,val countOfChannels:Int
) {

    constructor(descriptor:Pair<String,String> , size: String,power: Boolean, countOfChannels: Int) : this(
            brand=descriptor.first,
            model=descriptor.second,
            size=size,
            power=power,
            countOfChannels=countOfChannels
        )

    private var currentChannelPosition:Int=0//по умолчанию на первом канале


    var currentVolume=50
//    var currentChannel:Int=0


    fun changePower(){
        power=!power
    }
    fun VolumeUp(value:Int){currentVolume += value*10;if (currentVolume> MAX_VOLUME)currentVolume= MAX_VOLUME}
    fun VolumeDown(value:Int){currentVolume -= value*10;if (currentVolume< MIN_VOLUME)currentVolume=0}
    fun switchChannel(number:Int):String{
        currentChannelPosition=(number-1)%availableChannels.size//zero based numbering
        if (power==false)power==true
        return getCurrentChannel()
    }
    fun switchChannel(upOrDown:String): String {
        if (upOrDown.toLowerCase()=="up"){
            currentChannelPosition++
            currentChannelPosition %= availableChannels.size}
        else if(upOrDown.toLowerCase()=="down"){
            currentChannelPosition--
            if (currentChannelPosition >=0) {
                currentChannelPosition %= availableChannels.size
            }else{
                currentChannelPosition+=availableChannels.size
            }
        }
        return getCurrentChannel()
    }
    fun getAllChannels():String{return availableChannels.joinToString(";")}
    fun getCurrentChannel()=availableChannels[currentChannelPosition]


    fun TvInfo() ="brand:$brand, model:$model, size=$size'," +
                    " countOfChannels: $countOfChannels"

    val availableChannels =Channels.getRandomChannels(countOfChannels)

    companion object{
        const val MAX_VOLUME=100
        const val MIN_VOLUME=0
    }


}