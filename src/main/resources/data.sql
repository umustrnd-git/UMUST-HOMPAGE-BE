-- INSERT 문을 각각 개별적인 문으로 분리
INSERT INTO thesis (title, journal, author, date, link)
VALUES ('A Randomized Pharmacokinetic Study in Healthy Male Subjects Comparing a High-concentration, Citrate-free SB5 Formulation (40 mg/0.4 ml) and Prior SB5 (Adalimumab Biosimilar)', 'Rheumatology and Therapy', 'So-shin Ahn, Minkyung Lee, Yumin Baek, Sukho', '2022-06-10', 'https://www.naver.com/');

INSERT INTO thesis (title, journal, author, date, link)
VALUES ('제목2', '저널2', '저자2', '2022-05-30', 'https://www.naver.com/');

INSERT INTO thesis (title, journal, author, date, link)
VALUES ('제목3', '저널3', '저자3', '2023-01-17', 'https://www.naver.com/');

-- article 테이블에 데이터 삽입
INSERT INTO article (article_category, title, content, created_at, modified_at, created_by, modified_by)
VALUES
('NOTICE', 'Sample Title 1', 'Sample Content 1', '2023-01-01 12:00:00', '2023-01-01 12:30:00', 'user1', 'user1'),
('NOTICE', 'Sample Title 2', 'Sample Content 2', '2023-02-15 09:45:00', '2023-02-15 10:15:00', 'user2', 'user2'),
('NEWS', '유머스트알엔디대원대학교 방사선을 이용한 퇴행성 관절염 치료용 의료기기 개발 MOU 체결 과거', '안녕하세요 유머스트알엔디입니다. 제목과 글자수 제한 초과시 처리 더 보기 버튼 별도 없이 클릭하면 상세 내용 링크로 넘어감', '2023-03-15 09:45:00', '2023-03-15 16:20:00', 'user1', 'user1'),
('NEWS', '유머스트알엔디대원대학교 방사선을 이용한 퇴행성 관절염 치료용 의료기기 개발 MOU 체결 최신', '안녕하세요 유머스트알엔디입니다. 유머스트알엔디가 대원대학교와 협력하여 방사선을 이용한 퇴행성 관절염 유머스트알엔디가 대원대학교와 협력하여 유머스트알엔디가 대원대학교와 협력하여', '2023-03-15 09:45:00', '2023-03-15 09:45:00', 'user1', 'user1'),
('EVENT', 'Event 1', '울릉크루즈를 이용해주시는 고객님께 깊은 감사의 말씀을 드립니다. 2024년 상반기 예약오픈 및 이용일자를 안내드립니다. 상기 일정은 선사의 사정에 따라 변동될 수 있습니다. ☎1533-3370, ARS 1번>1번 : 직원연결', '2023-01-01 12:00:00', '2023-01-01 12:30:00', 'user1', 'user1'),
('EVENT', 'Event 1', '설추석 특별수송기간 주말 연휴 연휴(대체휴일 포함)연휴(대체휴일 포함)', '2023-01-01 12:00:00', '2023-01-01 12:30:00', 'user1', 'user1'),
('ALBUM', '귀여운 오구 전시회', '오구 팝업스토어가 열렸씁니다~! 모두 관심 많이 가져주세용 OguOGu~', '2024-01-03 12:00:00', '2024-01-03 12:00:00', '관리자', '관리자'),
('ALBUM', '나는 어른이니깐..', '어른이니깐 눈물을 삼키면서 일합미다.. 화이팅 ㅜㅠㅜㅠ', '2024-01-04 12:00:00', '2024-01-04 12:00:00', '관리자', '관리자'),
('ALBUM', '오구와 비밀의 숲 게임 출시', '오구와 비밀의 숲 게임이 steam store에 출시되었습니다! OguOGu~', '2024-01-05 12:00:00', '2024-01-05 12:00:00', '관리자', '관리자'),
('ALBUM', '짱구는 못말려 : 태풍을 부르는 장엄한 전설의 결투!', '짱구는 못말려 : 태풍을 부르는 장엄한 전설의 결투! 개봉!', '2024-01-06 12:00:00', '2024-01-06 12:00:00', '관리자', '관리자'),
('ALBUM', '짱구는 못말려 부리부리 왕국의 보물 재개봉!!', '짱구는 못말려 부리부리 왕국의 보물 재개봉!!', '2024-01-07 12:00:00', '2024-01-07 12:00:00', '관리자', '관리자');

