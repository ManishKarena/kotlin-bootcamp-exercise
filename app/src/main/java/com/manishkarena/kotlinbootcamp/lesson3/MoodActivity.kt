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
    println(whatShouldIDoToday("happy"))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}