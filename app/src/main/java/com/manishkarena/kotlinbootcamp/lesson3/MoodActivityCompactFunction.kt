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

    // Prints Activity based on mood
    println(whatShouldIDoSingleExpression("happy", "sunny"))
    println(whatShouldIDoSingleExpression("sad"))

    // Gets mood from the user
    println("How do you feel?")
    println(whatShouldIDoSingleExpression(readLine()!!))

}

fun whatShouldIDoSingleExpression(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}

// Single-Expression(Compact) functions
fun isVeryHot(temperature: Int) = temperature > 35

fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"