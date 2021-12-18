package com.hyunjin.kotlinstudy

fun main(args: Array<String>) {
    val arr = arrayOf(
        arrayOf(5, 7),
        arrayOf(4, 8),
        arrayOf(8, 1),
        arrayOf(4, 9)
    )

    // 각 1 차원 배열의 첫 번째 값을
    // 기준으로 오름차순 정렬.
    // 만약 첫 번째 값이 같으면 두 번째 값을
    // 기준으로 오름차순 정렬.
    arr.sortWith(Comparator { arr1, arr2 ->
        when {
            arr1[0] > arr2[0] -> 1
            arr1[0] < arr2[0] -> -1
            else -> {
                when {
                    arr1[1] > arr2[1] -> 1
                    arr1[1] < arr2[1] -> -1
                    else -> 0
                }
            }
        }
    })

    println(arr.contentDeepToString())
}


