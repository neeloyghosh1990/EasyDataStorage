EasyDataStorage
=======

Easy data storage is a library where users can stored their data in Shared Preferences in easier way. It provides to store the data in all primitive data type format as well as object and list of custom object format.

## How to build

Add Jitpack.io to your project level build.gradle file 
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
  
And then in the other gradle file(may be your app gradle or your own module library gradle, but never add in both of them to avoid conflict.)
```java
dependencies {
	        implementation 'com.github.neeloyghosh1990:EasyDataStorage:v1.0'
	}
```
## How to use
1) Initialize the StorageUtility Class like this- 
 ```java
 StorageUtility.initLibrary(this);
``` 
2) Then to store and retrieve  Data use the functions like this-

**For String:**
```java
   StorageUtility.setStringData(<key for storing the value>,<Value>);
   StorageUtility.getStringData(<key for storing the value>);
```
  
**For Integer:**
```java
   StorageUtility.setIntData(<key for storing the value>,<Value>);
   StorageUtility.getIntData(<key for storing the value>);
 ``` 
**For Boolean:**
```java
   StorageUtility.setBooleanData(<key for storing the value>,<Value>);
   StorageUtility.getBooleanData(<key for storing the value>);
```
**For Double:**
```java
   StorageUtility.setDoubleData(<key for storing the value>,<Value>);
   StorageUtility.getDoubleData(<key for storing the value>);
  ```
 **For Long:**
 ```java
   StorageUtility.setLongData(<key for storing the value>,<Value>);
   StorageUtility.getLongData(<key for storing the value>);
  ```
 **For Object:**
 ```java
   StorageUtility.setObject(<key for storing the value>,<Object>);
   StorageUtility.getObject(<key for storing the value>,<.class type of the object>);
 ``` 
   **Eg:**
   ```java
   StorageUtility.setObject("obj",PassengerDetails.class);
   StorageUtility.getObject("obj",PassengerDetails.class);
 ```
  **For List:**
  ```java
   StorageUtility.setListObject(<key for storing the value>,<ArrayList<Object>>);
   StorageUtility.getListObject(<key for storing the value>,<.class type of the object>);
  ```
   **Eg:**
   ```java
   ArrayList<Object>list=new ArrayList<Object>();
   StorageUtility.setListObject("obj",list);
   StorageUtility.getListObject("obj",PassengerDetails.class);
   ```
3) Then to clear all the data-   
```java
   StorageUtility.clearAllData();
``` 
##### Any Queries? or Feedback, please let me know by opening a [new issue](https://github.com/neeloyghosh1990/EasyDataStorage/issues/new)!

## Contact
#### Neeloy Ghosh

* :email: e-mail: neeloy.ghosh@gmail.com


