package com.qualentum.sprint1

import kotlin.random.Random

fun getRandomText(minLength: Int, maxLength: Int): String {
    val nWords: Int = getRandomNumber(minLength, maxLength)
    return buildParagraph(nWords)
}

fun getRandomNumber(firstN: Int, endN: Int): Int {
    return Random.nextInt(firstN, endN)
}

fun buildParagraph(numberWords: Int): String{
    var paragraph = ""
    for(i in 0..numberWords){
        paragraph += wordsGroups[Random.nextInt(0, wordsGroups.size)]
    }
    return paragraph
}

