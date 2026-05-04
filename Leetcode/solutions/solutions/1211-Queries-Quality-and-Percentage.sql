# Write your MySQL query statement below
SELECT QUERY_NAME,
ROUND(SUM(ROUND(RATINGORG/`POSITION`,4))/COUNT(QUERY_NAME),2) AS quality, 
ROUND(SUM(RATING1)/COUNT(QUERY_NAME)*100,2) AS poor_query_percentage 
FROM 
(SELECT QUERY_NAME, `POSITION`, 
CASE
WHEN RATING <3 THEN 1
ELSE 0 
END as RATING1,
RATING as RATINGORG
FROM QUERIES) T1 GROUP BY QUERY_NAME

-- SELECT QUERY_NAME, `POSITION`, 
-- CASE
-- WHEN RATING <3 THEN 1
-- ELSE 0 
-- END as RATING1,
-- RATING as RATINGORG
-- FROM QUERIES


-- | QUERY_NAME | quality | poor_query_percentage |
-- | ---------- | ------- | --------------------- |
-- | Dog        | 7.51    | 33.33                 |
-- | Cat        | 1.97    | 33.33                 |