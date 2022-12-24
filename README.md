# FactoryDesignPattern
Implementation of Factory Design Pattern

A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

It’s useful when you don’t know beforehand the exact specificities and dependencies of the objects your code will be working with. Consider an ice cream factory - you  first need the common functionality to make ice cream and then can add specifications for different flavors.

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

* ![alt text](https://github.com/abhishekjais-124/FactoryDesignPattern/blob/master/factory.jpg?raw=true)
