nuxt + springboot 를 통해 회원제 사이트를 만든다.

웹사이트는 간단한 api 리스트를 조회하는 화면을 접근할 수 있게 한다.
( 이건 찾아보기 뭘 가져올지 nuxt 에서 api 리스트 가져와도 되고.. )
-> 네이버 영화 api 를 통해 예제를 연습하기로 결정!

회원으로 로그인하지 않아도 이건 보이도록 하고
뭔가 추천 목록같은거는 메인에서 바로 확인이 가능한데
전체 목록을 조회하는 거는 회원으로 로그인해야만 보일 수 있도록 할까

다른 api 를 통해 목록을 구현한 페이지는 회원으로 로그인해야만 접근가능하고
만약 로그인하지 않은 회원이라면 @authentication 을 구현해서 로그인화면으로 튕기게 한다.

로그인은 세션을 구현해보기

회원가입양식 구성하기
회원 가입 컬럼
이름, 휴대폰번호, 성별, 이메일, 좋아하는 태그(태그는 DB 에서 불러온다) 선택하기 (4개정도)
일단 이렇게 구현해보고