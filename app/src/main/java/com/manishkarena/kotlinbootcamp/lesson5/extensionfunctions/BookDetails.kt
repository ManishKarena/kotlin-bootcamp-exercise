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

package com.manishkarena.kotlinbootcamp.lesson5.extensionfunctions

fun main(args: Array<String>) {

    // Prints the book-weight
    println("Weight of the book is :- ${Book().getBookWeight()}.")

    // Creates instance of the book and torn 2 pages from the book
    val book = Book()
    book.tornPages(2)

    // Prints the book-weight
    println("Total page in the book after 2 pages gets torn :- ${book.pages}.")

    // Creates instance of puppy.
    val puppy = Puppy()

    // Gives the book to puppy to play with until there are no more pages.
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in book")
    }

}