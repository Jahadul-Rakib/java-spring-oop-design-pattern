# Command

* We have created an interface **_Command_** which is acting as a command. 
* We have created some **Hardware** class where work command. 
* We have concrete **command** package classes implementing **_Command_** interface
which will do actual command processing. 
* A Broker class **CommandReceiver** is created which acts as an invoker object. It can take and place orders. 
* Broker object uses command pattern to identify which object will execute which command based on the type of command.