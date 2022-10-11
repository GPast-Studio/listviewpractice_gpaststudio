package com.gpaststudio.listviewpractice_gpaststudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gpaststudio.listviewpractice_gpaststudio.adapters.StudentAdapter
import com.gpaststudio.listviewpractice_gpaststudio.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStuduentList = ArrayList<Student>()

    lateinit var madapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStuduentList.add( Student("GP-Studio",1989) )
        mStuduentList.add( Student("박선진",1989) )
        mStuduentList.add( Student("이정민",1997) )
        mStuduentList.add( Student("김영례",1961) )
        mStuduentList.add( Student("이주현",1964) )


        madapter = StudentAdapter(this, R.layout.student_list_item,mStuduentList)


        studentListView.adapter = madapter




    }
}