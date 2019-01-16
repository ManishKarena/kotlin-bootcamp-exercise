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

package com.manishkarena.kotlinbootcamp.lesson4.constructors

fun main(args: Array<String>) {

    // Creates new spice object
    val newSpice = Spice("cayenne", spiciness = "spicy")

    // List of spices
    val spiceList = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy"),
            makeSalt())

    // Filters all spices having spiciness level less than 5
    val filteredSpiceList = spiceList.filter { it.heat < 5 }

    println("filteredSpiceList :- $filteredSpiceList")

}

// Compact function for salt
fun makeSalt() = Spice("Salt")