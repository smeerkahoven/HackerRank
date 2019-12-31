/*

Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.

Input Format

The OCCUPATIONS table is described as follows:



Occupation will only contain one of the following values: Doctor, Professor, Singer or Actor.

Sample Input



Sample Output

Jenny    Ashley     Meera  Jane
Samantha Christeen  Priya  Julia
NULL     Ketty      NULL   Maria
Explanation

The first column is an alphabetically ordered list of Doctor names.
The second column is an alphabetically ordered list of Professor names.
The third column is an alphabetically ordered list of Singer names.
The fourth column is an alphabetically ordered list of Actor names.
The empty cell data for columns with less than the maximum number of names per occupation (in this case, the Professor and Actor columns) are filled with NULL values.

Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/


SELECT 
    max(decode(occupation, 'Doctor', name)) PRO1,
    max(decode(occupation, 'Professor', name)) PRO4,        
    max(decode(occupation, 'Singer', name)) PRO3,
    max(decode(occupation, 'Actor', name)) PRO2
FROM
(
    SELECT row_number() over (partition by occupation order by name) rk,
    name, 
    occupation
    from OCCUPATIONS
    order by 2
)
group by rk
order by 1,2,3,4
;
