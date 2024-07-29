fun main(){

    val list = listOf(2,5,5,7,11,15,30,32,44,50)
    val list2 = listOf("a","ab","c","cb","cbd")

    list.forEach { println(it*2) } //  foreach fonksiyonu.

    list.forEachIndexed { index, i ->
        println("Index: $index - Number: $i")  // indexle beraber foreach fonksiyonu
    }

    val newList = list.filter { it==5 } //  filter fonksiyonu
    println(newList)

    val result = list2.find { it=="a" } //  find metodu
    println(result)
    val result2 = list2.find { it.contains("a") } // ilk a içeren elemanı döndürdü
    val result3 = list2.findLast { it.contains("a") } // son a içeren elemanı döndürdü
    println(result2)
    println(result3)

    val result4 = list2.first() // listenin ilk elemanını döndürür
    println(result4)
    val result5 = list2.last() // listenin son elemanını döndürür
    println(result5)

    val result6 = list2.groupBy { it=="a" } // liste elamanlarını grupladı
    println(result6)

    val result7 = list2.groupBy { it=="a" }.values // liste elemanları ayrı gruplar haline getirdi
    println(result7)

    val users = listOf(
        User("Eylem",35),
        User("Aylin",36))

    val userName = users.map { it.name } // map fonksiyonu ile sadece isimleri aldık
    println(userName)

    val userAge = users.map { it.age } // map fonksiyonu ile sadece yaşları aldık
    println(userAge)

    val sortedList = users.sortedBy { it.age }  //users ı age parametresine göre küçükten büyüğe sıraladık
    println(sortedList)

    val sortedList2 = users.sortedByDescending { it.age }    // userı age parametresine göre büyükten küçüğe sıraladık
    println(sortedList2)


    val reversedList = list.reversed() // liste yi ters çevirdik
    println(reversedList)

    val shuffledList = list.shuffled()  // listeyi karıştırdık
    println(shuffledList)

    val sumList = list.sum() // bütün liste elemanlarını topladı
    println(sumList)

    val sumUsers = users.sumOf { it.age }    //users listesi içindeki yaşları topladı
    println(sumUsers)

    val maxAgeUserAge = users.maxOf {it.age  } // yaşı en büyük olan userın yaşını döndür.
    println(maxAgeUserAge)

    val maxAgeUser = users.maxBy { it.age }    // yaşı en büyük olan user ı döndürür.
    println(maxAgeUser)

// aynı fonksiyonları küçük olanı bulmak için minOf ve minBy kullanılabilir.

}
data class User(val name:String,val age:Int){

}

