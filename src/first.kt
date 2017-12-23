fun main (args:Array<String>){
    var k=kotlin()
    k.printHello()
    k.printBye()

}


interface myInter{
    fun printHello()
}

interface myInter1{
    fun printBye()
}
class kotlin():myInter,myInter1{
    override fun printHello() {
       println("hello")
    }

    override fun printBye() {
        println("bye")
    }

}