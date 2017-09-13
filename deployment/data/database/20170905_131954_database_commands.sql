ALTER TABLE "main$wishlist" ADD "wishname" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('40a8bc6f-9b96-4ece-9918-3d75570509f2', 
'43217647-6fb9-44c3-b6af-e245adcdfb42', 
'WishName', 
'wishname', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 13:19:51';
