-- 코드를 입력하세요
SELECT I.ANIMAL_ID, I.ANIMAL_TYPE, I.NAME
FROM ANIMAL_INS I
INNER JOIN ANIMAL_OUTS O
ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE (I.SEX_UPON_INTAKE = 'Intact Male' AND O.SEX_UPON_OUTCOME = 'Neutered Male')
OR (I.SEX_UPON_INTAKE = 'Intact Female' AND O.SEX_UPON_OUTCOME = 'Spayed Female')
ORDER BY I.ANIMAL_ID