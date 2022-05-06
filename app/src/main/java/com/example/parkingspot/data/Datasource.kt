package com.example.parkingspot.data

import com.example.parkingspot.R
import com.example.parkingspot.model.Chaptercontent

class Datasource {
    fun loadChapterContent(): List<Chaptercontent> {
        return listOf<Chaptercontent>(
            Chaptercontent(R.string.chapterstr1),
            Chaptercontent(R.string.chapterstr2),
            Chaptercontent(R.string.chapterstr3),
            Chaptercontent(R.string.chapterstr4),
            Chaptercontent(R.string.chapterstr5),
            Chaptercontent(R.string.chapterstr6),
            Chaptercontent(R.string.chapterstr7),
            Chaptercontent(R.string.chapterstr8),
            Chaptercontent(R.string.chapterstr9),
            Chaptercontent(R.string.chapterstr10),
            Chaptercontent(R.string.chapterstr11),
            Chaptercontent(R.string.chapterstr12)
        )
    }
}