-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor(first_name, last_name)

VALUES('Lisa', 'Byway');
COMMIT;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film
        (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008,
        1 ,198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor
        (film_id, actor_id)
VALUES( (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        , (SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue') )
        ,( (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        , (SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway') );

-- 4. Add Mathmagical to the category table.
INSERT INTO category
  (name)               --(category_id, name) dont need this because data type is serial
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

UPDATE film_category     
SET  category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
WHERE film_id IN (SELECT film_id FROM film 
                  WHERE title IN ('Euclidean PI', 'EGG IGBY','KARATE MOON','RANDOM GO','YOUNG LANGUAGE')
                  );

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film
  SET rating = 'G'
WHERE film_id IN (SELECT fc.film_id 
       FROM category c 
       JOIN film_category fc 
       ON c.category_id = fc.category_id
       JOIN film f
       ON fc.film_id = f.film_id
       WHERE c.name LIKE 'Mathmagical');

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory
        (store_id,film_id)
SELECT store_id, (SELECT film_id FROM film WHERE title = 'Euclidean PI')
        FROM store
        ;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- Will not delete because it violates the foreign key constraint fime_actor_film_id_fkey as it is refrenced  in film_actor table.

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- Will not delete because it violates the foreign key constraint fime_category_category_id_fkey as it is refrenced  in film_category table.

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film_category
WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical')
;
COMMIT;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Euclidean PI'
;
COMMIT;
-- it succeeded because it is no longer key constrained by the film_category foreign key.

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
SELECT *
FROM information_schema.referential_constraints
WHERE constraint_name LIKE '%film_id%'
;

-- We need to get rid of constraints refrencing the film id on the film_actor, film category and inventory tables.

