package com.gpaststudio.listviewpractice_gpaststudio.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.gpaststudio.listviewpractice_gpaststudio.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student> (mContext, resId, mList){
}