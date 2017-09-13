ALTER TABLE "cart$shoppingcart" RENAME TO "b5d462ce27f44915811b37a74f490981";
DROP INDEX "idx_cart$shoppingcart_session_system$session_cart$shoppingcart";
ALTER TABLE "cart$shoppingcart_session" RENAME TO "1c8946bb358140b781a62291ff4bae74";
DROP INDEX "idx_cart$shoppingcart_customer_main$customer_cart$shoppingcart";
ALTER TABLE "cart$shoppingcart_customer" RENAME TO "37d3f4a3ab854be5a039f4f6dddd1b4f";
ALTER TABLE "cart$shoppingcartline" RENAME TO "72dceb32c2dc4792a6c5bc748a20dc38";
DROP INDEX "idx_cart$shoppingcartline_shoppingcart_cart$shoppingcart_cart$shoppingcartline";
ALTER TABLE "cart$shoppingcartline_shoppingcart" RENAME TO "54db255642724debb150640b2f491091";
DROP INDEX "idx_cart$shoppingcartline_product_main$product_cart$shoppingcartline";
ALTER TABLE "cart$shoppingcartline_product" RENAME TO "d222acbb96cc40c7a99876e14b22f134";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '1bedf623-bcdf-4b79-9b96-c49c349fee8e';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '1bedf623-bcdf-4b79-9b96-c49c349fee8e';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '1bedf623-bcdf-4b79-9b96-c49c349fee8e');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '1bedf623-bcdf-4b79-9b96-c49c349fee8e';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '03efec72-7724-484e-8ab2-2a4e73388431';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'b56d9d07-67d8-4704-b85e-06ba178507f9';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = 'e65c289b-63b3-4cb4-a76c-a2a89f955de4';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = 'e65c289b-63b3-4cb4-a76c-a2a89f955de4';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = 'e65c289b-63b3-4cb4-a76c-a2a89f955de4');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = 'e65c289b-63b3-4cb4-a76c-a2a89f955de4';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '7ed8200d-4bb7-4faa-870c-0b5fdc389bd8';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'bd5f75bb-7123-47d1-a4cc-1b3da242040b';
DROP TABLE "b5d462ce27f44915811b37a74f490981";
DROP TABLE "1c8946bb358140b781a62291ff4bae74";
DROP TABLE "37d3f4a3ab854be5a039f4f6dddd1b4f";
DROP TABLE "72dceb32c2dc4792a6c5bc748a20dc38";
DROP TABLE "54db255642724debb150640b2f491091";
DROP TABLE "d222acbb96cc40c7a99876e14b22f134";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 11:00:13';
