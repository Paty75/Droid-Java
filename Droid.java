 /* Build A Droid
We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and what they’ll do.

Can we write a Java class to help?

We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!

Tasks
13/13 complete
Mark the tasks as complete by checking them off
Defining a Droid
1.
The Droid.java file is empty.

Start by defining the class Droid.

Don’t forget to include a main() method! You can leave it empty for now.

We want a Droid object that has the following state:

name
battery level
and the following behavior:

performing a task
stating its battery level
2.
Declare an instance field called batteryLevel. We want to store whole number values in this field.

3.
Declare another instance field called name which will store our droid’s name.

What type should this be?

4.
Create a constructor method for the Droid class.

The method should have one parameter of String droidName.

5.
Inside the constructor, assign the parameter value of droidName to the appropriate instance field.

Set the value of batteryLevel to 100. Every new instance of Droid will have a batteryLevel of 100.

Declaring Instances of Drone
6.
Inside main(), create a new instance of Droid named "Codey".

7.
Print out the variable using System.out.println().

8.
That output isn’t very informative!

Define a toString() method within Droid.

The return type is String.

Inside toString(), return a string that introduces the Droid using their name.

Something like “Hello, I’m the droid: droidNameHere”

Doing Droid Things
9.
Define a new method: performTask(). This method should have a single parameter: String task.

This method does not return any value.

10.
Inside performTask(), print a statement like “name is performing task: task“.

For example, codey.performTask("dancing"); will print:

Codey is performing task: dancing

11.
Performing tasks is hard work. After the print statement, set batteryLevel to be 10 less than it was before.

We’ll need to reassign the instance field to be the current value minus 10.

12.
Have your Droid instance perform some tasks inside of main().

Next steps
13.
Create new instances and play around with methods. Here are some ideas to get you started:

Create a energyReport() method that prints the instance’s batteryLevel.

Create another instance.

Create a method energyTransfer() that exchanges batteryLevel between instances.
*
*
* */public class Droid {
    String name;
    int batteryLevel;
    int destinationBatteryLevel;


    public String toString() {
        return ("Hello, I‘m the droid " + name + ".");
    }

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
        destinationBatteryLevel = 0;

    }


    public void performTask(String task) {
        batteryLevel = batteryLevel - 10;
        System.out.println(name + "is performing task: " + task + ".");

    }


    public void energyReport() {
        System.out.println("The level of battery is: " + batteryLevel);

    }
    public void initialBatteryOfJoey() {
        System.out.println(name + " has " + destinationBatteryLevel + "% initial battery.");

    }


    public void displayBatteryLevel() {
        System.out.println(name + " has " + batteryLevel + "% battery remaining.");

    }

   /* public static void energyTransfer(Droid source, Droid destination) {
        destination.batteryLevel = 0;
        int transferAmount = source.batteryLevel;
        for (int i = 0; i < transferAmount; i++) {
            if (source.batteryLevel > 0) {
                source.batteryLevel--;
                destination.batteryLevel++;
            }
        }
        System.out.println("Energy transferred from " + source.name + " to " + destination.name);
    } */

    public static void energyTransfer(Droid source, Droid destination) {
        if (source.batteryLevel > 0) {
            destination.batteryLevel = source.batteryLevel;
            source.batteryLevel = 0;
            System.out.println("Energy transferred from " + source.name + " to " + destination.name + ".");
        } else {
            System.out.println(source.name + " has no energy to transfer.");
        }
    }



        public static void main(String[] args) {
            Droid codey = new Droid("Codey");
            Droid joey = new Droid("Joey");
           // Droid codey = new Droid("Codey", 70);
            //Droid joey = new Droid("Joey", 00);
            System.out.println(codey);
            codey.energyReport();
            codey.performTask("singing");
            codey.energyReport();
            codey.performTask("pick up bricks");
            codey.energyReport();
            codey.performTask("dancing");
            codey.energyReport();
            codey.displayBatteryLevel();
            System.out.println(joey);
            codey.displayBatteryLevel();
            joey.initialBatteryOfJoey();
            energyTransfer(codey, joey);
            codey.displayBatteryLevel();
            joey.displayBatteryLevel();


        }
    }


