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
![1](https://github.com/RamziJabali/Android_Practices/blob/main/screenshots/Screen%20Shot%202021-03-06%20at%2010.44.28%20PM.png)



