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

