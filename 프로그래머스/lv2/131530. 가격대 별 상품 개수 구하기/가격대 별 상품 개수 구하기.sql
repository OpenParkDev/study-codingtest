-- 코드를 입력하세요
WITH TEMP AS (
    SELECT PRODUCT_ID, TRUNC(PRICE/10000)*10000 AS PRICE_GROUP
    FROM PRODUCT
)
SELECT PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCTS
FROM TEMP
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP