CREATE TABLE "cart$shoppingcartline" (
	"id" BIGINT NOT NULL,
	"linevalue" DECIMAL(28, 8) NULL,
	"quanity" INT NULL,
	"sellingprice" DECIMAL(28, 8) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'Cart.ShoppingCartLine', 
'cart$shoppingcartline');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('170a77b7-45a4-49ae-b7cf-bbcf41c7843e', 
'e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'LineValue', 
'linevalue', 
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
 VALUES ('e99c4812-b7fd-4609-8c7e-b0a6cf56c130', 
'e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'Quanity', 
'quanity', 
3, 
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
 VALUES ('5d37a5ec-89a7-45ce-93a8-46eb9d570811', 
'e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'SellingPrice', 
'sellingprice', 
5, 
0, 
'0', 
false);
CREATE TABLE "cart$shoppingcartline_product" (
	"cart$shoppingcartlineid" BIGINT NOT NULL,
	"main$productid" BIGINT NOT NULL,
	PRIMARY KEY("cart$shoppingcartlineid","main$productid"));
CREATE INDEX "idx_cart$shoppingcartline_product_main$product_cart$shoppingcartline" ON "cart$shoppingcartline_product" ("main$productid","cart$shoppingcartlineid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('bd5f75bb-7123-47d1-a4cc-1b3da242040b', 
'Cart.ShoppingCartLine_Product', 
'cart$shoppingcartline_product', 
'e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'54b3dd28-0775-41af-ad99-a3e5b1016e9d', 
'cart$shoppingcartlineid', 
'main$productid', 
'idx_cart$shoppingcartline_product_main$product_cart$shoppingcartline');
CREATE TABLE "cart$shoppingcartline_shoppingcart" (
	"cart$shoppingcartlineid" BIGINT NOT NULL,
	"cart$shoppingcartid" BIGINT NOT NULL,
	PRIMARY KEY("cart$shoppingcartlineid","cart$shoppingcartid"));
CREATE INDEX "idx_cart$shoppingcartline_shoppingcart_cart$shoppingcart_cart$shoppingcartline" ON "cart$shoppingcartline_shoppingcart" ("cart$shoppingcartid","cart$shoppingcartlineid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('7ed8200d-4bb7-4faa-870c-0b5fdc389bd8', 
'Cart.ShoppingCartLine_ShoppingCart', 
'cart$shoppingcartline_shoppingcart', 
'e65c289b-63b3-4cb4-a76c-a2a89f955de4', 
'1bedf623-bcdf-4b79-9b96-c49c349fee8e', 
'cart$shoppingcartlineid', 
'cart$shoppingcartid', 
'idx_cart$shoppingcartline_shoppingcart_cart$shoppingcart_cart$shoppingcartline');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 10:59:04';
