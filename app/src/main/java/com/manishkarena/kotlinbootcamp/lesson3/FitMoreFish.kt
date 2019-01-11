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

    println(canAddFishWay2(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFishWay2(10.0, listOf(), 7, true))

}

fun canAddFish(tankSize: Double, currentFish: List<Int>,
               fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun canAddFishWay2(tankSize: Double, currentFish: List<Int>,
                   fishSize: Int = 2, hasDecorations: Boolean = true) : Boolean{

    var totalFishSizeInInches = 0.0

    for (i in currentFish) {
        totalFishSizeInInches += i
    }

    val maxCapacityOfTank = tankSize.times(if (hasDecorations) 80 else 100).div(100)

    return totalFishSizeInInches.plus(fishSize) < maxCapacityOfTank

}