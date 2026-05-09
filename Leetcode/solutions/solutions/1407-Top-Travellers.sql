# Write your MySQL query statement below
SELECT UT.NAME AS name, IFNULL(SUM(RT.`DISTANCE`),0) as travelled_distance  FROM USERS UT 
LEFT JOIN RIDES RT ON UT.ID = RT.USER_ID 
GROUP BY UT.NAME, RT.USER_ID
ORDER BY travelled_distance desc, name