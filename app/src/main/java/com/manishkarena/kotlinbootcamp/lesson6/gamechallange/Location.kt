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

import kotlin.math.absoluteValue

class Location (val width: Int = 4, val height: Int = 4) {

    val map = Array(width) { arrayOfNulls<String>(height) }

    var currentLocation = Pair (0,0)

    fun updateLocation(direction: Directions) {

        if(direction.equals(Directions.NORTH)) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second + 1).rem(height))}
        else if(direction.equals(Directions.SOUTH)) {
            currentLocation = Pair(currentLocation.first, (currentLocation.second - 1).absoluteValue.rem(height))}
        else if(direction.equals(Directions.EAST)) {
            currentLocation = Pair((currentLocation.first + 1).rem(width), currentLocation.second)}
        else if(direction.equals(Directions.WEST)) {
            currentLocation = Pair((currentLocation.first - 1).absoluteValue.rem(width), currentLocation.second)}
    }

    fun getDescription ():String? {
        return map[currentLocation.first.rem(width)][currentLocation.second.rem(height)]
    }

    init {
        map[0][0] = "You are at the start of your journey. [n / e]"
        map[0][1] = "The road stretches before you. It promises beauty and adventure. [ n / s / e]"
        map[0][2] = "The road still stretches before you. It rains and the water forms puddles. [ n / s / e]"
        map[0][3] = "It is getting much colder and you wish you had a wool coat. [ s / e]"

        map[1][0] = "The narrow path stretches before you. You are glad you are on foot. [ n / e /w]"
        map[1][1] = "It is getting warmer. You smell moss, and marmot scat. You are stung by a mosquito. [ n / s / e / w]"
        map[1][2] = "You decide to sit on your backside and slide down a vast snowfield. [ n / s / e /w]"
        map[1][3] = "You have climbed to the top of a snowy mountain and are enjoying the view. [ w / s / e]"

        map[2][0] = "You cross an old stone bridge. Your hear the murmuring of water. And another grumbling sound. [ n / e / w]"
        map[2][1] = "A bridge troll appears. It swings a club and demands gold. You give them all your coins. [ n / s / e  /w]"
        map[2][2] = "It is getting cooler. A dense fog rolls in. You can hear strange voices. [ n / s / e / w]"
        map[2][3] = "The foothills promise a strenuous journey. You thread your way around gigantic boulders. [ s / e / w ]"

        map[3][0] = "Your journey continues. A fox runs across the path with a chicken in its mouth.[ n / e ]"
        map[3][1] = "In the distance, you see a house. You almost bump into a farmer with a large shotgun. They pay you no heed. [ n / s / w ]"
        map[3][2] = "It is getting hot, and dry, and very, very quiet. You think of water and wish you had brought a canteen.[ n / s / w ]"
        map[3][3] = "You have reached the infinite desert. There is nothing here but sand dunes. You are bitten by a sand flea.[ s / w ] "
    }
}