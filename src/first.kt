import java.io.FileWriter

fun main (args:Array<String>){
    createFile("book.php","<?php?>")
    createFile("book.php","include();")


}

fun createFile(n:String,comment:String){
    try {
        var file=FileWriter(n,true)
        file.write(comment)
        file.close()
    }catch (e:Exception){
        e.printStackTrace()
    }


}