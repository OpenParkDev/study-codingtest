-- 코드를 입력하세요
WITH COUNTING AS (
    SELECT MEMBER_ID, COUNT(*) AS COUNTING
    FROM REST_REVIEW 
    GROUP BY MEMBER_ID
    ORDER BY COUNTING DESC
)
SELECT P.MEMBER_NAME, R.REVIEW_TEXT
    , TO_CHAR(R.REVIEW_DATE, 'YYYY-MM-DD') AS "REVIEW_DATE"
FROM REST_REVIEW R
    JOIN MEMBER_PROFILE P ON R.MEMBER_ID = P.MEMBER_ID
WHERE R.MEMBER_ID = (SELECT MEMBER_ID
                     FROM COUNTING
                     WHERE ROWNUM = 1)
ORDER BY REVIEW_DATE, REVIEW_TEXT