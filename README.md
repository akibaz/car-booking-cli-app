# car-booking-cli-app 🚗

## Description
App for booking cars in car rental company. Admin can book cars for users, view bookings and available cars.


## App structure
App is written in java language, version 17. Structured in packages which contain POJOs with appropriate service and DAO classes.


## App walktrough

### Main menu

When you run app, you are presented with this main menu:

![Screenshot from 2023-03-19 14-22-09](https://user-images.githubusercontent.com/47009156/226178113-4b61b901-6104-4550-9a51-35eac269f7cc.png)

If you enter number out of range you are presented with message and main menu to try again.

![Screenshot from 2023-03-19 14-30-49](https://user-images.githubusercontent.com/47009156/226178432-afcb350f-fcf9-45ff-a1bb-d94af9d6c13a.png)

If you enter some string, you are presented with message and main menu to try again.

![Screenshot from 2023-03-19 14-32-36](https://user-images.githubusercontent.com/47009156/226178506-59c6c2ea-414a-4b0e-b33e-ab0be9ecb3bd.png)


### 6 - View All Users

When you insert 6 you get all users and return back to main menu.

![image](https://user-images.githubusercontent.com/47009156/226186528-f2160ef6-d83d-44b7-ae66-5e1da4b014c8.png)

Users have unique id and name.


### 5 - View Available Electric Cars

When you insert 5 you get all available electric cars printed and return back to main menu.

![image](https://user-images.githubusercontent.com/47009156/226186616-838dc569-3b96-4af7-aecb-154308b9d63c.png)

Cars have regNumber, rentalPricePerDay, brand, isElectric and isAvailable fields. Note that isAvailable field is not printed here.
If there are no electric cars available, you get this message and return to main menu.

![image](https://user-images.githubusercontent.com/47009156/226179054-975f3c79-ce4c-4a3c-813f-a4b2802c37de.png)


### 4 - View Available Cars

When you insert 4 you get all available cars printed and return back to main menu.

![image](https://user-images.githubusercontent.com/47009156/226187142-4968ae39-e473-4592-add0-62c14478b9ad.png)

If there are no cars available, you get this message and return to main menu.

![image](https://user-images.githubusercontent.com/47009156/226187264-99b297e2-79d0-4733-bad5-7dbb6f843b46.png)


### 3 - View All Bookings

When you insert 3 you get all car bookings printed and return back to main menu.

![image](https://user-images.githubusercontent.com/47009156/226187422-749eb6e2-b8a3-4052-b17d-e0e7e9e22852.png)

If there are no car bookings, you get this message and return to main menu.

![image](https://user-images.githubusercontent.com/47009156/226187484-0e1d09d9-28c4-45f5-8c74-59c55b5ffefd.png)


### 2 - View All User Booked Cars

When you insert 2 you get all users printed and message to choose user id for which you want to check bookings or if you want to return to main menu, insert `/exit`.

![image](https://user-images.githubusercontent.com/47009156/226187652-2ca0cca4-9198-4bdc-af09-19d827cf981e.png)

If you enter invalid user id, you get this message.

![image](https://user-images.githubusercontent.com/47009156/226187878-d5450c66-da58-4eae-9f14-e6ddcad907dd.png)

When you enter correct user id you get users bookings, if available.

![image](https://user-images.githubusercontent.com/47009156/226189294-2960275d-728d-4515-93ad-c28f8f09731b.png)

And this message if no bookings are available for that particular user. Than you are returned to main menu.

![image](https://user-images.githubusercontent.com/47009156/226188070-ca49591b-6175-4999-9ff0-3142a9f057b3.png)


### 1 - Book Car

When you insert 1 you get all users printed and message to choose user id for which you want to book a car.

![image](https://user-images.githubusercontent.com/47009156/226188191-2f359fee-be4c-467d-9117-c43910cb529d.png)

If you enter correct user id you get the available cars printed, and message to enter car reg number in order to particular car get booked.

![image](https://user-images.githubusercontent.com/47009156/226188283-46225b43-6a2a-4c4c-b3ee-854ae1454bb5.png)

Than you enter car reg number and get message that book was successful, if car reg numebr is correct, and return to main menu.

![image](https://user-images.githubusercontent.com/47009156/226188440-37f94950-6bca-42d4-aa87-75352259fa68.png)

Than you can validate your booking by viewing all bookings, view all user booked cars, view available cars and view available electric cars (if the car that was booked is electric car).

If you enter incorrect user id you get this message.

![image](https://user-images.githubusercontent.com/47009156/226188868-4afac91d-5ea3-43f6-9a75-e792244a29b5.png)

And if you enter incorrect cars reg number you get this.

![image](https://user-images.githubusercontent.com/47009156/226188921-2ca5da6e-cac9-4a83-afbf-5f5ff04881fa.png)

If there are no available cars for booking, upon entering 1 to book a car, you will get this message and return to main menu.

![image](https://user-images.githubusercontent.com/47009156/226189047-d0034319-2e70-4c72-9c3e-32bc9c3205d1.png)


## Last words

Thats all folks. 😜
