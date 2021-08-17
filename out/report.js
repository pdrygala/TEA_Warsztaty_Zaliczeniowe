$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("add-address.feature");
formatter.feature({
  "line": 1,
  "name": "User add new address",
  "description": "",
  "id": "user-add-new-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User can add new address",
  "description": "",
  "id": "user-add-new-address;user-can-add-new-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in https://prod-kurs.coderslab.pl on User Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User goes to create new address link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User input information \u003calias\u003e, \u003caddress\u003e, \u003ccity\u003e, \u003cpostcode\u003e, \u003ccountry\u003e and \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User sees \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User check address information \u003calias\u003e, \u003caddress\u003e, \u003ccity\u003e, \u003cpostcode\u003e, \u003ccountry\u003e and \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close shop page",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "user-add-new-address;user-can-add-new-address;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postcode",
        "country",
        "phone"
      ],
      "line": 14,
      "id": "user-add-new-address;user-can-add-new-address;;1"
    },
    {
      "cells": [
        "Main Address",
        "ul.Orzeszkowa 9",
        "Pcim",
        "32-432",
        "United Kingdom",
        "566456654"
      ],
      "line": 15,
      "id": "user-add-new-address;user-can-add-new-address;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "User can add new address",
  "description": "",
  "id": "user-add-new-address;user-can-add-new-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in https://prod-kurs.coderslab.pl on User Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User goes to create new address link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User input information Main Address, ul.Orzeszkowa 9, Pcim, 32-432, United Kingdom and 566456654",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User sees \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User check address information Main Address, ul.Orzeszkowa 9, Pcim, 32-432, United Kingdom and 566456654",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Close shop page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://prod-kurs.coderslab.pl",
      "offset": 18
    }
  ],
  "location": "AddAddressSteps.UserIsLoggedIn(String)"
});
formatter.result({
  "duration": 4594309000,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToAddressPage()"
});
formatter.result({
  "duration": 183957000,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userGoesToCreateNewAddress()"
});
formatter.result({
  "duration": 202284700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Address",
      "offset": 23
    },
    {
      "val": "ul.Orzeszkowa 9",
      "offset": 37
    },
    {
      "val": "Pcim",
      "offset": 54
    },
    {
      "val": "32-432",
      "offset": 60
    },
    {
      "val": "United Kingdom",
      "offset": 68
    },
    {
      "val": "566456654",
      "offset": 87
    }
  ],
  "location": "AddAddressSteps.userInputInformation(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 355763700,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.userSavesInformation()"
});
formatter.result({
  "duration": 257989200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 11
    }
  ],
  "location": "AddAddressSteps.userSees(String)"
});
formatter.result({
  "duration": 22020100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Address",
      "offset": 31
    },
    {
      "val": "ul.Orzeszkowa 9",
      "offset": 45
    },
    {
      "val": "Pcim",
      "offset": 62
    },
    {
      "val": "32-432",
      "offset": 68
    },
    {
      "val": "United Kingdom",
      "offset": 76
    },
    {
      "val": "566456654",
      "offset": 95
    }
  ],
  "location": "AddAddressSteps.userCheckAddressInformation(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 37458501,
  "status": "passed"
});
formatter.match({
  "location": "AddAddressSteps.closeShopPage()"
});
formatter.result({
  "duration": 641134601,
  "status": "passed"
});
formatter.uri("delete-address.feature");
formatter.feature({
  "line": 1,
  "name": "User delete address",
  "description": "",
  "id": "user-delete-address",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can delete address from its account",
  "description": "",
  "id": "user-delete-address;user-can-delete-address-from-its-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is logged to https://prod-kurs.coderslab.pl on UserPage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to Addresses Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User delete address with alias \"Main Address\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User sees alert \"Address successfully deleted!\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://prod-kurs.coderslab.pl",
      "offset": 18
    }
  ],
  "location": "DeleteAddressSteps.UserIsLoggedIn(String)"
});
formatter.result({
  "duration": 2481620600,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAddressSteps.userGoesToAddressesPage()"
});
formatter.result({
  "duration": 186420200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Main Address",
      "offset": 32
    }
  ],
  "location": "DeleteAddressSteps.userDeleteAddress(String)"
});
formatter.result({
  "duration": 246241499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully deleted!",
      "offset": 17
    }
  ],
  "location": "DeleteAddressSteps.userSeesAlert(String)"
});
formatter.result({
  "duration": 20215499,
  "status": "passed"
});
formatter.match({
  "location": "DeleteAddressSteps.closePage()"
});
formatter.result({
  "duration": 616381800,
  "status": "passed"
});
formatter.uri("make-order.feature");
formatter.feature({
  "line": 1,
  "name": "User can order  item from shop",
  "description": "",
  "id": "user-can-order--item-from-shop",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User make order in online shop.",
  "description": "",
  "id": "user-can-order--item-from-shop;user-make-order-in-online-shop.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to https://prod-kurs.coderslab.pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on item \u003citem\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User check discount equals 20%",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User choose size as \u003csize\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User choose quantity as \u003cquantity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add item do cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User goes to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User confirm address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User choose shipping method as Pick up in-store",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User choose payment method as Pay by Check",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on button Order with an obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User makes screenshot with order and price",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "user-can-order--item-from-shop;user-make-order-in-online-shop.;",
  "rows": [
    {
      "cells": [
        "item",
        "size",
        "quantity"
      ],
      "line": 19,
      "id": "user-can-order--item-from-shop;user-make-order-in-online-shop.;;1"
    },
    {
      "cells": [
        "Hummingbird printed sweater",
        "M",
        "5"
      ],
      "line": 20,
      "id": "user-can-order--item-from-shop;user-make-order-in-online-shop.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "User make order in online shop.",
  "description": "",
  "id": "user-can-order--item-from-shop;user-make-order-in-online-shop.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to https://prod-kurs.coderslab.pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on item Hummingbird printed sweater",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User check discount equals 20%",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User choose size as M",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User choose quantity as 5",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add item do cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User goes to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User confirm address",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User choose shipping method as Pick up in-store",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User choose payment method as Pay by Check",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on button Order with an obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User makes screenshot with order and price",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://prod-kurs.coderslab.pl",
      "offset": 21
    }
  ],
  "location": "MakeOrderSteps.UserIsLoggedIn(String)"
});
formatter.result({
  "duration": 2669148000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hummingbird printed sweater",
      "offset": 19
    }
  ],
  "location": "MakeOrderSteps.userClickOnItem(String)"
});
formatter.result({
  "duration": 270880200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 27
    }
  ],
  "location": "MakeOrderSteps.userCheckDiscountEquals(int)"
});
formatter.result({
  "duration": 43701700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 20
    }
  ],
  "location": "MakeOrderSteps.userChooseSize(String)"
});
formatter.result({
  "duration": 105547900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "MakeOrderSteps.userChooseQuantityAsQuantity(int)"
});
formatter.result({
  "duration": 663725700,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.addItemDoCart()"
});
formatter.result({
  "duration": 36139200,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userGoesToCheckout()"
});
formatter.result({
  "duration": 1092380000,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userConfirmAddress()"
});
formatter.result({
  "duration": 431847800,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userChooseShippingMethodAsPickUpInStore()"
});
formatter.result({
  "duration": 453638000,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userChoosePaymentMethodAsPayByCheck()"
});
formatter.result({
  "duration": 54632299,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userClickOnButtonToFinishOrder()"
});
formatter.result({
  "duration": 519619100,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.userMakesScreenshotWithOrderAndPrice()"
});
formatter.result({
  "duration": 205004101,
  "status": "passed"
});
formatter.match({
  "location": "MakeOrderSteps.closeBrowser()"
});
formatter.result({
  "duration": 642201799,
  "status": "passed"
});
});