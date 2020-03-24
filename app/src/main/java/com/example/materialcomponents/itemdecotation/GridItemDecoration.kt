package com.example.materialcomponents.itemdecotation

import android.R.attr.spacing
import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomponents.R


class GridItemDecoration(val context: Context) : RecyclerView.ItemDecoration() {

    val divider = context.resources.getDrawable(R.drawable.item_decoration_grid)
    val spanCount = 2

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        //super.getItemOffsets(outRect, view, parent, state)
        //这里是关键，需要根据你有几列来判断
        val position = parent.getChildAdapterPosition(view) // item position

        //val column: Int = position % 2 // item column


        if (position % spanCount == 0) {
            if (position < spanCount) {
                outRect.set(divider.intrinsicWidth, divider.intrinsicHeight, divider.intrinsicWidth/2, divider.intrinsicHeight)
            }else {
                outRect.set(divider.intrinsicWidth, 0, divider.intrinsicWidth/2, divider.intrinsicHeight)
            }

        } else {
            if (position < spanCount) {
                outRect.set(divider.intrinsicWidth/2, divider.intrinsicHeight, divider.intrinsicWidth, divider.intrinsicHeight)
            }else {
                outRect.set(divider.intrinsicWidth/2, 0, divider.intrinsicWidth, divider.intrinsicHeight)
            }

        }
    }
}