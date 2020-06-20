fun main(args:Array<String>) {
    var temp :Int 
    var a :IntArray=intArrayOf(83,12,54,60,95,74,88,27,35,41) 
    println("Unsorted Numbers:")
    for(i in 0..9)
    {
        print("	"+a[i])
    }
    for(i in 0..9) 
    {
        for(j in 1..(9-i)) 
        {
            if(a[j-1]>a[j]) 
            {
                temp=a[j-1]
                a[j-1]=a[j] 
                a[j]=temp 
            }
        }
    }
    println() 
    print("Sorted Numbers:")
    println() 
    for(i in 0..9) 
    {
        print("	"+a[i]) 
    }
}