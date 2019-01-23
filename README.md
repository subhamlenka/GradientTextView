# GradientTextView

GrdientTextView will let you creat gradient color effect on textview.You have to just pass start color and end color

<h3>Add jitpack in your app level build gradle</h3>

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```

<h3>Add the dependency</h3>

```
dependencies {
	        implementation 'com.github.subhamlenka:GradientTextView:9e7d8ea788'
	}
  
  ```
  
 <h2>Example</h2>
 
 <h3>Initalise your textview</h3>
 
 ```
 TextView textview=findViewById(R.id.exampleText);
 ...
 
 ```
 
 <h3>Pass the view with start color and end color like below
 
```
GradientTextView.setGradientColor(textView,getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorPrimaryDark));  

```

 
