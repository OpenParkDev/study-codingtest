-- 코드를 입력하세요
WITH DISCOUNT AS (
    SELECT CAR_TYPE
        , ((100 - DISCOUNT_RATE) / 100) AS "DISCOUNT_RATIO"
    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
    WHERE DURATION_TYPE = '30일 이상'
        AND CAR_TYPE IN ('세단', 'SUV')
)
SELECT C.CAR_ID, C.CAR_TYPE
    , (30 * D.DISCOUNT_RATIO * C.DAILY_FEE) AS "FEE"
FROM CAR_RENTAL_COMPANY_CAR C
    JOIN DISCOUNT D ON C.CAR_TYPE = D.CAR_TYPE
WHERE C.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE START_DATE <= TO_DATE('2022-11-30', 'YYYY-MM-DD')
            AND END_DATE >= TO_DATE('2022-11-01', 'YYYY-MM-DD')
        GROUP BY CAR_ID
    )
    AND (30 * D.DISCOUNT_RATIO * C.DAILY_FEE) >= 500000
    AND (30 * D.DISCOUNT_RATIO * C.DAILY_FEE) < 2000000
ORDER BY FEE DESC, CAR_TYPE, CAR_ID DESC