-- 코드를 입력하세요
SELECT MCDP_CD AS "진료과코드", COUNT(*) AS "5월예약건수"
FROM APPOINTMENT
WHERE EXTRACT(YEAR FROM APNT_YMD) = '2022'
        AND EXTRACT(MONTH FROM APNT_YMD) = '05'
GROUP BY MCDP_CD
ORDER BY COUNT(*), MCDP_CD