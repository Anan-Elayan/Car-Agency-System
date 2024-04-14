# Car Agency Management System

# Project Overview
This project entails the implementation of a car agency management system.
The system facilitates the management of various car brands and models, processing customer orders, and maintaining an inventory of sold cars.

## Cars Data Structure
The car agency's inventory is organized using a data structure comprising a doubly linked list,
with each node representing a car brand and containing a single linked list of available cars sorted by year.

# Main Features
1. Reading and Saving Data
- Read car data from a file (cars.txt), populate the car data structure, and provide an option to save back to the cars file in the same format.
- Read customer orders from a file (orders.txt), fill them into a stack (finished orders) and a queue (in-process orders), and offer an option to save back to the orders file.

2. Car Management
- Add, delete, update, and search for a car brand within the doubly linked list.
- Add, delete, update, and search for a car within a brand within the single linked list.

3. Customer Order Processing
- Customers can navigate car brands and available cars within a brand, place an order into the order queue, which includes car and customer information.
- Use filters to limit the car results by year, color, model, or price.
- Admin can process customers' orders queue and move finished orders to the finished orders stack.
- Remove sold cars from the car data structure.
- If a car is no longer available, the admin can remove it from the front of the queue and re-add it to the end of the queue or cancel the order completely.

4. Reporting
Provide an option to report the last 10 sold cars.


Detailed Operations
- The system offers a comprehensive set of operations for managing cars, processing customer orders, and generating reports.
- Operations include CRUD operations for both car brands and individual cars, order processing, and reporting functionalities.


# ScreenShots

![Photo 1 ](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/14a20653-875d-44b9-8814-7a9676606d4b)

![Photo 2](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/889c67ad-f1d5-494f-9e57-95d24ae13a25)

![Photo 3](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/5bc0a8d5-2e09-4cee-be16-5c48ed1389d6)

![Photo 4](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/b9c3f2b0-d462-4cc2-9545-c3cf62a46875)

![Photo 5](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/387a9710-a55d-4c30-bc43-55d8a8b8b6f6)

![Photo 6](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/aee00e91-00aa-49bf-aaaa-ae71d7bb46ad)

![Photo 7](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/331c9066-d0d0-40c5-9bc6-614194521c3e)

![Photo 8](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/ebaf20a6-c249-4be1-9832-e3050106aab7)

![Photo 9](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/795a40b6-60c7-47c2-8772-637be33c0e66)

![Photo 10](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/557365c3-aa87-4408-b10c-96abcdc98767)

![Photo 11](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/c1c845da-e03b-4b97-97ce-96902ef065b7)

![Photo 12](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/1178a66e-10eb-485c-82ae-0da3516f7224)

![Photo 13](https://github.com/Anan-Elayan/Car-Agency-System/assets/99610614/e2bca9e1-6fd8-4473-9240-68d79f8c6ef6)


