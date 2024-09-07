package com.example.InstagramUI.repository


import com.example.InstagramUI.model.GalleryModel
import com.example.InstagramUI.model.PostModel
import com.example.InstagramUI.model.TopPostModel
import com.example.InstagramUI.model.User


class MainRepository {
    val post= mutableListOf(
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("kartal","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("kartal","kartal","adam","Bu benim ilk Postum","Antalya"),
        PostModel("eskinhasan1","kartal","adam","Bu benim ilk Postum","Antalya")
    )

    val topPost= mutableListOf(
        TopPostModel("eskinhasan1","kartal") ,
        TopPostModel("eskinhasan1","kartal"),
        TopPostModel("kartal","kartal"),
        TopPostModel("eskinhasan1","kartal"),
        TopPostModel("eskinhasan1","kartal"),
        TopPostModel("eskinhasan1","kartal"),
    )

    val gallery= mutableListOf(
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
        GalleryModel("kartal"),
    )

    val user= mutableListOf(
        User("eskinhasan1","kartal"),
        User("yagmureris","smal"),
        User("nasulozbagci","kartal"),
        User("enginkarataş","smal"),
        User("mehmetdemir","kartal"),
        User("kamilengin","smal"),
        User("semihdemir","kartal"),
    )
}