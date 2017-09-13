CREATE TABLE "main$product_wishlist" (
	"main$productid" BIGINT NOT NULL,
	"main$wishlistid" BIGINT NOT NULL,
	PRIMARY KEY("main$productid","main$wishlistid"));
CREATE INDEX "idx_main$product_wishlist_main$wishlist_main$product" ON "main$product_wishlist" ("main$wishlistid","main$productid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('3a278249-b462-4f03-a0ca-ab4c735265c0', 
'Main.Product_Wishlist', 
'main$product_wishlist', 
'54b3dd28-0775-41af-ad99-a3e5b1016e9d', 
'43217647-6fb9-44c3-b6af-e245adcdfb42', 
'main$productid', 
'main$wishlistid', 
'idx_main$product_wishlist_main$wishlist_main$product');
CREATE TABLE "main$wishlist" (
	"id" BIGINT NOT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('43217647-6fb9-44c3-b6af-e245adcdfb42', 
'Main.Wishlist', 
'main$wishlist');
CREATE TABLE "main$customer_wishlist" (
	"main$customerid" BIGINT NOT NULL,
	"main$wishlistid" BIGINT NOT NULL,
	PRIMARY KEY("main$customerid","main$wishlistid"));
CREATE INDEX "idx_main$customer_wishlist_main$wishlist_main$customer" ON "main$customer_wishlist" ("main$wishlistid","main$customerid");
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('162ad740-e0ca-4d5d-b085-73d7ef4f8a5c', 
'Main.Customer_Wishlist', 
'main$customer_wishlist', 
'7cfaad21-55e3-41bb-8f8c-14de891f2a77', 
'43217647-6fb9-44c3-b6af-e245adcdfb42', 
'main$customerid', 
'main$wishlistid', 
'idx_main$customer_wishlist_main$wishlist_main$customer');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 11:45:17';
