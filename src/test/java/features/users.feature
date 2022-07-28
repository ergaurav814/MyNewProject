Feature: Print Hello World

Scenario: Print hello world on console

* print 'hello world'
* print 'hello hello world'


Scenario: Print and calculate variables    

* def balance = 200
* def fee = 20
* def tax = 30

* print 'Toatal is ->' + ( balance + fee + tax)


Scenario: Json reader parser 
* def JsonObject =
"""
[
{
   "Name" : "Gauarv",
   "City" : "Hoshiarpur",
    "Age" :  29
},

{
   "Name" : "Guri",
   "City" : "Jalandhar",
   "Age"  : 29
},
]
"""
* print JsonObject

* print JsonObject[0].Name + " " + JsonObject[0].City

Scenario: Complex jason Parsor

* def JsonObject =

"""
{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}}


"""
* print JsonObject
* print JsonObject.menu.id
* print JsonObject.menu.popup.menuitem[0]
* print JsonObject.menu.popup.menuitem[0].value +"  "+ JsonObject.menu.popup.menuitem[0].onclick




