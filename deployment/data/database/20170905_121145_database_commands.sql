DROP INDEX "idx_main$product_wishlist_main$wishlist_main$product";
ALTER TABLE "main$product_wishlist" RENAME TO "142fac22543542cbbfa79ab58eb860f7";
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '3a278249-b462-4f03-a0ca-ab4c735265c0';
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
 VALUES ('19aa7c5b-6b86-4097-8066-049f1285db4a', 
'Main.Product_Wishlist', 
'main$product_wishlist', 
'54b3dd28-0775-41af-ad99-a3e5b1016e9d', 
'43217647-6fb9-44c3-b6af-e245adcdfb42', 
'main$productid', 
'main$wishlistid', 
'idx_main$product_wishlist_main$wishlist_main$product');
DROP TABLE "142fac22543542cbbfa79ab58eb860f7";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 12:11:40';
