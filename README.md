 Collect API - Pharmacy API

![collectapi_hd](https://user-images.githubusercontent.com/44985849/101262439-d5922180-374f-11eb-9078-7ddd2336f3b3.jpg)

You can reach the pharmacies of the day in the provinces and districts. You can get address, phone, location information.

[CollectAPI - Pharmacy API](https://collectapi.com/api/health/pharmacy-api)

## Api Key
Set your api key in Constants
``` 
public static final String API_KEY = "your_api_key";
```
From this page.

![apikey](https://user-images.githubusercontent.com/44985849/101262603-1c344b80-3751-11eb-93a3-5a191085e404.PNG)

## Using Tools & Technologies 
* Spring Boot
* Lombok 
* Java 8

## Api Routes

| Route  | HTTP Verb  |Description   |
|---|---|---|
| http://localhost:8080/v1/pharmacy/dutyPharmacyByCityAndDistrict  |`GET`  | Get Duty Pharmacy Data By City And District
| http://localhost:8080/v1/pharmacy/dutyPharmacyByCity  |`GET`  | Get Duty Pharmacy Data By City
| http://localhost:8080/v1/pharmacy/districtList |`GET`   | Get Pharmacy District List

