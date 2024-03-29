-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, SUM(O.SALES_AMOUNT)*MAX(P.PRICE) AS SALES
FROM OFFLINE_SALE O
    LEFT JOIN PRODUCT P ON O.PRODUCT_ID = P.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE