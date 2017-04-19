import Array._
object MultiDimArrayDemo{
    def main(args:Array[String]){
        var mul=ofDim[Int](3,3);    //ofDim is method to create multidimensio array which is present Array package

        for(i <- 0 to 2){
             for(j<- 0 to 2){
                mul(i)(j)=j;
            }
            
        }

         for(i <- 0 to 2){
             for(j<- 0 to 2){
               print(mul(i)(j));
            }
            println();
        }
    }
}