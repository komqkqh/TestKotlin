package com.shin.testkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.test_item.view.*

class TestAdapter : RecyclerView.Adapter<TestAdapter.TestHolderView>() {

    var items: MutableList<TestData> = mutableListOf(TestData("Title1", "Content1"),
            TestData("Title2", "Content2"),TestData("Title3", "Content3"))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolderView {
        return TestHolderView(parent)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: TestHolderView, position: Int) {
        items[position].let {item ->
            with(holder){
                tvTitle.text = item.title
                tvContent.text = item.title
            }
        }
    }

    /**
     * 뷰 홀더 클래스
     */
    inner class TestHolderView(parent: ViewGroup): RecyclerView.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.test_item, parent, false)
    ) {
        val tvTitle = itemView.tv_main_title;
        val tvContent = itemView.tv_main_content;
    }
}