package com.example.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1: EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)
        val et3: EditText = findViewById(R.id.et3)
        val et4: EditText = findViewById(R.id.et4)
        val et5: EditText = findViewById(R.id.et5)

        val cd1: EditText = findViewById(R.id.cd1)
        val cd2: EditText = findViewById(R.id.cd2)
        val cd3: EditText = findViewById(R.id.cd3)
        val cd4: EditText = findViewById(R.id.cd4)
        val cd5: EditText = findViewById(R.id.cd5)

        val pt: EditText = findViewById(R.id.pt)
        val pt1: EditText = findViewById(R.id.pt1)
        val pt2: EditText = findViewById(R.id.pt2)
        val pt3: EditText = findViewById(R.id.pt3)
        val pt4: EditText = findViewById(R.id.pt4)

        val res1: TextView = findViewById(R.id.res1)
        val res2: TextView = findViewById(R.id.res2)

        val bt1: Button = findViewById(R.id.bt1)
        val bt2: Button = findViewById(R.id.bt2)


        bt2.setOnClickListener {
            et1.setText("")
            et2.setText("")
            et3.setText("")
            et4.setText("")
            et5.setText("")

            cd1.setText("")
            cd2.setText("")
            cd3.setText("")
            cd4.setText("")
            cd5.setText("")

            pt.setText("")
            pt1.setText("")
            pt2.setText("")
            pt3.setText("")
            pt4.setText("")

            res1.setText("")
            res2.setText("")
        }
        bt1.setOnClickListener {

            var etd1 = et1.text.toString()
            var etd2 = et2.text.toString()
            var etd3 = et3.text.toString()
            var etd4 = et4.text.toString()
            var etd5 = et5.text.toString()

            var cdm1 = cd1.text.toString().toFloatOrNull()?:0f
            var cdm2 = cd2.text.toString().toFloatOrNull()?:0f
            var cdm3 = cd3.text.toString().toFloatOrNull()?:0f
            var cdm4 = cd4.text.toString().toFloatOrNull()?:0f
            var cdm5 = cd5.text.toString().toFloatOrNull()?:0f

            var pt0 = pt.text.toString().toFloatOrNull()?:0f
            var pt01 = pt1.text.toString().toFloatOrNull()?:0f
            var pt02 = pt2.text.toString().toFloatOrNull()?:0f
            var pt03 = pt3.text.toString().toFloatOrNull()?:0f
            var pt04 = pt4.text.toString().toFloatOrNull()?:0f

            var res01 = res1.text.toString()
            var res02 = res2.text.toString()

            if (et1.text.isEmpty() || et2.text.isEmpty() || et3.text.isEmpty() || et4.text.isEmpty() || et5.text.isEmpty() ||
                cd1.text.isEmpty() || cd2.text.isEmpty() || cd3.text.isEmpty() || cd4.text.isEmpty() || cd5.text.isEmpty() ||
                pt.text.isEmpty() || pt1.text.isEmpty() || pt2.text.isEmpty() || pt3.text.isEmpty() || pt4.text.isEmpty()
            ) {
                Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_SHORT).show()
            }
            if (cdm1 !in 1f..3f || cdm2 !in 1f..3f || cdm3 !in 1f..3f || cdm4 !in 1f..3f || cdm5 !in 1f..3f) {
                Toast.makeText(
                    applicationContext,
                    "กรุณากรอกcreditให้ถูกต้อง(1 - 3)",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

            }
            val totalCredits = cdm1 + cdm2 + cdm3 + cdm4 + cdm5
            val totalGradePoints =
                (cdm1 * pt0) + (cdm2 * pt01) + (cdm3 * pt02) + (cdm4 * pt03) + (cdm5 * pt04)
            val gpa = totalGradePoints / totalCredits
            res1.text = String.format(" %.2f", totalCredits)
            res2.text = String.format("%.2f", gpa)}
        }

    }


