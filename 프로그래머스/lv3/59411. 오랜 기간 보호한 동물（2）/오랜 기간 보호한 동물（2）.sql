-- 코드를 입력하세요
WITH TEMP AS (
    SELECT O.ANIMAL_ID, O.NAME
    FROM ANIMAL_OUTS O
        JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
    ORDER BY (O.DATETIME - I.DATETIME) DESC
)
SELECT *
FROM TEMP
WHERE ROWNUM <= 2