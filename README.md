<h1 align="center">Learning Android</h1>
<p align="center">
 
<h2 align="center">onClick</h2>

We made a button in XML and defined it's onClick property which when we go to Java will allows us to make it 

into a function that when the button is clicked the function clickFunction is then called upon.

```
 public void clickFunction(View view){
 
CODE

}

```

We had to import the View.

```
import android.view.View;
```

<h4 align="center">Button</h4>

```
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:onClick="clickFunction" // We now defined an onClick function called clickFunction
        android:text="button"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

![1](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%2012.23.56%20AM.png)

we're putting a line of code into Log, the log tells us what is going on behind the scenes when the app is running.

So we're putting a type of log called "i" for info, which tells you certaion information about your application.

We add a tag that describes the log, and we can display that message in the Logcat.

<h4 align="center">Log</h4>

```
public void clickFunction(View view){
    Log.i("info", "Button is pressed")
}
```

OUTPUT:
![2](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-03-06%20at%2010.44.28%20PM.png)


<h4 align="center">EditText</h4>

```
<EditText
        android:id="@+id/nameEditText" //Edit text ID
        android:layout_width="406dp"
        android:layout_height="67dp"
        android:layout_marginBottom="51dp"
        android:ems="10"
        android:hint="Your Name?"
        android:inputType="textPersonName"
        android:text="Name"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.4"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />
```

![3](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%2012.24.07%20AM.png)

To see what the user enters in the EditText box the log when the button is pressed we need to include it in the onCLick function we made

We first need to make a EditText variable which has a type of `EditText` we will name it `nameEditText` and we'll set it equal to 

the EditText box view and we'll need to use `findViewById()` to find that view. We need to use `R` to be able to acess resources

and then we specify `id` and then the name of the EditText box id we made which is `nameEditText`.

```
EditText nameEditText = (EditText) findViewById(R.id.nameEditText);//it will return a view so we want to convert the View into an 
                                                                     EditText
```

```
 public void clickFunction(View view){
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        Log.i("info", "Button is pressed");
        Log.i("Values" , nameEditText.getText().toString()); //gets the value of the variable nameEditText, then we convert it to a string!

    }
```
![4](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%2012.38.36%20AM.png)
![5](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%2012.06.06%20AM.png)

<h2 align="center">Example</h2>

<h4 align="center">XML</h4>


```
<EditText
        android:id="@+id/editTextTextUserName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Enter Username"
        app:layout_constraintBottom_toTopOf="@+id/editTextPassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editTextPassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Enter Password"
        android:inputType="textPassword"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Button"
        android:onClick="loginButtonOnClick"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextPassword" />
```

<h4 align="center">Java</h4>

```
    public void loginButtonOnClick(View view){
        EditText userNameEditText = (EditText)(findViewById(R.id.editTextTextUserName));
        EditText passwordEditText = (EditText)(findViewById(R.id.editTextPassword));

        Log.i("info", "Button Clicked");

        Log.i("UserName", userNameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());
    }
