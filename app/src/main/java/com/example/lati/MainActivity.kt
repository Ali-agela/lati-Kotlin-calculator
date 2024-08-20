package com.example.lati

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lati.databinding.ActivityMainBinding
import java.util.Scanner


class MainActivity : AppCompatActivity() {

    lateinit var  Binding:ActivityMainBinding
    var x:Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x:String=""
        Binding=ActivityMainBinding.inflate(layoutInflater);
        setContentView(Binding.root)
        Binding.num1.setOnClickListener {
            x=x+"1"
            Binding.result.setText(x)
        }
        Binding.num2.setOnClickListener {
            x=x+"2"
            Binding.result.setText(x)
        }
        Binding.num3.setOnClickListener {
            x=x+"3"
            Binding.result.setText(x)
        }
        Binding.num4.setOnClickListener {
            x=x+"4"
            Binding.result.setText(x)
        }
        Binding.num5.setOnClickListener {
            x=x+"5"
            Binding.result.setText(x)
        }
        Binding.num6.setOnClickListener {
            x=x+"6"
            Binding.result.setText(x)
        }
        Binding.num7.setOnClickListener {
            x=x+"7"
            Binding.result.setText(x)
        }
        Binding.num8.setOnClickListener {
            x=x+"8"
            Binding.result.setText(x)
        }
        Binding.num9.setOnClickListener {
            x=x+"9"
            Binding.result.setText(x)
        }
        Binding.num0.setOnClickListener {
            x=x+"0"
            Binding.result.setText(x)
        }
        Binding.divide.setOnClickListener {
            x=x+"/"
            Binding.result.setText(x)
        }
        Binding.multibly.setOnClickListener {
            x=x+"*"
            Binding.result.setText(x)
        }
        Binding.Plus.setOnClickListener {
            x=x+"+"
            Binding.result.setText(x)
        }
        Binding.minus.setOnClickListener {
            x=x+"-"
            Binding.result.setText(x)
        }
        Binding.cal.setOnClickListener {

            try{
                x=calculate(x).toString()
                Binding.result.setText(x)
            }
            catch (e : Exception){
                x=""
                Binding.result.setText("invalid content ")
            }


        }
        Binding.clear.setOnClickListener {
            x=""
            Binding.result.setText(x)
        }
        Binding.del.setOnClickListener {
            x= deleteLetter(x)
            Binding.result.setText(x)
        }

    }
}
fun add (num1:Double,num2:Double):Double{
    return num1+num2
}
fun substract (num1:Double,num2:Double):Double{
    return num1-num2;
}
fun multibly (num1:Double,num2:Double):Double{
    return num1*num2;
}
fun divide (num1:Double,num2:Double):Double{
    return num1/num2;
}
fun calculate(opeartion:String):Double{
    if (opeartion==""){
        return 0.0
    }
    var x :Double=0.0
    var y:Double=0.0
    var op:Char='1'
    var temp:String = ""
    var fillx=true
    for (char in opeartion){
        if (char == '+' || char =='*' || char=='/'||char=='-'){
            op=char;
            if (fillx){
                x=temp.toDouble()
                temp=""
            }

        }
        else{
            temp=temp+char
        }
    }
    y=temp.toDouble()
    when(op){
        '+'->return add(x,y)
        '-'->return substract(x,y)
        '*'->return  multibly(x,y)
        '/'->return divide(x,y)
        else->return y
    }
}
fun deleteLetter(x:String):String{
     var newx=""
    for (i in 0..x.length-2){
        newx=newx+x[i];
    }
    return newx
}