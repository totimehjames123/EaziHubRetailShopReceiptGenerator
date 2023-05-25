package com.EazyHubRetailShop;

import java.util.Scanner;

public class EazyHubRetailShopCGroup10 {
    public static void createReceipt(double totalDiscount, double totalOrder, int totalNumberOfItems,
                                     double subTotalOfRefrigerator, double subTotalOfBlender, double subTotalOfRiceCooker, double subTotalOfSmartTV, double subTotalOfElectricalIron,
                                     String customerName, String customerMobileNumber,
                                     double unitPriceOfRefrigerator, double unitPriceOfBlender, double unitPriceOfRiceCooker, double unitPriceOfSmartTV, double unitPriceOfElectricalIron,
                                     int quantityOfRefrigerator, int quantityOfBlender, int quantityOfRiceCooker, int quantityOfSmartTV, int quantityOfElectricalIron,
                                     short orderDay, short orderMonth, short orderYear){

        //Creating objects for CustomerCGroup, PriceCGroup10, ItemCGroup10 and DateCGroup10
        CustomerCGroup10 customerCGroup10 = new CustomerCGroup10();
        PricesCGroup10 priceCGroup10 = new PricesCGroup10();
        ItemsCGroup10 itemsCGroup10 = new ItemsCGroup10();
        DateCGroup10 dateCGroup10 = new DateCGroup10();

        //Calling the setters for CUSTOMERS
        customerCGroup10.setCustomerName(customerName);
        customerCGroup10.setCustomerMobileNumber(customerMobileNumber);

        //Calling the setters for DATE
        dateCGroup10.setOrderDay(orderDay);
        dateCGroup10.setOrderMonth(orderMonth);
        dateCGroup10.setOrderYear(orderYear);

        //Calling the setters for PRICES
        priceCGroup10.setUnitPriceOfRefrigerator(unitPriceOfRefrigerator);
        priceCGroup10.setUnitPriceOfBlender(unitPriceOfBlender);
        priceCGroup10.setUnitPriceOfRiceCooker(unitPriceOfRiceCooker);
        priceCGroup10.setUnitPriceOfSmartTV(unitPriceOfSmartTV);
        priceCGroup10.setUnitPriceOfElectricalIron(unitPriceOfElectricalIron);

        //Calling the setters for QUANTITY
        itemsCGroup10.setQuantityOfRefrigerator(quantityOfRefrigerator);
        itemsCGroup10.setQuantityOfBlender(quantityOfBlender);
        itemsCGroup10.setQuantityOfRiceCooker(quantityOfRiceCooker);
        itemsCGroup10.setQuantityOfSmartTV(quantityOfSmartTV);
        itemsCGroup10.setQuantityOfElectricalIron(quantityOfElectricalIron);




        System.out.println("\n===============================================================");
        System.out.println("----------- // ------ EAZY HUB RETAIL SHOP ------ // ----------");
        System.out.println("===============================================================");
        System.out.println("Customer: " + customerCGroup10.getCustomerName());
        System.out.println("Mobile Phone: " + customerCGroup10.getCustomerMobileNumber());
        System.out.println("Order Date: " + dateCGroup10.getOrderDay() + "/" + dateCGroup10.getOrderMonth() + "/" + dateCGroup10.getOrderYear());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Item Type       Qty         Unit Price         Sub-Total");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("Refrigerator     %d          $%.2f             $%.2f \n", itemsCGroup10.getQuantityOfRefrigerator(), priceCGroup10.getUnitPriceOfRefrigerator(), subTotalOfRefrigerator);
        System.out.printf("Blender          %d          $%.2f             $%.2f \n", itemsCGroup10.getQuantityOfBlender(), priceCGroup10.getUnitPriceOfBlender(), subTotalOfBlender);
        System.out.printf("Rice Cooker      %d          $%.2f             $%.2f \n", itemsCGroup10.getQuantityOfRiceCooker(), priceCGroup10.getUnitPriceOfRiceCooker(),subTotalOfRiceCooker);
        System.out.printf("Smart TV         %d          $%.2f             $%.2f \n", itemsCGroup10.getQuantityOfSmartTV(), priceCGroup10.getUnitPriceOfSmartTV(), subTotalOfSmartTV);
        System.out.printf("Electrical Iron  %d          $%.2f             $%.2f \n", itemsCGroup10.getQuantityOfElectricalIron(), priceCGroup10.getUnitPriceOfElectricalIron(), subTotalOfElectricalIron);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Number of Items: " + totalNumberOfItems);
        System.out.printf("Total Order: $%.2f", totalOrder);
        System.out.printf("\t\t\tTotal Discount: $%.2f: \n", totalDiscount);
        System.out.println("===============================================================");
        System.out.println("Created by Group 10:\n" +
                "01210232D, 01212816D, 01212047D, 01213018D, 01212011D\n" +
                "01212052D, 01210295D, 01213148D, 01210299D, 01214095D\n" +
                "01213581D, 01210459D");

    }
    public static void main(String[] args) {
        String customerName, customerMobileNumber;
        double unitPriceOfRefrigerator, unitPriceOfBlender, unitPriceOfRiceCooker, unitPriceOfSmartTV, unitPriceOfElectricalIron;
        int quantityOfRefrigerator, quantityOfBlender, quantityOfRiceCooker, quantityOfSmartTV, quantityOfElectricalIron;
        double subTotalOfRefrigerator, subTotalOfBlender, subTotalOfRiceCooker, subTotalOfSmartTV, subTotalOfElectricalIron;
        short orderDay, orderMonth, orderYear;
        double totalDiscount, totalOrder;
        int  totalNumberOfItems;


        //Creating a Scanner object
        Scanner scanner = new Scanner(System.in);

        //Title...
        System.out.println("Welcome to Easy Hub Retail Shop\n");
        //CUSTOMERS

        //Taking user input for Customer Name
        System.out.print("Enter customer's name : ");
        customerName = scanner.nextLine();

        //Taking user input for Customer Mobile Number
        System.out.print("Enter customer's mobile number : ");
        customerMobileNumber = scanner.nextLine();

        //PRICE

        //Taking user input for unit Price of Refrigerator
        System.out.print("What is the price of Refrigerator: $");
        unitPriceOfRefrigerator = scanner.nextDouble();

        //Taking user input for unit Price of Blender
        System.out.print("What is the price of Blender: $");
        unitPriceOfBlender = scanner.nextDouble();

        //Taking user input for unit Price of Rice Cooker
        System.out.print("What is the price of Rice Cooker: $");
        unitPriceOfRiceCooker = scanner.nextDouble();

        //Taking user input for unit Price of Smart TV
        System.out.print("What is the price of Smart TV: $");
        unitPriceOfSmartTV = scanner.nextDouble();

        //Taking user input for unit Price of Electrical Iron
        System.out.print("What is the price of Electrical Iron: $");
        unitPriceOfElectricalIron = scanner.nextDouble();

        //QUANTITY

        //Taking user input for quantity of Refrigerators purchased
        System.out.print("How many Refrigerators were ordered: ");
        quantityOfRefrigerator = scanner.nextInt();

        //Taking user input for quantity of Blenders purchased
        System.out.print("How many Blenders were ordered: ");
        quantityOfBlender = scanner.nextInt();

        //Taking user input for quantity of Rice Cookers purchased
        System.out.print("How many Rice Cookers were ordered: ");
        quantityOfRiceCooker = scanner.nextInt();

        //Taking user input for quantity of Smart TVs purchased
        System.out.print("How many Smart TVs were ordered: ");
        quantityOfSmartTV = scanner.nextInt();

        //Taking user input for quantity of Electrical Irons purchased
        System.out.print("How many Electrical Irons were ordered: ");
        quantityOfElectricalIron = scanner.nextInt();

        //DATE
        System.out.println("\nEnter details of client's visit below");
        System.out.println("**************************************");

        //Taking user input for month items were purchased
        System.out.print("Enter Month-number : ");
        orderMonth = scanner.nextShort();

        //Taking user input for day items were purchased
        System.out.print("Enter Day-number : ");
        orderDay = scanner.nextShort();

        //Taking user input for year items were purchased
        System.out.print("Enter Year : ");
        orderYear = scanner.nextShort();

        //COMPUTE DATA; subTotal of items, totalNumberOfItems and totalOrder
        //Objects for calling methods and classes in THIS package

        PricesCGroup10 priceCGroup10 = new PricesCGroup10();
        ItemsCGroup10 itemsCGroup10 = new ItemsCGroup10();

        //QUANTITY
        itemsCGroup10.setQuantityOfRefrigerator(quantityOfRefrigerator);
        itemsCGroup10.setQuantityOfBlender(quantityOfBlender);
        itemsCGroup10.setQuantityOfRiceCooker(quantityOfRiceCooker);
        itemsCGroup10.setQuantityOfSmartTV(quantityOfSmartTV);
        itemsCGroup10.setQuantityOfElectricalIron(quantityOfElectricalIron);

        //PRICE
        priceCGroup10.setUnitPriceOfRefrigerator(unitPriceOfRefrigerator);
        priceCGroup10.setUnitPriceOfBlender(unitPriceOfBlender);
        priceCGroup10.setUnitPriceOfRiceCooker(unitPriceOfRiceCooker);
        priceCGroup10.setUnitPriceOfSmartTV(unitPriceOfSmartTV);
        priceCGroup10.setUnitPriceOfElectricalIron(unitPriceOfElectricalIron);

        //Subtotal of Items
        subTotalOfRefrigerator = priceCGroup10.getUnitPriceOfRefrigerator() * itemsCGroup10.getQuantityOfRefrigerator();
        subTotalOfBlender = priceCGroup10.getUnitPriceOfBlender() * itemsCGroup10.getQuantityOfBlender();
        subTotalOfRiceCooker = priceCGroup10.getUnitPriceOfRiceCooker() * itemsCGroup10.getQuantityOfRiceCooker();
        subTotalOfSmartTV = priceCGroup10.getUnitPriceOfSmartTV() * itemsCGroup10.getQuantityOfSmartTV();
        subTotalOfElectricalIron = priceCGroup10.getUnitPriceOfElectricalIron() * itemsCGroup10.getQuantityOfElectricalIron();

        //Total number of Items
        totalNumberOfItems = itemsCGroup10.getQuantityOfRefrigerator() +
                itemsCGroup10.getQuantityOfBlender() +
                itemsCGroup10.getQuantityOfRiceCooker() +
                itemsCGroup10.getQuantityOfSmartTV() +
                itemsCGroup10.getQuantityOfElectricalIron();


        //Total Order
        totalOrder = subTotalOfRefrigerator + subTotalOfBlender + subTotalOfRiceCooker + subTotalOfSmartTV + subTotalOfElectricalIron;

        //Total Discount
        totalDiscount = 0.25 * totalOrder;

        //Calling the createReceipt() method
        createReceipt(totalDiscount, totalOrder, totalNumberOfItems, subTotalOfRefrigerator,
                subTotalOfBlender, subTotalOfRiceCooker, subTotalOfSmartTV, subTotalOfElectricalIron,
                customerName, customerMobileNumber,
                unitPriceOfRefrigerator, unitPriceOfBlender, unitPriceOfRiceCooker, unitPriceOfSmartTV, unitPriceOfElectricalIron,
                quantityOfRefrigerator, quantityOfBlender, quantityOfRiceCooker, quantityOfSmartTV, quantityOfElectricalIron,
                orderDay, orderMonth, orderYear);
    }
}
