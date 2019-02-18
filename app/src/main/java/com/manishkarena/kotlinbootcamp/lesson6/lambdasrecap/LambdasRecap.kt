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

package com.manishkarena.kotlinbootcamp.lesson6.lambdasrecap

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END;
}

fun main(args: Array<String>) {

    // Created the instance of Game
    val game = Game()

    // Prints the path
    println("Path in main() :- ${game.path}")

    // Invokes north,east,south,west and end lambda functions
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    // Prints the path
    println("Path again in main() :- ${game.path}")
}