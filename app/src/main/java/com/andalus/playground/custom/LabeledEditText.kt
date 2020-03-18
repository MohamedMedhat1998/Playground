package com.andalus.playground.custom

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.andalus.playground.R
import kotlinx.android.synthetic.main.labeled_edit_text_layout.view.*

class LabeledEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyle: Int
) : ConstraintLayout(
    context,
    attrs,
    defStyle
) {

    constructor(context: Context,attrs: AttributeSet) : this(context, attrs,0)

    init {
        val layout = View.inflate(context, R.layout.labeled_edit_text_layout, this)
        val attributeSet = context.obtainStyledAttributes(attrs, R.styleable.LabeledEditText)
        val label = attributeSet.getString(R.styleable.LabeledEditText_label)
        val labelColor = attributeSet.getColor(R.styleable.LabeledEditText_label_color, Color.BLACK)
        val backgroundColor =
            attributeSet.getColor(R.styleable.LabeledEditText_input_background, Color.WHITE)
        val inputColor = attributeSet.getColor(R.styleable.LabeledEditText_input_color, Color.BLACK)
        layout.tvLabel.text = label
        layout.tvLabel.setTextColor(labelColor)
        layout.setBackgroundColor(backgroundColor)
        layout.etInput.setTextColor(inputColor)
        attributeSet.recycle()
    }

}