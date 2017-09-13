ALTER TABLE "main$wishlist" DROP COLUMN "wishitem";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '7dc20e98-d923-4757-bf18-f9cdac88c19f';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20170905 12:15:43';
