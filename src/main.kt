fun main(){
 var girl = Human("sis",21,68)
    girl.eat(20)
    println(girl.weight)
    girl.speak("good girl!")
    girl.birthday()
    var boy =User("David","Tsuma","omah@code","0751234567","love254")
    println(boy.firstName)
    println(boy.password)

}
class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating  $foodWeight kgs of food ")

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age +=1
        println(age)


    }
}
data class User(val firstName:String, val lastName:String,val email:String,var phoneNumber:String,var password:String)