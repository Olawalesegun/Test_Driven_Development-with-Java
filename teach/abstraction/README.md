-->Abstraction refers to hiding the implmentation from the user.

-->Abstraction can be achieved using abstract keyword and interface.

-->abstract keyword can be used for a method.(abstract method)

-->abstract methods are such methods which has only method signature and no body(without implementation).

-->If we have one method in a class as abstract then we must declare class also abstract.

-->An abstract class can have all methods as abstract.

-->An abstract class can have both abstract methods and concreate methods(methods with body)

-->An abstract class can have all methods concreate.

-->An abstract class cannot be instantiated(We cannot create an Object of abstract class)

-->If a class is extendings (Inheriting from) abstract class then we must implement all abstract m,ethods in our class or declare the class as abstract.

-->We can declare the class as abstract, we can declare the method as abstract however we cannot have variable as abstract.

-->An abstract class can have a Constructor. This Constructor would be invovked using super() call present in the child class Constructor.

-->Constructor cannot be abstract bcz in every constructor we have either super() or this().


final keyword...

final keyword can  be applied to a class.

final class would not participate in inheritance(We cannot extend final class).

final keyword can be applied to a method.

final method do get inherited in child/sub class.However we cannot override them.(final methods cannot be overrridien in child class)

final keyword can be applied to a variable.

final variables behaves like a constant. In other words we cannot change the value of final/constant variables.

We cannot make abstract class as final.(bcz no one can inherit abstract class and provide the implementation hence it's illegal to use abstract and final)

We cannot make abstract method as final.(bcz if abstract method is final none of the child class can provide implementation)



