-- article_image 테이블에 데이터 삽입
INSERT INTO article_file (article_id, created_date, original_file_name, file_url)
VALUES
(1, '2023-01-01 12:00:00', '파일원래이름1.png', 'https://4.bp.blogspot.com/-ja7NuLDxx5w/W30QHvOYp7I/AAAAAAAAcgc/4Xi97gr1uDwhstq1Fo64LLwJPdDNMNE2QCLcBGAs/s0/15.png'),
(1, '2023-01-01 12:00:00', '파일원래이름2.jpg','https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9788965402602.jpg'),
(2, '2023-02-15 09:45:00', '파일원래이름3.png','https://velog.velcdn.com/images/julia_heo/post/f19dd3c8-7797-403e-9558-b6f691ebbc5c/image.png'),
(3, '2023-01-01 12:00:00', '파일원래이름4.png','https://velog.velcdn.com/images/julia_heo/post/f19dd3c8-7797-403e-9558-b6f691ebbc5c/image.png'),
(3, '2023-01-01 12:00:00', '파일원래이름5.png','https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FM8u34%2FbtrhFQtxxwP%2FO0CzZcrKqKVdO2WZGmGKM0%2Fimg.png'),
(3, '2023-01-01 12:00:00', '파일원래이름6.jpg','https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791160501506.jpg'),
(4, '2023-03-15 09:45:00', '파일원래이름7.jpg','https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791163035398.jpg'),
(5, '2023-03-18 18:20:00', '파일원래이름8.jpg','https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791186710456.jpg'),
(7, '2024-01-03 12:00:00', '오구 신나.jpg','https://umust-homepage-s3.s3.ap-northeast-2.amazonaws.com/%EC%98%A4%EA%B5%AC%EC%8B%A0%EB%82%98.jpg'),
(8, '2024-01-04 12:00:00', '오구 할일이 너무 많아.jpg','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSp4NLnvbKE-Yq1PhUEZaW-WXvEMctXQBt1tcXL3tQyMA&s'),
(8, '2024-01-04 12:00:00', '오구 일하는중.jpg','https://item.kakaocdn.net/do/ff45d6bba620a0c61cdc0291ef13397282f3bd8c9735553d03f6f982e10ebe70'),
(9, '2024-01-05 12:00:00', '오구와 비밀의 숲.jpg','https://on.com2us.com/wp-content/uploads/2023/12/%EC%98%A4%EA%B5%AC%EC%99%80-%EB%B9%84%EB%B0%80%EC%9D%98%EC%88%B2-002.jpg'),
(10, '2024-01-06 12:00:00', '짱구는 못말려 : 태풍을 부르는 장엄한 전설의 결투!.jpeg','https://bot-log-product.s3.ap-northeast-2.amazonaws.com/product/netflix/still/80243305-%EA%B7%B9%EC%9E%A5%ED%8C%90_%EC%A7%B1%EA%B5%AC%EB%8A%94_%EB%AA%BB%EB%A7%90%EB%A0%A4_10%EA%B8%B0_%3A_%ED%83%9C%ED%92%8D%EC%9D%84_%EB%B6%80%EB%A5%B4%EB%8A%94_%EC%9E%A5%EC%97%84%ED%95%9C_%EC%A0%84%EC%84%A4%EC%9D%98_%EA%B2%B0%ED%88%AC.jpeg'),
(11, '2024-01-07 12:00:00', '짱구덕후의 짱구 짤 공유 (+부리부리 대마왕).jpeg','https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjlfMjE0/MDAxNjAxMzUyMjk2OTM2.oxvG0qIGIrcXTGjeHxsCcz4Qn6X9hi3IOoim9clp4YQg.TESsc-NQok5zlGmhZRWcHrGXWbk4jh1PVrDCMu7LNFsg.JPEG.firstling1/IMG_8250.JPG?type=w800'),
(11, '2024-01-07 12:00:00', '뭔가 이상한 부리부리 마신 소환 춤.jpg','https://i.ytimg.com/vi/yDoMJ3GhEoY/maxresdefault.jpg');
