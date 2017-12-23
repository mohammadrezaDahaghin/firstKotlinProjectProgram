fun main (args:Array<String>){
    var m=motor<Int>(40)
    var m1=motor<String>("hello")

    myprint(12)
    myprint("salam")
    myprint(true)
}

class motor<T>(){
    var age:T??=null
    constructor(age:T):this(){
        this.age=age
        print("age :$age")
    }
}



fun <T>myprint(n:T){
    println("n: $n")
}
