# patterns-examples
## Design Patterns
A design pattern is a reusable solution to a recurring problem within a given context. It means, they are well tested solutions to general problems in software porgramming, they're usually regarded as best practices by some experts.

Design Patterns were officially presented in the book "Design Patterns - Elements of Reusable Object-Oriented Software" which was written by Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides. The authors are also known as Gang of Four (GoF).

There were originally 23 Desing Patterns specified by GoF. However, with new programming paradigms and new programming stacks releasing more frequently, we currently don't know the official amount but we expect a much higher number.

Design Patterns can be classified in three main categories:

* Creational Patterns: They deal with object creation mechanisms.
* Structural Patterns: They help designing large structures.
* Behavioral Patterns: They are concerned with algorithms and assigment of responsibilities.

## Criticism
Some experts claim that Design Patterns introduce innecesary complexity into your code. This is partially true, Design Patterns have developed some kind of "lazyness" in programmers because they won't look for more simple solutions before going straight to desing patterns, this is specially true on junior developers. Rememeber, there must be a "common" context for using a desing patterns and even then, we must try to look for simpler solutions before implementing a new Design Pattern that you just read.

Design Patterns are good practices, well tested solutions to common problems. They are not some magic recipe to solve all our problems. It's up to you to decide where you apply a specific pattern and how to accommodate it to your chosen language, framework and solution.

## Most common Design Patterns
We'll explore the most common and used patterns:

* Singleton
* Strategy
* Observer
* Factory
* Adapter
* Builder
* State


### Singleton
The singleton pattern is used to limit creation of a class to only one object. This is beneficial when one (and only one) object is needed to coordinate actions across the system. There are several examples of where only a single instance of a class should exist, including caches, thread pools, and registries.

It’s trivial to initiate an object of a class — but how do we ensure that only one object ever gets created? The answer is to make the constructor ‘private’ to the class we intend to define as a singleton. That way, only the members of the class can access the private constructor and no one else.

**Important consideration**: It’s possible to subclass a singleton by making the constructor protected instead of private. This might be suitable under some circumstances. One approach taken in these scenarios is to create a **register of singletons** of the subclasses and the **getInstance** method can take in a parameter or use an environment variable to return the desired singleton. The registry then maintains a mapping of string names to singleton objects, which can be accessed as needed.


### Strategy

The strategy pattern allows grouping related algorithms under an abstraction, which allows switching out one algorithm or policy for another without modifying the client. Instead of directly implementing a single algorithm, the code receives runtime instructions specifying which of the group of algorithms to run.


### Observer

This pattern is a one-to-many dependency between objects so that when one object changes state, all its dependents are notified. This is typically done by calling one of their methods.

For the sake of simplicity, think about what happens when you follow someone on Twitter. You are essentially asking Twitter to send you **(the observer)** tweet updates of the person **(the subject)** you followed. The pattern consists of two actors, the observer who is interested in the updates and the subject who generates the updates.


A subject can have many observers and is a one to many relationship. However, an observer is free to subscribe to updates from other subjects too. You can subscribe to news feed from a Facebook page, which would be the subject and whenever the page has a new post, the subscriber would see the new post.

Key consideration: In case of many subjects and few observers, if each subject stores its observers separately, it’ll increase the storage costs as some subjects will be storing the same observer multiple times.

### Factory Method

A normal factory produces goods; a software factory produces objects. And not just that — it does so without specifying the exact class of the object to be created. To accomplish this, objects are created by calling a factory method instead of calling a constructor.
Usually, object creation in Java takes place like so:

> SomeClass someClassObject = new SomeClass();

The problem with the above approach is that the code using the **SomeClass’s** object, suddenly now becomes dependent on the concrete implementation of **SomeClass**. There’s nothing wrong with using **new** to create objects but it comes with the baggage of tightly coupling our code to the concrete implementation class, which can occasionally be problematic.

### Adapter

This allows incompatible classes to work together by converting the interface of one class into another. Think of it as a sort of translator: when two heads of states who don’t speak a common language meet, usually an interpreter sits between the two and translates the conversation, thus enabling communication.

If you have two applications, with one spitting out output as XML with the other requiring JSON input, then you’ll need an adapter between the two to make them work seamlessly.

### Builder

As the name implies, a builder pattern is used to build objects. Sometimes, the objects we create can be complex, made up of several sub-objects or require an elaborate construction process. The exercise of creating complex types can be simplified by using the builder pattern. **A composite** or an **aggregate** object is what a builder generally builds.

Key consideration: The builder pattern might seem similar to the **‘abstract factory’** pattern but one difference is that the builder pattern creates an object step by step whereas the abstract factory pattern returns the object in one go.

### State

The state pattern encapsulates the various states a machine can be in, and allows an object to alter its behavior when its internal state changes. The machine or the **context**, as it is called in pattern-speak, can have actions taken on it that propel it into different states. Without the use of the pattern, the code becomes inflexible and littered with if-else conditionals.