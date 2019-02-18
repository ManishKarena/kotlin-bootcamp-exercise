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

package com.manishkarena.kotlinbootcamp.lesson6.gamechallange

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END;
}

fun main(args: Array<String>) {

    // Created the instance of Game
    val game = Game()

    // Gets direction from user every-time and sets that direction into the direction list.
    // It also prints the location-description according to direction.
    while (true) {
        print("Enter a direction: NORTH/SOUTH/EAST/WEST :")
        game.makeMove(readLine())
        println(game.map.getDescription())
    }
}