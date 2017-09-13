CREATE TABLE "cart$shoppingcart" (
	"id" BIGINT NOT NULL,
	"totalcost" DECIMAL(28, 8) NULL,
	"checkoutnotes" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'Cart.ShoppingCart', 
'cart$shoppingcart');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('4929e9ff-80b5-4b19-9ae9-24557126418a', 
'1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'TotalCost', 
'totalcost', 
5, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ae31bcd6-6a4b-4c6f-8051-5a28393246c9', 
'1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'CheckOutNotes', 
'checkoutnotes', 
30, 
200, 
'', 
false);
CREATE TABLE "cart$shoppingcart_customer" (
	"cart$shoppingcartid" BIGINT NOT NULL,
	"main$customerid" BIGINT NOT NULL,
	PRIMARY KEY("cart$shoppingcartid","main$customerid"));
CREATE INDEX "idx_cart$shoppingcart_customer_main$customer_cart$shoppingcart" ON "cart$shoppingcart_customer" ("main$customerid","cart$shoppingcartid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('b56d9d07-67d8-4704-b85e-06ba178507f9', 
'Cart.ShoppingCart_Customer', 
'cart$shoppingcart_customer', 
'1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'7cfaad21-55e3-41bb-8f8c-14de891f2a77', 
'cart$shoppingcartid', 
'main$customerid', 
'idx_cart$shoppingcart_customer_main$customer_cart$shoppingcart');
CREATE TABLE "cart$shoppingcart_session" (
	"cart$shoppingcartid" BIGINT NOT NULL,
	"system$sessionid" BIGINT NOT NULL,
	PRIMARY KEY("cart$shoppingcartid","system$sessionid"));
CREATE INDEX "idx_cart$shoppingcart_session_system$session_cart$shoppingcart" ON "cart$shoppingcart_session" ("system$sessionid","cart$shoppingcartid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('03efec72-7724-484e-8ab2-2a4e73388431', 
'Cart.ShoppingCart_Session', 
'cart$shoppingcart_session', 
'1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'37f9fd49-5318-4c63-9a51-f761779b202f', 
'cart$shoppingcartid', 
'system$sessionid', 
'idx_cart$shoppingcart_session_system$session_cart$shoppingcart');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 10:56:32';
