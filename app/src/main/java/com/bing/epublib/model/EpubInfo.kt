package com.bing.epublib.model

data class EpubInfo(
    val fileCode: String,
    val startPositionInBook: Double,
    val setting: EpubSetting? = null,
)

data class EpubSetting(
    val fontSize: Int = 0,
    val colorFilter: Int = 0,
    val pageEffect: Int = 0,
)