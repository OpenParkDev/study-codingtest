-- 코드를 입력하세요
SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
FROM ANIMAL_OUTS O
    JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE (O.SEX_UPON_OUTCOME LIKE 'Spayed%' OR O.SEX_UPON_OUTCOME LIKE 'Neutered%')
    AND I.SEX_UPON_INTAKE LIKE 'Intact%'
ORDER BY O.ANIMAL_ID