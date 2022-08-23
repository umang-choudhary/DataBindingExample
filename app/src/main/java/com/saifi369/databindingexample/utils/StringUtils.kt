package com.saifi369.databindingexample.utils

class StringUtils {

    companion object {

        @JvmStatic
        fun getTotalRatings(totalRatings: Int): String {
            return "($totalRatings)"
        }

        @JvmStatic
        fun getPrice(price: Double): String {
            return "$price$"
        }

    }

}