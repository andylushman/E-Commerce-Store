ALTER TABLE "main$wishlist" ADD "wishitem" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7dc20e98-d923-4757-bf18-f9cdac88c19f', 
'43217647-6fb9-44c3-b6af-e245adcdfb42', 
'WishItem', 
'wishitem', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 12:13:25';
