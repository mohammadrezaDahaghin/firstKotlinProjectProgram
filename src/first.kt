fun main (args:Array<String>){
    var c1=car("kia","red",120000)
    var c2=car("renult")
    var  c3=car("red",12000)
    c1.printhellio()
    var t1=track("italy",12000000,"Red")
    t1.printhellio()
}
open class car() {
    var price:Int??=null
    var color:String??=null
    var type:String??=null
    constructor(type:String,color:String,price:Int):this(){
        this.price=price
        this.color=color
        this.type=type
        print("constructor #1 \n")
        print("price:$price , color:$color , price:$price\n")
    }
    constructor(type:String):this(){
        this.type=type
        print("constructor #2 \n")
        print("type:$type\n")
    }
    constructor(color:String,price:Int):this(){
        this.color=color
        this.price=price
        print("constructor #2 \n")
        print("color:$color , price:$price \n")
    }
    open fun printhellio(){
        print("hello")
    }
}
class track():car(){
    var country:String??=null
    constructor(country:String,price: Int,color: String) : this() {
        this.country=country
        this.price=price
        super.color=color
        print("country:$country , color:$color , price:$price\n")

    }

    override fun printhellio() {
        print("override hello")
    }
}