```
<h4 align="center">User Interface</h4>

![6](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%201.41.29%20PM.png)

<h4 align="center">Log Cat</h4>

![7](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-07%20at%201.41.51%20PM.png)


<h4 align="center">Toast</h4>


To use the Toast features you have to import the Toast class first
```
import android.widget.Toast;
```
You can display a pop up using toast by using the following
```
Toast.makeText(<context>,<display message>, <Toast.LENGTH_SHORT>).show();
```
Displays the text typed in the ```EditText``` box.
```
Toast.makeText(this,"Hello "+userNameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
```

![8](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-14%20at%2012.38.06%20PM.png)

<h4 align="center">ImageView</h4>

```
 <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:scaleType="fitCenter"
        android:src="@drawable/aot"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintVertical_bias="0.551" />
```

![9](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/ImageView.png)

We can use the onClick function from the button to change the image of the ImageView.

We use `setImageResource(R.id.<filename>);` to change the image of the `ImageView`
Example
```
public void buttonOnClick(View view){
        ImageView image = (ImageView) (findViewById(R.id.imageView));
        image.setImageResource(R.drawable.eren);
    }
```
<h2 align="center">Example of changing an image onClick</h2>

![10](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/ImageChange.gif)

<h1 align="center">Currency Changing Application</h1>

<h2 align="center">XML</h2>

```
<ImageView
        android:id="@+id/imageViewMoney"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/pounds"
        app:layout_constraintBottom_toTopOf="@id/textViewCurrency"
        app:layout_constraintHorizontal_bias="0.495"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textViewCurrency"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/ENTER_CURRENCY"
        app:layout_constraintBottom_toTopOf="@id/buttonToConvert"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/imageViewMoney" />

    <EditText
        android:id="@+id/userEditTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="@string/ENTER_CURRENCY_VALUE"
        app:layout_constraintTop_toBottomOf="@+id/textViewCurrency"
        app:layout_constraintBottom_toTopOf="@id/buttonToConvert"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        />

    <Button
        android:id="@+id/buttonToConvert"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/CONVERT"
        android:onClick="convertToDollarsOnButtonClick"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@id/textViewCurrency" />

```
<h2 align="center">UI</h2>

![11](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/Screen%20Shot%202021-04-16%20at%2011.03.14%20PM.png)

<h2 align="center">Java</h2>

This is the onClick function we covered

```
 public void convertToDollarsOnButtonClick(View view) {
        EditText userText = (EditText) (findViewById(R.id.userEditTextView));
        ImageView imageView = (ImageView) (findViewById(R.id.imageViewMoney));

        Log.i("button clicked", "User Entry");

        Toast.makeText(this, userText.getText().toString() + "£ is " + convertPoundsToDollars(Double.parseDouble(userText.getText().toString())) + "$", Toast.LENGTH_LONG).show();

        imageView.setImageResource(R.drawable.money);

    }
```

The function that's doing the converting 

```
private double convertPoundsToDollars(Double pounds) {
        double dollarInPounds = 1.38;
        return pounds * dollarInPounds;
    }
```

<h2 align="center">OUTPUT</h2>

![12](https://github.com/RamziJabali/Learning_Android/blob/main/screenshots/currencyConverter.gif)

<h1 align="center">Kotlin</h1>


<h2 align="center">Print</h2>

In Kotlin the exection of the instructions begin with the `main` method.

```
fun main(){
   println("Hello world!")
}
```

Similar to Java Kotlin uses the keyword `print` and `println` to print is arguments to the output.

```
fun main(){ 
   print("Hello")
   println(" people!")
   print(2021)// Adds a line so that the text appears on the next line
}
```

<h2 align="center">Functions</h2>

The function below has two parameters of type `Int` and has a return type of `Int` as well.

```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

A function body can be an expression. Its return type is inferred. Like so:

```
fun sum(a: Int, b: Int) = a + b

fun main() {
    println("sum of 19 and 23 is ${sum(19, 23)}")
}

//OutPut
//sum of 19 and 23 is 42
```

You can also make functions that do not return any value

```
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
```

<h2 align="center">Variables</h2>

Read-only local variables are defined using the keyword `val`. They can be assigned a value only once. 
Which is like Java's `final` keyword.

```
val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment
```
Variables that can be reassigned use the `var` keyword.

```
var x = 5 // `Int` type is inferred
x += 1
```

You can declare variables globaly as well.

```
val PI = 3.14
var x = 0

fun incrementX() { 
    x += 1 
}
```

<h2 align="center">Creating Classes and Instances</h2>

The keyword `class` is used to define a class like Java.

`class House` 

The properties of a class can be listed within it's declaration or body.

```
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}
```

The default constructor with parameters listed in the class declaration is available automatically.

```
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2 
}

fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}

//The perimeter is 14.0
```

Inheritance between classes is declared by a colon (`:`). 
Classes are final by default; to make a class inheritable, mark it as `open`.

```
open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}
```

<h2 align="center">String Templates</h2>

```
var a = 1
// simple name in template:
val s1 = "a is $a" 

a = 2
// arbitrary expression in template:
val s2 = "${s1.replace("is", "was")}, but now is $a"

//a was 1, but now is 2
```
<h2 align="center">Conditional Expressions</h2>

<h3 align="center">If statement</h3>

```
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
```

In Kotlin, `if` can also be used as an expression.

```
fun maxOf(a: Int, b: Int) = if (a > b) a else b

// As expression
val max = if (a > b) a else b
```

Branches of if branches can be blocks. In this case, the last expression is the value of a block:

```
val max = if (a > b) {
    print("Choose a")
    a
} else {
    print("Choose b")
    b
}
```

If you're using `if` as an expression, for example, for returning its value or assigning it to a variable, the else branch is mandatory.


<h3 align="center">When expression</h3>

when defines a conditional expression with multiple branches.
It is similar to the switch statement in C-like languages. 
Its simple form looks like this.

```
when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> { // Note the block
        print("x is neither 1 nor 2")
    }
}
```
`when`matches its argument against all branches sequentially until some branch condition is satisfied.

`when` can be used either as an expression or as a statement. If it is used as an expression, the value of the first matching branch becomes the value of the overall expression. If it is used as a statement, the values of individual branches are ignored. 

The `else` branch is evaluated if none of the other branch conditions are satisfied. 
If `when` is used as an expression, the `else` branch is mandatory, unless the compiler can prove that all possible cases are covered with branch conditions, for example, with `enum` class entries and sealed class subtypes).

