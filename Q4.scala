object Question4 extends App{
    def bookstoreDiscount(p:Double,n:Int)={
        p*.4*n
    }

    def shippingCost(n:Int):Double= n match{
        case x if(x<=50) => 3.0
        case _ => 3.0+(n-50)*.75
    }

    def totalCost(p:Double,n:Int):Double={
        (p*n)-bookstoreDiscount(p,n)-shippingCost(n)
    }

    println(totalCost(24.95,60))
}