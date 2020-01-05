# Loggy
Loggy is a library for android developers for logcat . we have really good framework Log , which is really good to print data on log . but problem is that we have to comment or erase or delete that particular line from program , but using Loggy you just have to set a method whether you want to show your log data or not . you can turn off your all printing logs by just setting a method 
anywhere in your project it could be your app controller or launching activity . so you do need to find and erase log lines . 

To use this library : 

Add mevan or JitPack into your project gradle file like this :

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  and than paste idependency into your module gradle file : 
  
  dependencies {
	        implementation 'com.github.monikkacha:Loggy:1.0'
	}
