package com.currency.currencyedittext.ext

import com.currency.currencyedittext.regex.onlyNumber

fun String.extractNumber() = replace(onlyNumber,"")

