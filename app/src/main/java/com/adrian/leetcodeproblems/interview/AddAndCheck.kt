package com.adrian.leetcodeproblems.interview

/**
 * Implementar las siguientes dos funciones:
 * add(int m)
 * check(int n)
 *
 * add(m) recibe un integer m y lo guarda en memoria.
 *
 * check(n) recibe un integer n. Devuelve true si y sólo si
 * existen dos elementos a y b que fueron previamente agregados
 * usando add() tal que, sumados, son iguales a "n". Si no, devuelve false.
 */
class AddAndCheck {

    val memory = ArrayList<Int>()
    val map = HashMap<Int, Int>()

    fun add(m: Int) {
        memory.add(m)
    }

    fun addM(m: Int) {
        if (map.get(m) != null) {
            map[m] = map[m]!! + 1
        } else {
            map.put(m, 1)
        }
    }

    fun check(n: Int): Boolean {
        if (memory.size < 2)
            return false

        for (i in memory.indices) {
            if (i + 1 == memory.size) {
                continue
            }
            for (j in i+1 until memory.size) {
                if (memory[i] + memory[j] == n) {
                    return true
                }
            }
        }

        return false
    }

    fun checkOptimized(n: Int): Boolean {
        for (i in map.keys) {
            if (n != i*2 && map.get(n - i) != null) {
                return true
            }
            if (i*2 == n && map[i] != null && map.get(i)!! >= 2 ) {
                return true
            }
        }

        return false
    }
}