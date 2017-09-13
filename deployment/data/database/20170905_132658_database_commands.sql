DROP INDEX "idx_main$customer_wishlist_main$wishlist_main$customer";
ALTER TABLE "main$customer_wishlist" RENAME TO "307c1f0c9ba547209965b5751cf9e5e7";
DROP INDEX "idx_main$product_wishlist_main$wishlist_main$product";
ALTER TABLE "main$product_wishlist" RENAME TO "f9ef7dcd9d0b42bd918e3aee98f4cc24";
ALTER TABLE "main$wishlist" RENAME TO "ad637feea33843e2aa3c44602be17945";
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '162ad740-e0ca-4d5d-b085-73d7ef4f8a5c';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '19aa7c5b-6b86-4097-8066-049f1285db4a';
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '43217647-6fb9-44c3-b6af-e245adcdfb42';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '43217647-6fb9-44c3-b6af-e245adcdfb42';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '43217647-6fb9-44c3-b6af-e245adcdfb42');
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '43217647-6fb9-44c3-b6af-e245adcdfb42';
DROP TABLE "307c1f0c9ba547209965b5751cf9e5e7";
DROP TABLE "f9ef7dcd9d0b42bd918e3aee98f4cc24";
DROP TABLE "ad637feea33843e2aa3c44602be17945";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 13:26:57';