The way to define a common behavior for multiple cases is by using a comma `,` that allows you to combine the cases in a single line.

```
when(x){
 0, 1 -> print ("x == 0 or x ==1")
 else -> print ("otherwise")
}
```

You can use arbitrary expressions (not only constants) as branch conditions

```
when (x) {
    parseInt(s) -> print("s encodes x")
    else -> print("s does not encode x")
}
```

You can also check a value for being in or !in a range or a collection:

```
when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}
```

Another option is checking that a value is or !is of a particular type. 

```
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}
```

`when` can also be used as a replacement for an `if`-`else` `if` chain. If no argument is supplied, the branch conditions are simply boolean expressions, and a branch is executed when its condition is true:

```
when {
    x.isOdd() -> print("x is odd")
    y.isEven() -> print("y is even")
    else -> print("x+y is odd")
}
```


```
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}
```

<h3 align="center">For Loop</h3>

The syntax for the For Loop

```
for(item in colection) print(item)
```

The body of a `for` can be a block

```
for (item: Int in ints){
 //block of code
}
```

As mentioned before, for iterates through anything that provides an iterator.

This means that it:

has a member or an extension function `iterator()` that returns `Iterator<>`:

has a member or an extension function `next()`

has a member or an extension function `hasNext()` that returns `Boolean`.

All of these three functions need to be marked as `operator`.

To iterate over a range of numbers, use a range expression:

```
for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
```

```
val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
     }
//or

val items = listOf("apple", "banana", "kiwifruit")
for (index in items.indices) {
    println("item at $index is ${items[index]}")
}
```

A `for` loop over a range or an array is compiled to an index-based loop that does not create an iterator object.

If you want to iterate through an array or a list with an index, you can do it this way:

```
for (i in array.indices) {
    println(array[i])
}
```
Alternatively, you can use the `withIndex` library function:

```
fun main() {
    val array = arrayOf("a", "b", "c")
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }
}
```



<h3 align="center">While Loop</h3>

while and do-while loops execute their body continuously while their condition is satisfied. The difference between them is the condition checking time:

while checks the condition and, if it's satisfied, executes the body and then returns to the condition check.

do-while executes the body and then checks the condition. If it's satisfied, the loop repeats. So, the body of do-while executes at least once regardless of the condition.

```
val items = listOf("apple", "banana", "kiwifruit")
var index = 0
while (index < items.size) {
    println("item at $index is ${items[index]}")
    index++
}
```

```
while (x > 0) {
    x--
}

do {
    val y = retrieveData()
} while (y != null) // y is visible here!
```
