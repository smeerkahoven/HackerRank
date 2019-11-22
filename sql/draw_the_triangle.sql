    SELECT  rpad('*', level+ (level-1),' *') str
    FROM dual
    CONNECT BY LEVEL <=20
