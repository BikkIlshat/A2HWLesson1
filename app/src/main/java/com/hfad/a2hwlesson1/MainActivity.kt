package com.hfad.a2hwlesson1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.hfad.a2hwlesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding // превращаем XML  файл в Class со всеми его переменными
    val a = 9
    val b = 4

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater) // inflate - поместил всё это в памят и bindingClass становится активным для рисования
        setContentView(bindingClass.root) // bindingClass передаём в setContentView что бы соединить с моим Activity и  теперь через bindingClass пользуемся элементаит XML разметки (Кнопки, Вьюшки и т.п.)

        bindingClass.plus.setOnClickListener {

            val result = a + b
            bindingClass.tvResult.text = "Результат сложения равен : $result"
        }

        bindingClass.minus.setOnClickListener {

            val result = a - b
            bindingClass.tvResult.text = "Результат вычитания равен : $result"
        }

        bindingClass.multiply.setOnClickListener {

            val result = a * b
            bindingClass.tvResult.text = "Результат умножения равен : $result"

        }

        val data = Person("Il'shat", "Bikkuzin", "age", 33)
        val testObject = data.copy()
        Toast.makeText(this, "Name: ${testObject.firstName}, ${testObject.secondName}, ${testObject.ageString}  ${testObject.age}", Toast.LENGTH_LONG).show()

        forEachCycle()
        closedRangeCycle()
        closedRangeCycleReverse()
        reverseWithStep()
    }

    private fun forEachCycle() {
        val arrayList = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (i in arrayList) {
            Log.d("forEachCycle", i.toString())
        }
    }

    private fun closedRangeCycle() {
        for (i in 1..40) {
            Log.d("RangeCycle", i.toString())
        }
    }

    private fun closedRangeCycleReverse() {
        for (i in 100 downTo 50) {
            Log.d("Reverse", i.toString())
        }
    }

    private fun reverseWithStep() {
        for (i in 20 downTo 0 step 5) {
            Log.d("withStep", i.toString())
        }
    }
}