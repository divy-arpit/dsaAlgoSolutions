# Write your MySQL query statement below
SELECT PT.PROJECT_ID AS project_id,ROUND(SUM(EXPERIENCE_YEARS)/ COUNT(PT.EMPLOYEE_ID),2) as average_years FROM EMPLOYEE ET  JOIN PROJECT PT ON ET.EMPLOYEE_ID = PT.EMPLOYEE_ID GROUP BY PT.PROJECT_ID  ;


-- | PROJECT_ID | GROUP_CONCAT(PT.EMPLOYEE_ID) |
-- | ---------- | ---------------------------- |
-- | 1          | 1,2,3                        |
-- | 2          | 1,4                          |