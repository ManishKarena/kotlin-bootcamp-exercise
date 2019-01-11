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

package com.manishkarena.kotlinbootcamp.lesson2

fun main(args: Array<String>) {

    // Lesson-2: Kotlin Basics
    // Practice Time: Basic Operations
    println(2.plus(71).plus(233).minus(13).div(30)) // Solution that I've tried
    println(2.plus(71).plus(233).minus(13)
            .div(30).plus(1)) // Solution that course gives


    // Lesson-2: Kotlin Basics
    // Practice Time: Variables
    var rainbowColor = "red"
    rainbowColor = "blue"
    // Uncomment below two lines and it gives Compile-time Error
    // val blackColor = "black"
    // blackColor = "white"


    // Lesson-2: Kotlin Basics
    // Practice Time: Nullability
    var greenColor = null
    var blueColor: Int? = null


    // Lesson-2: Kotlin Basics
    // Practice Time: Nullability/Lists
    var mullListWay1 = listOf(null, null) // Creates a list with two elements that are null
    var nullListWay2: List<Int?> = listOf(null, null) // Creates a list with two elements that are null
    var nullList: List<Int>? = null // Creates a list where the list is null


    // Lesson-2: Kotlin Basics
    // Practice Time: Null Checks
    val nullTest: Int? = null
    println(nullTest?.inc() ?: 0) // Use of the Elvis operator.


    // Lesson-2: Kotlin Basics
    // Practice Time: Strings (Use of a String template to print stuffs)
    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I like to eat $trout and $snapper, but not a big fan of $haddock.")


    // Lesson-2: Kotlin Basics
    // Practice Time: when statement (Use of a when statement)
    val fishName = "Tuna"
    when(fishName.length){
        0 -> println("Fish name cannot be empty")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }


    // Lesson-2: Kotlin Basics
    // Practice Time: Arrays and Loops (Use of a for loop)
    var list3 : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list3.add(i)
    print(list3)

}