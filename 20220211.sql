#회원가입시 아이디 비밀번호를 db에서 조회하는 쿼리
#--> 아이디만 일치하면 <1 0> 둘다일치하면 <1 1> 둘다 다르면 <0 0>
SELECT
	COUNT(um.username) +	COUNT(um2.PASSWORD) AS login_flag
FROM
	user_mst um
	LEFT OUTER JOIN user_mst um2 ON(um2.user_code = um.user_code AND um2.password = ?)
WHERE 
	um.username = ?;


SELECT
	um.user_code,
	um.username,
	um.password,
	um.name,
	um.email,
	ud.phone,
	ud.addr
FROM 
	user_mst um
	LEFT OUTER JOIN user_dtl ud ON(ud.user_code = um.user_code)
WHERE
	um.username = ?;