package com.gpaststudio.listviewpractice_gpaststudio.datas

import android.util.Log

// 학생의 하위 정보 - 이름, 출생연월

class Student (
    val name : String,
    val birthYear : Int) {

//    학생의 기능? 예시
//    자신의 이름을 로그로 찍는 기능

        fun printMyNameToLog(Num1 : Int, Num2 : Double ) : Boolean {

//            num1이 num2보다 크면 로그를 이름만
//            그렇지않다면, 이름과 인사도 로그 출력

        if(Num1 > Num2) {

            Log.d("연습용",this.name)
        }

            else {
                Log.d("연습용", this.name)
                Log.d("연습용","잘 부탁드립니다")
            }

            return true

        }




}