-- INSERT 문을 각각 개별적인 문으로 분리
INSERT INTO thesis (title, journal, author, date, link)
VALUES ('A Randomized Pharmacokinetic Study in Healthy Male Subjects Comparing a High-concentration, Citrate-free SB5 Formulation (40 mg/0.4 ml) and Prior SB5 (Adalimumab Biosimilar)', 'Rheumatology and Therapy', 'So-shin Ahn, Minkyung Lee, Yumin Baek, Sukho', '2022-06-10', 'https://www.naver.com/');

INSERT INTO thesis (title, journal, author, date, link)
VALUES ('제목2', '저널2', '저자2', '2022-05-30', 'https://www.naver.com/');

INSERT INTO thesis (title, journal, author, date, link)
VALUES ('제목3', '저널3', '저자3', '2023-01-17', 'https://www.naver.com/');

INSERT INTO article (title, content, created_at, modified_at, created_by, modified_by)
VALUES ('Sample Title 1', 'Sample Content 1', '2023-01-01 12:00:00', '2023-01-01 12:30:00', 'user1', 'user1'),
       ('Sample Title 2', 'Sample Content 2', '2023-02-15 09:45:00', '2023-02-15 10:15:00', 'user2', 'user2'),
       ('Sample Title 3', 'Sample Content 3', '2023-05-10 18:20:00', '2023-05-10 18:45:00', 'user3', 'user3');
