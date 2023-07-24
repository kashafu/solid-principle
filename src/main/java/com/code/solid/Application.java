package com.code.solid;


import com.code.solid.single_responsibility.*;
import com.code.solid.dependency_inversion.*;
import com.code.solid.open_closed.*;
import com.code.solid.Liskov_substitution.*;
import com.code.solid.Interface_segregation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        // Single Responsibility principle
        BookOperations book1 = new Book("Abhi", 102);
        book1.save();

        //Open-Closed Principle
        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new InsertionSort());
        sorterManager.sort(new MergeSort());

        //Liskov Substitution Principle
        NormalVehicle vehicle = new Car();
        vehicle.speed();
        vehicle.addFuel();

        ElectricVehicle electricVehicle = new ElectricCar();
        electricVehicle.speed();
        electricVehicle.chargeBattery();

        //Interface Segregation Principle
        Tree tree = new BinaryTree();
        tree.traverse();

        IBalancedTree iBalancedTree = new BalancedTree();
        iBalancedTree.traverse();
        iBalancedTree.rotateLeft();
        iBalancedTree.rotateRight();

        //Dependency Inversion Principle
        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase()); //Runtime dependency injection
        databaseHandler.connect();
        databaseHandler.disconnect();

        databaseHandler = new DatabaseHandler(new OracleDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();
    }

}
