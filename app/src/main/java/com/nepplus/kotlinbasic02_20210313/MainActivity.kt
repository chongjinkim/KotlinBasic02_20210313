package com.nepplus.kotlinbasic02_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendBtn.setOnClickListener {

//            버튼이 눌리면
//            inputEdt에 적힌 내용을 -> inputMessage에 메모 get을 써먹었다

            val inputMessage = inputEdt.text.toString()

//            2. conetentTXT의 txt 속성값을 -> inputMessage에 적힌 값으로 변경 set을 써먹었다

            contentTxt.text = inputMessage
        }

    }
}