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
('EVENT', 'Event 1', '설추석 특별수송기간 주말 연휴 연휴(대체휴일 포함)연휴(대체휴일 포함)', '2023-01-01 12:00:00', '2023-01-01 12:30:00', 'user1', 'user1');

-- article_image 테이블에 데이터 삽입
INSERT INTO article_file (article_id, created_date, file_url)
VALUES
(1, '2023-01-01 12:00:00', 'https://4.bp.blogspot.com/-ja7NuLDxx5w/W30QHvOYp7I/AAAAAAAAcgc/4Xi97gr1uDwhstq1Fo64LLwJPdDNMNE2QCLcBGAs/s0/15.png'),
(1, '2023-01-01 12:00:00', 'https://contents.kyobobook.co.kr/sih/fit-in/458x0/pdt/9788965402602.jpg'),
(2, '2023-02-15 09:45:00', 'https://velog.velcdn.com/images/julia_heo/post/f19dd3c8-7797-403e-9558-b6f691ebbc5c/image.png'),
(3, '2023-01-01 12:00:00', 'https://velog.velcdn.com/images/julia_heo/post/f19dd3c8-7797-403e-9558-b6f691ebbc5c/image.png'),
(3, '2023-01-01 12:00:00', 'https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FM8u34%2FbtrhFQtxxwP%2FO0CzZcrKqKVdO2WZGmGKM0%2Fimg.png'),
(3, '2023-01-01 12:00:00', 'https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791160501506.jpg'),
(4, '2023-03-15 09:45:00', 'https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791163035398.jpg'),
(5, '2023-03-18 18:20:00', 'https://contents.kyobobook.co.kr/sih/fit-in/400x0/pdt/9791186710456.jpg');

