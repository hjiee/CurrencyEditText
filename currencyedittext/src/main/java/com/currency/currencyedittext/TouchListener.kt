package com.currency.currencyedittext

import android.graphics.drawable.Drawable
import android.view.MotionEvent
import android.view.View
import android.widget.EditText

class TouchListener(
    private val clearDrawable: Drawable
) : View.OnTouchListener {
    override fun onTouch(view: View?, event: MotionEvent?): Boolean {
        if(event?.x!! > (view?.width!! - view.paddingRight - clearDrawable.intrinsicWidth)) {
            when(event.action) {
                MotionEvent.ACTION_UP -> {
                    (view as EditText).setText("")
                    clearDrawable.setVisible(false,false)
                }
            }
        }
        return false
    }
}