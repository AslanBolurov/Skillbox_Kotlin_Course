package homework7

object Channels {
    val channelsList= mapOf<Int,String>(1 to "ORT", 2 to "RussiaToday", 3 to "NTV",
        4 to "RenTV", 5 to "5 Channel", 6 to "MTV",
        7 to "SportTV", 8 to "Culture", 9 to "EuroNews",
        10 to "Discovery", 11 to "Nikelodeon",
        11 to "DisneyTV", 12 to "MultTV", 13 to "BBC",
        14 to "Natural Geograhic", 15 to "THT",
        16 to "TV3", 17 to "CTC", 18 to "Zvezda", 19 to "Arkhis24", 20 to "9 volna")

    fun getRandomChannels( cntChannels:Int):List<String>{
        val channels= channelsList.values.shuffled()
        return channels.take(cntChannels)
    }


}