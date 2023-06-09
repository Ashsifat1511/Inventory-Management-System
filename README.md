# Inventory-Management-System

Problem:

Suppose you are hired by a Vinyl & CD shop to develop an Inventory Management and Billing software for them. They have categorized their products into three main segments: movies, games and music. As a startup they are also offering different discounts on their products to attract customers and may vary from product to product, and they are calling it product discount. They have a special discount named full house which is if someone buys at least two products from each category, he/she will get a discount of 50% on the total price. When billing an invoice if both of the discounts are eligible, the company wants to compare them. The discount that is larger of the two will be applied. The company wants you to keep a functionality which will show them the inventory. They also want to be able to sort their inventory according to: price and available stocks.

Music: As we have a type of product named Music, we have created a class called "Music" which is a specialized class of the StockableProduct class.

Movie: As we have a type of product named Movie, we have created a class called "Movie" which is a specialized class of the StockableProduct class.

Inventory: Because this is an inventory management and billing system, we must have a

class named Inventory. This class will basically hold the StockableProducts. In this case,

we are taking a category based management system. Here we are going to think of each

stockable product as a type / category of product. So we are going to store the stockable

products in the inventory. And when someone wants a product from the inventory, we are

going to give them an instance of the product. Learn more.

Example: Suppose, a shop has 20 Doritos. So in this case, Doritos is a product, and it has 20 instances. We can consider Doritos as a StockableProduct, and the number of items stocked is 20.

Invoice: We also have to manage billing, so for billing we have to make a list of the products the buyer wants to buy. For this purpose, we are using a class named Invoice. When building the Invoice class, we are taking an item based approach, rather than taking a categorized approach as the Inventory. So, here we will take instance of a category, as a product. Learn more.

Example: If you think of the previous example, for the Invoice class, we are going to add 1 Doritos to the invoice from the 20 the shop had.
