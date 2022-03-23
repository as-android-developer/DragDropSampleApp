package com.example.dragdropsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import androidx.core.content.ContextCompat
import com.example.dragdropsampleapp.utils.ChoiceDragListener
import com.example.dragdropsampleapp.utils.ChoiceTouchListener
import com.google.android.material.textview.MaterialTextView
import org.apmem.tools.layouts.FlowLayout

class MainActivity : AppCompatActivity() {

    private lateinit var dynamicTitleTextViewWrapper: FlowLayout
    private lateinit var dynamicFullDescTextViewWrapper: FlowLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dynamicTitleTextViewWrapper = findViewById(R.id.dynamic_insales_title_textview_wrapper)
        dynamicFullDescTextViewWrapper = findViewById(R.id.dynamic_insales_full_description_textview_wrapper)


    }

    override fun onResume() {
        super.onResume()

//        val titleTextList = "established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.".split("")
//        dynamicTitleTextViewWrapper.removeAllViews()
//        for (i in 0 until titleTextList.size) {
//            val params = FlowLayout.LayoutParams(
//                FlowLayout.LayoutParams.WRAP_CONTENT,
//                FlowLayout.LayoutParams.WRAP_CONTENT
//            )
//            params.setMargins(5, 5, 5, 5)
//            val textView = MaterialTextView(this)
//            textView.layoutParams = params
//            textView.text = titleTextList[i].trim()
//            textView.tag = "title"
//            textView.id = i
//            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
//            textView.setTextColor(ContextCompat.getColor(this, R.color.black))
//
//            textView.setOnTouchListener(ChoiceTouchListener())
//            textView.setOnDragListener(ChoiceDragListener())
//            dynamicTitleTextViewWrapper.addView(textView)
//        }

        val fullDescTextList = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary".split(" ")
        dynamicFullDescTextViewWrapper.removeAllViews()
        for (i in 0 until fullDescTextList.size) {
            val params = FlowLayout.LayoutParams(
                FlowLayout.LayoutParams.WRAP_CONTENT,
                FlowLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(5, 5, 5, 5)
            val textView = MaterialTextView(this)
            textView.layoutParams = params
            textView.text = fullDescTextList[i].trim()
            textView.tag = "title"
            textView.id = i
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
            textView.setTextColor(ContextCompat.getColor(this, R.color.black))
            textView.setOnTouchListener(ChoiceTouchListener())
            textView.setOnDragListener(ChoiceDragListener())
            dynamicFullDescTextViewWrapper.addView(textView)
        }
    }
}