package com.shin.testkotlin

import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_recyclerview.adapter = TestAdapter();
        rv_recyclerview.layoutManager = LinearLayoutManager(this)
    }


    /**
     * 구구단 예제
     */
    fun onGugudan() {
        for (i in 1..9) {
            for (j in 1..9) {
                if (j == 9) {
                    println("$i * $j = ${i * j}")
                } else {
                    print("$i * $j = ${i * j}")
                }

            }
        }
    }

    /**
     * 패딩 넣기
     */
    fun padding() {
        val padding = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()
// 왼쪽, 오른쪽 padding 설정
//        setPadding(padding, 0, padding, 0)


        // 하단처럼 let을 사용하여 리턴된 데이터를 넘겨 사용할수있음

        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt().let {
            // padding 대신 it 사용
//            setPadding(it, 0, it, 0)
        }

    }


}
