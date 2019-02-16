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

package com.manishkarena.kotlinbootcamp.lesson5.collection

fun main(args: Array<String>) {

    // Creates set of book titles
    val allBooks = setOf("A Midsummer Night's Dream", "Romeo and Juliet", "Hamlet", "Macbeth",
            "The New One Minute Manager",
            "Kenneth Hartley Blanchard & Spencer Johnson")

    // Creates map that holds the set of books; Assigns that set of books to particular author
    val library = mapOf("William Shakespeare" to allBooks)

    // Checks if any of the books are "Hamlet" or not
    println("${library.any { it.value.contains("Hamlet") }}")

    // Creates a mutable map to hold set of book title/author and adds one title/author to it.
    val moreBooks = mutableMapOf("The New One Minute Manager"
            to "Kenneth Hartley Blanchard & Spencer Johnson")

    // Checks for the book title is available in the map or not.
    // If the title is not in the map then it will add title into it.
    moreBooks.getOrPut("The Value of Honesty") { "Spencer Johnson" }
    moreBooks.getOrPut("Know Can Do!") { "Kenneth Hartley Blanchard" }

    // Prints whole map
    println(moreBooks)

}