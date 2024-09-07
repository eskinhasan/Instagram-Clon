package com.example.InstagramUI.model

import android.os.Parcel
import android.os.Parcelable

data class PostModel(
    val userName:String,
    val userImage:String,
    val postImage:String,
    val postTitle:String,
    val postLocation:String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(userName)
        parcel.writeString(userImage)
        parcel.writeString(postImage)
        parcel.writeString(postTitle)
        parcel.writeString(postLocation)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PostModel> {
        override fun createFromParcel(parcel: Parcel): PostModel {
            return PostModel(parcel)
        }

        override fun newArray(size: Int): Array<PostModel?> {
            return arrayOfNulls(size)
        }
    }
}
