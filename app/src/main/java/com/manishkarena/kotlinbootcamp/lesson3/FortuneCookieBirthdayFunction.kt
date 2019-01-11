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

    // Add for loop to loop through 10 times.
    // if fortune is 'Take it easy' breaks the loop
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }

}

fun getBirthday(): Int {
    // Enter birthday message
    println("Enter your birthday: ")

    // Read the input from the user and store it to birthday
    // If input not valid store 1; checks input using Elvis Operator(?:)
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    // List of fortunes
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    return when (birthday) {
        28, 31 -> fortunes[2]
        in 1..7 -> fortunes[4]
        else -> fortunes[birthday.rem(fortunes.size)]
    }

}