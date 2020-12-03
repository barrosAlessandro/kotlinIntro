fun main() {
    var i = 0
    var j = 9
    var k = 0
    var l= 9

    for (j in 9 downTo 0) {
        for (i in 0..j) {
            print(".")
        }
        for (i in 0..i++) {
            print(i)
        }
        print ("|")
        for (k in 0..k++) {
            print(k)
        }
        for (i in 0..j) {
            print(".")
        }
        println()
    }
}