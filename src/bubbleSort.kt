fun main() {
    val lista = intArrayOf(2, 122, 3, 15, 5, 10, 0, 8, 15, 5)
    val n: Int = lista.size // tamanho do array
    println("Número de elementos para ordenar: $n")
    for (j in 0 until n - 1) {
        print(" -> Dígito nº$j ordenado\n")
        for (i in 0 until n - 1) {
            print("- Iteração nº" +
                    "$i \n")
            var aux: Int
            if (lista[i] >= lista[i + 1]) {
                aux = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = aux
            }// else println("Ordenado")
            for (element in lista)
                print(" $element")
        }
    }
    print(" <<< Array ordenado")
}
