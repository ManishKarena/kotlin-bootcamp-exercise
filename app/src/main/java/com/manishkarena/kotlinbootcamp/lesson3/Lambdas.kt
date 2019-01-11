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

import java.util.*

fun main(args: Array<String>) {

    // Creates simple lambda that return number between 1 to 12
    val rollDice = { Random().nextInt(12) + 1 }

    // Created lambda that takes argument for number of sides
    val rollDiceExtend = { sides: Int ->
        Random().nextInt(sides) + 1
    }

    // Created lambda that takes argument for number of sides, returns 0 if passed argument is 0.
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    // Created lambda with function type notation.
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    // Pass the dice as an argument and game play prints it.
    gamePlay(rollDice2(8))

}

// Gets the dice as an argument and prints it.
fun gamePlay(rollDice: Int) {
    println(rollDice)
}