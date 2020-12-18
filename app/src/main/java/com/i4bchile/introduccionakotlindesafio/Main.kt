package com.i4bchile.introduccionakotlindesafio



    /* TODO:
    [X] 1. Crear el proyecto Kotlin correctamente.
    [X] 2. Crear archivo “Main.kt” con la función main.
    [X]3. Imprimir “Mi nombre es: {Nombre del alumno}.
    [X]4. Declarar 3 variables numéricas con los valores “10”, “20” y “30”.
    [X]5. Imprimir la suma de las 3 variables.
    [X]6. Declarar 1 variable String y otra variable Char.
    [X]7. Asignarle el valor “Arataka Reigen” a la variable String y “A” a la variable Char.
    [X]8. Imprimir la cantidad de caracteres que tiene la variable String y modificar la variable
            char a otro valor distinto.
    [X]9. Declarar una variable de tipo Float de forma explícita.
    [X]10. Asignar un valor a la variable Float.
    [x]11. Imprimir los valores máximos que pueden almacenar las variables Byte y Short.
    [x]12. Imprimir los valores mínimos que pueden almacenar las variables Int y Long.
    [x]13. Declarar una variable Boolean con true o false e imprimir su valor.
    [X]14. Crear una función llamada “imprimiendoParametros” que recibe 2 parámetros String y
    este imprime el total de caracteres de los dos parámetros.
    [x]15. Crear una función llamada “obtieneIVA” que devuelve el valor del IVA (19%).
    [x]16. Desde la función main llamar a estas dos funciones de forma correcta.
    */

    fun main(){

        val studentName="Jose Luis Ojeda"
        println("Mi nombre es $studentName")

        val numberOne=10
        val numberTwo=20
        val numberThree=30
        val resultado=numberOne+numberTwo+numberThree

        println("La suma de $numberOne, $numberTwo, $numberThree es: $resultado")

        val variableString:String
        var variableChar:Char
        variableString="Arataka Reigen"
        variableChar='A'
        println("La variableChar tiene ahora valor $variableChar")
        println("La variable $variableString tiene ${variableString.length} caracteres")
        variableChar='B'
        println("La variableChar tiene ahora valor $variableChar")
        val variableFloat:Float
        variableFloat=1.5f
        println("La variableFloat tiene valor $variableFloat")

        val maxShort=Short.MAX_VALUE
        val maxByte=Byte.MAX_VALUE

        println("El valor máximo de una variable Short es $maxShort y el de una variable Byte es $maxByte")

        val minInt=Int.MIN_VALUE
        val minLong=Long.MIN_VALUE

        println("El valor mínimo de una variable Int es $minInt y el de una variable Long es $minLong")

        val trueFalseVariable=true

        println("El valor de la variable booleana es $trueFalseVariable")

        printParameters("Jardín", "Botánico")

        val netValue=20000
        val calculatedVAT=getVAT(20000)

        println("El IVA de $netValue es $calculatedVAT")





    }
    fun printParameters (pA:String,pB:String){

        val numCharacters=pA.length+pB.length
        println("El total de caracteres de $pA y $pB es $numCharacters")


    }
    fun getVAT(pValue:Int):Double{
        val vatPercentage=0.19
        return pValue*vatPercentage
    }

