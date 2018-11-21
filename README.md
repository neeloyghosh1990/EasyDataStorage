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
  
Add the dependency
`dependencies {
	        implementation 'com.github.neeloyghosh1990:EasyDataStorage:v1.0'
	}
  
## How to use
1) Initialize the StorageUtility Class like this- 
 
 StorageUtility.initLibrary(this);

2) Then to store and retrieve  Data use the functions like this-

For String:
   StorageUtility.setStringData(<key for storing the value>,<Value>);
   StorageUtility.getStringData(<key for storing the value>);
  
For Integer:
   StorageUtility.setIntData(<key for storing the value>,<Value>);
   StorageUtility.getIntData(<key for storing the value>);
  
For Boolean:
   StorageUtility.setBooleanData(<key for storing the value>,<Value>);
   StorageUtility.getBooleanData(<key for storing the value>);

 For Double:
   StorageUtility.setDoubleData(<key for storing the value>,<Value>);
   StorageUtility.getDoubleData(<key for storing the value>);
  

 For Long:
   StorageUtility.setLongData(<key for storing the value>,<Value>);
   StorageUtility.getLongData(<key for storing the value>);
  
 For Object:
   StorageUtility.setObject(<key for storing the value>,<Object>);
   StorageUtility.getObject(<key for storing the value>,<.class type of the object>);
  
   Eg:
   StorageUtility.setObject("obj",PassengerDetails.class);
   StorageUtility.getObject("obj",PassengerDetails.class);
 
  For List:
   StorageUtility.setListObject(<key for storing the value>,<ArrayList<Object>>);
   StorageUtility.getListObject(<key for storing the value>,<.class type of the object>);
  
   Eg:
   ArrayList<Object>list=new ArrayList<Object>();
   StorageUtility.setListObject("obj",list);
   StorageUtility.getListObject("obj",PassengerDetails.class);
