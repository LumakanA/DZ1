fun main(args: Array<String>) {

    print("Введите имя посетителя: ")
    val name = readLine()
    print("Введите фамилию посетителя: ")
    val fa = readLine()
    print("Введите возраст посетителя: ")
    val age = readLine().toString()
    val a = age.toInt()
    if (a>=18)
    println("Действие: посетителя $name $fa пропустить в торговый центр")
    else
        if (a<=14)
    println("Действие: вызвать полицию для $name $fa")
    else
        println("Действие: посетителя $name $fa не пропускать в торговый центр")


}