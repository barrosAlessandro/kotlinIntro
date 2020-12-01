fun main() {
    var i = 0
    var j = 1
    for (j in (1..25).step(2)) {
        for (i in 1..j)
            print("*")
        i += 3
        println("|")
    }
    var n: Int = 0
    var m: Int = 1
    for (m in 0..3) {
        for (n in 0..3) print("*")
        n++
        println("|")
    }
}