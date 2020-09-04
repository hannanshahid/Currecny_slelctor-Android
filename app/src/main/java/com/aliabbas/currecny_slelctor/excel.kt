package com.aliabbas.currecny_slelctor

import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_excel.*
import org.apache.poi.hssf.usermodel.HSSFWorkbook

import org.apache.poi.ss.usermodel.Row

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


import java.io.File

import java.io.FileOutputStream


@Suppress("DEPRECATION")
class excel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excel)
        buttonsaveexcel.setOnClickListener {

            savetoexcel()
        }
    }

    private fun savetoexcel() {

        var name="hannantest.xls"

        //New Workbook
        val hSSFWorkbook = HSSFWorkbook()
        val createSheet= hSSFWorkbook.createSheet(name)
        // columns name create
        val createRow= createSheet.createRow(0)
        createRow.createCell(0).setCellValue("Registration NO")
        createRow.createCell(1).setCellValue("Semester")
        createRow.createCell(2).setCellValue("Degree")
        createRow.createCell(3).setCellValue("Section")
        createRow.createCell(4).setCellValue("Marks")


        val createRow2 = createSheet.createRow(1)
        createRow2.createCell(0).setCellValue("fa16")
        createRow2.createCell(1).setCellValue("3")
        createRow2.createCell(2).setCellValue("cs")
        createRow2.createCell(3).setCellValue("A")
        createRow2.createCell(4).setCellValue("23")

        val createRow3 = createSheet.createRow(2)
        createRow3.createCell(0).setCellValue("fa16")
        createRow3.createCell(1).setCellValue("76")
        createRow3.createCell(2).setCellValue("cs")
        createRow3.createCell(3).setCellValue("A")
        createRow3.createCell(4).setCellValue("23")

      /*  while (i < this.testAdapter.dataList.size) {
            val i2 = i + 1
            val createRow2: Row = createSheet.createRow(i2)
            createRow2.createCell(0).setCellValue(this.testAdapter.dataList.get(i).user.name)
            createRow2.createCell(1).setCellValue(this.testAdapter.dataList.get(i).user.semester)
            createRow2.createCell(2).setCellValue(this.testAdapter.dataList.get(i).user.branch)
            createRow2.createCell(3).setCellValue(this.testAdapter.dataList.get(i).user.sect)
            createRow2.createCell(4).setCellValue(this.testAdapter.dataList.get(i).score)
            i = i2
        }*/



        //save the file under document folder of android
        val file = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), name)

        try {
            val fileOutputStream = FileOutputStream(file)
            hSSFWorkbook.write(fileOutputStream)
            val sb = StringBuilder()
            sb.append("Writing file")
            sb.append(name)
            Log.w("FileSaver", sb.toString())
            fileOutputStream.close()
            Toast.makeText(
                this,
                "File is saved under Documents folder",
                Toast.LENGTH_SHORT
            ).show()
        }
        catch (e: Exception)
        {
            Toast.makeText(this, "Can't be saved  $e", Toast.LENGTH_SHORT).show()
            Log.i("file", e.toString())
        }
    }
}