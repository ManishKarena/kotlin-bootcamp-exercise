/*
 * Copyright (c) 2019 Manish Karena
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.manishkarena.kotlinbootcamp.lesson3

fun main(args: Array<String>) {

    // Creates list of spices
    val spiceList = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    // Filters all the curries and sorts them by string length and print them.
    println(spiceList.filter { it.contains("curry") }.sortedBy { it.length })

    // Filters and prints all the spices that start with 'c' and end in 'e'. Way-1
    println(spiceList.filter { it.startsWith('c') }.filter { it.endsWith('e') })

    // Filters and prints all the spices that start with 'c' and end in 'e'. Way-2
    println(spiceList.filter { it.startsWith('c') && it.endsWith('e') })

    // Filters and prints all the spices that start with 'c' from first three elements.
    println(spiceList.take(3).filter { it.startsWith('c') })

}