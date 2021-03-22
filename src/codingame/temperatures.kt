package codingame

// PB: (97 characters)
//fun main(){readLine();print(readLine()!!.ifEmpty{"0"}.split(" ").minBy{Math.abs(it.toInt()-.1)})}

// Old:
//fun main()=print(try{readLine();readLine()!!.split(" ").minBy{Math.abs(it.toInt()-.1)}}catch(e:Exception){0})
//fun main()=print({readLine()!!}.let{it();it().ifEmpty{"0"}.split(" ").minBy{Math.abs(it.toInt()-.1)}})
//fun main()=print(readLine().takeIf{it=="0"}?:readLine()!!.split(" ").minBy{Math.abs(it.toInt()-.1)})
//fun main()=print(if(readLine()=="0")0 else readLine()!!.split(" ").minBy{Math.abs(it.toInt()-.1)})
