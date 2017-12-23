fun main(args: Array<String>) {
    var t=newThread("a")
    var t1=newThread("b")
    t.start()
    t1.start()

}
class newThread():Thread(){
    var temp=""
    constructor(temp:String):this(){
        this.temp=temp
    }
     override fun run() {
         var t=0
         while (t<10){
             println("$temp:$t")
             t++
             sleep(1000)
         }

    }
}