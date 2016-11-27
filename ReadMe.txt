Import the project into eclipse and run the ProcessSalesOrder.java class.

The solution was modelled in the following way

Shooping basket - which stores the purchased items
Orders - only one instance should be created per customer, so this class is based on a singleton pattern.
Sales Tax Calculator - that performs tax calculations
Items - the creation of the items/goods is based on an Abstract Factory design pattern. As per the definition of this pattern; it provides an interface for creating families of related or dependent objects without specifying their concrete classes. this is illustrated in the SalesApplication_Items_Design.jpeg class diagram.