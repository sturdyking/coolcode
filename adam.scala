

object adam extends App {
 

    class Human {
        def say (x: String) = println(x)
        def punch (x:Human) = x say "oww!"
    }
    



    val adam = new Human
    val alex = new Human
    
    adam punch alex

    
}
