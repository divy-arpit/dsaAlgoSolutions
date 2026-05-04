# Write your MySQL query statement below



SELECT PT.PRODUCT_ID AS product_id,
ROUND(IFNULL(SUM(PT.PRICE*UT.UNITS)/SUM(UT.UNITS),0),2) AS average_price
FROM PRICES PT LEFT JOIN UNITSSOLD UT 
ON PT.PRODUCT_ID = UT.PRODUCT_ID 
AND UT.PURCHASE_DATE >= PT.START_DATE 
AND UT.PURCHASE_DATE <= PT.END_DATE 
GROUP BY PT.PRODUCT_ID 

-- | product_id | average_price | SUM(UT.UNITS) |
-- | ---------- | ------------- | ------------- |
-- | 1          | 800           | 115           |
-- | 2          | 3900          | 230           |


