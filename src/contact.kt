import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {

    Task()
}

class person(){
    private var name=""
    private var phoneNum:Int?=null

    constructor(name:String,phoneNum:Int):this(){
        this.name=name
        this.phoneNum=phoneNum
    }

    fun setName(name:String){
        this.name=name
    }

    fun setPhoneNumber(phoneNum: Int?){
        this.phoneNum=phoneNum
    }

    //getname
    fun getName():String{
        return name
    }

    fun getPhoneNumber():Int?{
        return phoneNum
    }


}

fun AddNewContact(person: person){

    try {
        var f=FileWriter("contact",true)
        f.write(person.getName()+":"+person.getPhoneNumber()+"\n")
        f.close()


    }catch (e:Exception){
        println(e.message)
    }
}

fun getcontact(){
    try {
        var Readable=FileReader("contact")
        var readline:Int?=null
        while (readline!=-1){
            readline=Readable.read()
            print(readline.toChar())
        }

    }catch (e:Exception){
        println(e.message)
    }
}

fun Task(){
    var read:Int??
    var name:String??
    var number:Int??
    println("اگر میخواهید مخاطب اضافه کنید عدد1 و در صورت مشاهد لیست عدد2 را وارد کنید")

    read= readLine()!!.toInt()
    if (read==1){
        println("نام مخاطب را وارد کنید:")
        name= readLine()!!.toString()
        println("شماره تلفن را وارد کنید:")
        number= readLine()!!.toInt()

        var person=person(name,number)
        AddNewContact(person)
        Task()
    }else{
        getcontact()
        Task()
    }
}
