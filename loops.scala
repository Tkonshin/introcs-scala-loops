import scala.math.min
object loops {
// Return a string containing n copies of s, end to end.
// For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
    def stringOfReps(s: String, n: Int): String = {
    var y = 0
    var returns = ""
    for (y<-0 until n){
        returns += s
    }
        returns
    }
// Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).
//For example Factorial(4) returns 1*2*3*4 = 24.
    def factorial(n: Int): Int = {
    var y=0
    var total : Int=1
    for(y<-1 until(n+1)){
        total = total*y
    }
        total
    }
// Return a string containing a filled rectange, where the filling is
// the specified number of columns and rows of the character inChar,
// surrounded by a border made of the character edgeChar.
// For example printRectangle(3, 2, 'i', 'e') prints
// eeeee
// eiiie
// eiiie
// eeeee
    def printRectangle(columns:Int, rows:Int, inChar:String, edgeChar:String): String = {
    var row=1
    var column=1
    var returns=""
    for(row<-1 to rows){
    for(column<-1 to columns){
    if(row==1){
        returns+=edgeChar
    }
    else if(row==rows){
    if(column==1){
        returns+="\n"
    }
        returns+=edgeChar
    }
    else if(column==1){
        returns += "\n"
        returns += edgeChar
    }
    else if(column==columns){
        returns += edgeChar
    }
    else{
        returns += inChar
    }
    }
    }
        returns
    }
    }