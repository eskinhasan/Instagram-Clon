package com.example.InstagramUI.model

import android.os.Parcel
import android.os.Parcelable

data class GalleryModel(
    val image:String
):Parcelable {
    constructor(parcel: Parcel) : this(parcel.readString().toString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<GalleryModel> {
        override fun createFromParcel(parcel: Parcel): GalleryModel {
            return GalleryModel(parcel)
        }

        override fun newArray(size: Int): Array<GalleryModel?> {
            return arrayOfNulls(size)
        }
    }
}
