package com.example.materialcomponents.binding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter


@BindingAdapter("imageFromId")
fun bindImageFromId(imageView: ImageView, id: Int?) {
    if (id == null) return
    imageView.setImageResource(id)
}

@BindingAdapter("textFromId")
fun bindTextFromId(textView: TextView, id: Int?) {
    if (id == null) return
    textView.setText(id)
}

@BindingAdapter("backgroundFromColor")
fun bindBackgroundFromColor(view: View, color: Int?) {
    if (color == null) return
    view.setBackgroundColor(view.context.resources.getColor(color))
}