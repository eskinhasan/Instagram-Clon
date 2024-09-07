package com.example.InstagramUI.model

import android.os.Parcel
import android.os.Parcelable

data class TopPostModel(
    val userImage:String,
    val postImage:String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(userImage)
        parcel.writeString(postImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TopPostModel> {
        override fun createFromParcel(parcel: Parcel): TopPostModel {
            return TopPostModel(parcel)
        }

        override fun newArray(size: Int): Array<TopPostModel?> {
            return arrayOfNulls(size)
        }
    }
}
