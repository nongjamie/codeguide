#codeguide

##Programming for interface Priciple

We declare a variable that has a behavior declared in the interface.<br>Declare variable of type of interface gives us more flexibility.If later we decide to switch to a different implementation of that interface.<br>We won't need to change the type of the variable.
  ```java
ArrayList<Customer> customers = new ArrayList<Customer>();
  ```
While this code is correct,  there a better way of declaring the variable customers:
  ```java
List<Customer> customers = new ArrayList<Customer>();
  ```
From this example If later we decide to switch to a different implementation of the List (e.g. LinkedList instead of ArrayList ) we won’t need to change the type of the variable customers.

Exercise [Click here](https://github.com/nongjamie/codeguide/blob/master/src/Exercise1.java)
