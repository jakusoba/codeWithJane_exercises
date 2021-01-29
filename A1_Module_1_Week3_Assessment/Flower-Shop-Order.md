# Flower Shop Order

Valentines Day is coming up and you have been tasked to Create a simple program to calculate order/delivery totals. Please follow each step in the order given. At the end of one hour, we will prompt you to check your code into your bitbucket repository. Please DO NOT modify this code after checking it in. We recommend that you do an occasional check-in as you complete a significant amount of work.


1. Create a new class that represents a single *Flower Shop Order*. Each order represents a single bouquet of roses that was purchased. 

2. Add a *bouquet type*, *number of roses*, and *subtotal* attribute/property to the Flower Shop Order class:
    * `bouquet type`: indicates the type of bouquet.
    * `number of roses`: indicates the number of roses added to the bouquet.
    * `subtotal`: indicates the order subtotal before shipping by adding $19.99 for the standard bouquet, plus $2.99 for each rose.

3. Create a constructor that accepts `bouquet type` and `number of roses`. There should not be any   setters for `bouquet type`, `number of roses` or `subtotal`. `subtotal` should be derived using the info described above in step 2.

4. Create a new class that acts as the main program. Use it to instantiate at least one instance of the *Flower Shop Order* in it's `main()`.  You will use this class later to further manually test your code. For `bouquet type`, you can just pass in the value of `standard`. (In later versions we may want other 'bouquet types' like `premium`, `ultra pack` for the `steve done messed up and need to ask for forgiveness` occasions). You do not need to test with these other types right now.

5. Create a method in your *Flower Shop Order* class that calculates ONLY the delivery total using input parameters of a `boolean` for `sameDayDelivery` and a `String` for `zipCode`:
    * The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
    * The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
    * The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999. 
    * All other zip codes cost $19.99 (same-day delivery is not an option).


6. Override the `toString()` method in your *Flower Shop Order* class and have it RETURN `"ORDER - {bouquet type} - {number of roses} roses - {subtotal}"` where `{bouquet type}`, `{number of roses}`, and `{subtotal}` are placeholders for the actual values. The values from the object should be shown in the string where `{variable-name}` is indicated.


7. In the main program class, write code to run and execute your class using a few different input options when creating the order objects.  Print out to the console, each order's data using the `toString` method and the method built in step 5 that calculates delivery total.

8. Implement a JUnit to validate the functionality of:
    * The delivery fee calculation (Be sure to test enough variations to feel confident your code works)
  

9. In the main program class, modify your `main()` method to add orders to a list or array. Refactor your code to pass the list/array to a private method to loop through and print out the order information as described in earlier steps.

10. Modify your main program to prompt the user to enter order information instead of hard-coding the values in your `main()` method.