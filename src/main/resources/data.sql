-- INSERT 문을 각각 개별적인 문으로 분리
INSERT INTO thesis (title, journal, author, date, link)
VALUES
    ('A Randomized Pharmacokinetic Study in Healthy Male Subjects Comparing a High-concentration, Citrate-free SB5 Formulation (40 mg/0.4 ml) and Prior SB5 (Adalimumab Biosimilar)', 'Rheumatology and Therapy', 'So-shin Ahn, Minkyung Lee, Yumin Baek, Sukho', '2022-06-10', 'https://www.naver.com/'),
    ('Another Study on the Impact of X Substance on Y Condition', 'Journal of Medicine', 'John Doe, Jane Smith', '2022-08-15', 'https://www.example.com/'),
    ('Exploring Novel Approaches for Treating Chronic Diseases', 'Scientific Research Journal', 'Emily Johnson, Robert White', '2023-04-05', 'https://www.researchsite.com/'),
    ('The Role of Genetics in Autoimmune Disorders', 'Genetics and Medicine', 'Alex Turner, Sarah Brown', '2022-12-03', 'https://www.sciencedirect.com/'),
    ('Advancements in Nanotechnology for Targeted Drug Delivery', 'Nanomedicine', 'Daniel Miller, Olivia Wilson', '2023-09-20', 'https://www.nanotechjournal.com/'),
    ('Examining the Efficacy of a New Therapeutic Approach in Cancer Treatment', 'Cancer Research', 'Michael Thompson, Lisa Davis', '2022-11-30', 'https://www.cancerjournal.com/'),
    ('Impact of Diet on Cardiovascular Health: A Longitudinal Study', 'Cardiology Today', 'Sophia Lee, William Johnson', '2023-07-01', 'https://www.cardiologyjournal.org/'),
    ('Emerging Trends in Neurological Research: A Comprehensive Review', 'Neuroscience Reviews', 'Andrew Clark, Emma Davis', '2022-10-12', 'https://www.neurosciencereview.com/'),
    ('Innovations in Wearable Health Monitoring Devices', 'Digital Health', 'Jennifer Martin, Kevin Wilson', '2023-01-28', 'https://www.digitalhealthjournal.com/'),
    ('Analyzing the Link Between Gut Microbiota and Mental Health', 'Psychiatry Insights', 'Ryan Smith, Hannah Brown', '2023-03-15', 'https://www.psychiatryinsights.com/');

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
('ALBUM', '짱구는 못말려 부리부리 왕국의 보물 재개봉!!', '짱구는 못말려 부리부리 왕국의 보물 재개봉!!', '2024-01-07 12:00:00', '2024-01-07 12:00:00', '관리자', '관리자'),
('ALBUM', '신제품 출시! 천연 성분으로 만든 화장품', '우리 회사에서 새롭게 개발한 천연 성분을 사용한 화장품이 출시되었습니다! 건강한 피부를 위한 최고의 선택, 지금 확인하세요.', '2024-03-10 09:30:00', '2024-03-10 10:00:00', '관리자', '관리자'),
('ALBUM', '항암 신약 연구 소식', '우리 연구팀이 항암 신약의 새로운 연구 결과를 발표했습니다. 암 치료에 새로운 가능성을 제시하는 연구에 대해 자세히 알아보세요.', '2024-03-11 11:45:00', '2024-03-11 12:15:00', '관리자', '관리자'),
('ALBUM', 'AMUST - 관절염 치료 기기', 'AMUST는 우리 회사에서 개발한 첨단 기술을 활용한 관절염 치료 기기입니다. 환자들에게 더 나은 삶의 질을 제공하기 위해 노력하고 있습니다.', '2024-03-12 14:00:00', '2024-03-12 14:30:00', '관리자', '관리자'),
('ALBUM', '화장품 제작 공정 소개', '화장품을 만들기 위한 우리의 제작 공정을 소개합니다. 품질과 안전을 최우선으로 둔 제품을 제공하기 위해 끊임없이 노력하고 있습니다.', '2024-03-13 15:45:00', '2024-03-13 16:15:00', '관리자', '관리자'),
('ALBUM', '신약 개발 현황 업데이트', '우리 회사에서 진행 중인 신약 개발 프로젝트의 현황을 업데이트했습니다. 혁신적인 치료법을 위한 노력을 계속 지지해주세요.', '2024-03-14 17:30:00', '2024-03-14 18:00:00', '관리자', '관리자'),
('ALBUM', 'AMUST 기술 세미나 공지', 'AMUST 관절염 치료 기기에 관한 기술 세미나를 개최합니다. 혁신적인 기술과 노하우를 공유하고 함께 논의해보세요.', '2024-03-15 09:30:00', '2024-03-15 10:00:00', '관리자', '관리자'),
('ALBUM', '화장품 트렌드 세미나 안내', '화장품 산업의 최신 트렌드와 기술에 대한 세미나를 개최합니다. 미래의 트렌드를 선도하는 행사에 여러분을 초대합니다.', '2024-03-16 11:45:00', '2024-03-16 12:15:00', '관리자', '관리자'),
('ALBUM', '항암 신약 개발 과정 소개', '우리 팀이 진행 중인 항암 신약 개발 프로젝트의 과정을 소개합니다. 새로운 치료법 개발을 위한 노력에 대해 알아보세요.', '2024-03-17 14:00:00', '2024-03-17 14:30:00', '관리자', '관리자'),
('ALBUM', 'AMUST - 관절염 치료 성공 사례', 'AMUST를 사용한 환자의 치료 성공 사례를 소개합니다. 기술적인 혁신으로 어려운 관절염에 대한 새로운 해결책을 제시합니다.', '2024-03-18 15:45:00', '2024-03-18 16:15:00', '관리자', '관리자'),
('ALBUM', '코스메슈티컬 세미나 일정 공지', '코스메슈티컬 세미나 일정이 확정되었습니다. 최신 트렌드와 기술에 대한 세미나를 놓치지 마세요. 참가 신청은 홈페이지에서 가능합니다.', '2024-03-19 17:30:00', '2024-03-19 18:00:00', '관리자', '관리자'),
('COSINFO', '최신 화장품 트렌드 소개', '2023년에 주목받는 최신 화장품 트렌드를 소개합니다. 자연주의 성분을 활용한 제품들이 눈에 띄게 늘고 있습니다.', '2023-07-05 10:00:00', '2023-07-05 10:30:00', '관리자', '관리자'),
('COSINFO', '피부 타입에 따른 화장품 선택 가이드', '건성, 지성, 복합성 등 피부 타입에 맞는 화장품 선택의 요령을 알려드립니다. 당신의 피부를 위한 제품을 찾아보세요.', '2023-07-12 11:15:00', '2023-07-12 11:45:00', '관리자', '관리자'),
('COSINFO', '뷰티 인플루언서가 추천하는 화장품 Best 5', '인기 뷰티 인플루언서들이 추천하는 화장품을 소개합니다. 트러블 케어부터 메이크업까지 다양한 제품을 확인해보세요.', '2023-07-20 13:00:00', '2023-07-20 13:30:00', '관리자', '관리자'),
('COSINFO', 'DIY 화장품 만들기', '집에서 간단히 만들 수 있는 DIY 화장품 레시피를 공유합니다. 천연 성분을 활용해 자신만의 화장품을 만들어보세요.', '2023-08-02 14:45:00', '2023-08-02 15:15:00', '관리자', '관리자'),
('COSINFO', '화장품 유통기한 확인 방법', '구매한 화장품의 유통기한을 올바르게 확인하는 방법에 대해 안내합니다. 안전한 사용을 위해 유통기한을 체크해주세요.', '2023-08-15 16:30:00', '2023-08-15 17:00:00', '관리자', '관리자'),
('COSINFO', '최신 화장품 트렌드 소개 2', '2023년에 주목받는 또 다른 최신 화장품 트렌드를 소개합니다. 풍부한 자연주의 성분을 활용한 제품들이 더욱 눈에 띕니다.', '2023-08-29 10:00:00', '2023-08-29 10:30:00', '관리자', '관리자'),
('COSINFO', '클렌징 제품 추천과 사용법', '좋은 클렌징 제품을 선택하고 올바르게 사용하는 방법에 대해 알려드립니다. 피부에 부담 없이 깨끗한 피부를 유지하세요.', '2023-09-10 11:15:00', '2023-09-10 11:45:00', '관리자', '관리자'),
('COSINFO', '봄철 피부관리 팁', '봄철에 특히 중요한 피부 관리에 대한 팁을 알려드립니다. 건강한 피부를 유지하기 위한 봄철 스킨케어 방법을 확인하세요.', '2023-09-25 13:00:00', '2023-09-25 13:30:00', '관리자', '관리자'),
('COSINFO', '뷰티 루틴 개발의 요령', '자신만의 뷰티 루틴을 개발하는데 도움이 되는 요령을 공유합니다. 효과적인 스킨케어와 메이크업 루틴을 만들어보세요.', '2023-10-12 14:45:00', '2023-10-12 15:15:00', '관리자', '관리자'),
('COSINFO', '자외선 차단제 선택 가이드', '다양한 자외선 차단제 중에서 자신에게 맞는 제품을 선택하는 가이드를 제공합니다. 피부를 보호하고 건강을 유지하세요.', '2023-10-28 16:30:00', '2023-10-28 17:00:00', '관리자', '관리자'),
('COSINFO', '화장품 성분 해독', '화장품 성분표를 해독하는 방법을 소개합니다. 자신에게 적합한 제품을 찾기 위해 성분을 파악하는 방법에 대해 알아보세요.', '2023-11-10 09:30:00', '2023-11-10 10:00:00', '관리자', '관리자'),
('COSINFO', '마스크 착용 시 스킨케어 팁', '마스크 착용으로 인한 피부 트러블을 예방하고 관리하기 위한 스킨케어 팁을 안내합니다. 건강한 피부를 유지하세요.', '2023-12-01 11:45:00', '2023-12-01 12:15:00', '관리자', '관리자'),
('REFERENCE', '최신 신약 개발 동향과 성공 사례', '최근 신약 개발 분야에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 치료법이 개발되고 있는지 알아보세요.', '2023-09-01 09:30:00', '2023-09-01 10:00:00', '관리자', '관리자'),
('REFERENCE', '화장품 제작과 관련된 최신 기술 소개', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 11:45:00', '2023-09-02 12:15:00', '관리자', '관리자'),
('REFERENCE', 'IT 개발 분야의 혁신과 도전', 'IT 개발 분야에서의 혁신과 도전적인 프로젝트에 대해 다루는 글입니다. 최신 기술 동향과 프로젝트에서의 주요 경험을 살펴보세요.', '2023-09-03 14:00:00', '2023-09-03 14:30:00', '관리자', '관리자'),
('REFERENCE', '신약 개발과 IT 기술의 융합', '신약 개발과 IT 기술이 어떻게 융합되어 혁신적인 결과를 이끌어내고 있는지 살펴봅니다. 데이터 분석과 인공지능이 신약 발견에 어떤 영향을 미치는지 알아보세요.', '2023-09-04 15:45:00', '2023-09-04 16:15:00', '관리자', '관리자'),
('REFERENCE', '화장품 제작과 IT 기술의 융합 프로젝트', '화장품 제작과 IT 기술이 결합된 프로젝트에 대한 경험담을 공유합니다. 디지털 기술이 화장품 산업에 미치는 영향에 대해 알아보세요.', '2023-09-05 17:30:00', '2023-09-05 18:00:00', '관리자', '관리자'),
('REFERENCE', '신약 개발 프로세스 소개', '신약을 개발하는 전체 프로세스를 소개하는 글입니다. 기초 연구부터 임상 시험까지의 단계를 살펴보세요.', '2023-09-06 14:00:00', '2023-09-06 14:30:00', '관리자', '관리자'),
('REFERENCE', '화장품 제작에서의 원료 선택 가이드', '화장품 제작에서 원료를 선택하는 중요한 가이드를 제공합니다. 피부 타입과 목적에 맞게 원료를 선택하세요.', '2023-09-07 15:45:00', '2023-09-07 16:15:00', '관리자', '관리자'),
('REFERENCE', 'IT 기술을 활용한 신약 발견', 'IT 기술을 활용하여 신약 발견에 적용되는 다양한 방법과 도구에 대해 다루는 글입니다. 현대적인 연구 동향을 살펴보세요.', '2023-09-08 17:30:00', '2023-09-08 18:00:00', '관리자', '관리자'),
('REFERENCE', '코스메슈티컬 세미나 후기', '최근 개최된 코스메슈티컬 세미나에 참여한 후기를 공유합니다. 새로운 트렌드와 정보를 놓치지 마세요.', '2023-09-09 09:30:00', '2023-09-09 10:00:00', '관리자', '관리자'),
('REFERENCE', '신약 개발 실패 사례와 교훈', '과거의 신약 개발에서 얻은 교훈을 바탕으로 실패 사례를 살펴봅니다. 향후 연구에 도움이 될 수 있는 경험을 공유합니다.', '2023-09-10 11:45:00', '2023-09-10 12:15:00', '관리자', '관리자'),
('REFERENCE', 'IT 기술을 활용한 화장품 품질 관리', 'IT 기술을 이용하여 화장품 제품의 품질을 향상시키는 방법에 대해 다루는 글입니다. 현대적인 품질 관리 방법을 살펴보세요.', '2023-09-11 14:00:00', '2023-09-11 14:30:00', '관리자', '관리자'),
('REFERENCE', '화장품 기업의 IT 전략', '화장품 산업에서 IT를 활용한 전략적인 방향성을 다루는 글입니다. 경쟁력을 강화하기 위한 다양한 전략을 살펴보세요.', '2023-09-12 15:45:00', '2023-09-12 16:15:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 1', '최근 신약 개발 분야에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 치료법이 개발되고 있는지 알아보세요.', '2023-09-01 09:30:00', '2023-09-01 10:00:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 2', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 11:45:00', '2023-09-02 12:15:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 3', '최근 신약 개발 분야에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 치료법이 개발되고 있는지 알아보세요.', '2023-09-01 09:45:00', '2023-09-01 10:15:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 4', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 12:00:00', '2023-09-02 12:30:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 5', '최근 신약 개발 분야에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 치료법이 개발되고 있는지 알아보세요.', '2023-09-01 10:00:00', '2023-09-01 10:30:00', '관리자', '관리자'),
('CERTIFICATION', '인증현황 6', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 12:15:00', '2023-09-02 12:45:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 1', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 10:30:00', '2023-09-01 11:00:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 2', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 12:45:00', '2023-09-02 13:15:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 3', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 11:15:00', '2023-09-01 11:45:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 4', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 13:00:00', '2023-09-02 13:30:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 5', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 11:30:00', '2023-09-01 12:00:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 6', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 13:15:00', '2023-09-02 13:45:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 1', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 10:30:00', '2023-09-01 11:00:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 2', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 12:45:00', '2023-09-02 13:15:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 3', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 11:15:00', '2023-09-01 11:45:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 4', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 13:00:00', '2023-09-02 13:30:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 5', '최근 기업부설 연구소에서 일어나고 있는 동향과 성공 사례를 살펴봅니다. 혁신적인 기술과 연구 결과로 어떻게 새로운 기술이 개발되고 있는지 알아보세요.', '2023-09-01 11:30:00', '2023-09-01 12:00:00', '관리자', '관리자'),
('LABORATORY', '연구소 현황 6', '화장품 제작 분야에서 사용되는 최신 기술에 대해 알아봅니다. 현대적인 트렌드를 반영한 제품을 만들기 위한 기술적인 측면을 살펴보세요.', '2023-09-02 13:15:00', '2023-09-02 13:45:00', '관리자', '관리자');



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

-- ALBUM
(7, '2024-01-03 12:00:00', '오구 신나.jpg','https://umust-homepage-s3.s3.ap-northeast-2.amazonaws.com/%EC%98%A4%EA%B5%AC%EC%8B%A0%EB%82%98.jpg'),
(8, '2024-01-04 12:00:00', '오구 할일이 너무 많아.jpg','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSp4NLnvbKE-Yq1PhUEZaW-WXvEMctXQBt1tcXL3tQyMA&s'),
(8, '2024-01-04 12:00:00', '오구 일하는중.jpg','https://item.kakaocdn.net/do/ff45d6bba620a0c61cdc0291ef13397282f3bd8c9735553d03f6f982e10ebe70'),
(9, '2024-01-05 12:00:00', '오구와 비밀의 숲.jpg','https://on.com2us.com/wp-content/uploads/2023/12/%EC%98%A4%EA%B5%AC%EC%99%80-%EB%B9%84%EB%B0%80%EC%9D%98%EC%88%B2-002.jpg'),
(10, '2024-01-06 12:00:00', '짱구는 못말려 : 태풍을 부르는 장엄한 전설의 결투!.jpeg','https://bot-log-product.s3.ap-northeast-2.amazonaws.com/product/netflix/still/80243305-%EA%B7%B9%EC%9E%A5%ED%8C%90_%EC%A7%B1%EA%B5%AC%EB%8A%94_%EB%AA%BB%EB%A7%90%EB%A0%A4_10%EA%B8%B0_%3A_%ED%83%9C%ED%92%8D%EC%9D%84_%EB%B6%80%EB%A5%B4%EB%8A%94_%EC%9E%A5%EC%97%84%ED%95%9C_%EC%A0%84%EC%84%A4%EC%9D%98_%EA%B2%B0%ED%88%AC.jpeg'),
(11, '2024-01-07 12:00:00', '짱구덕후의 짱구 짤 공유 (+부리부리 대마왕).jpeg','https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjlfMjE0/MDAxNjAxMzUyMjk2OTM2.oxvG0qIGIrcXTGjeHxsCcz4Qn6X9hi3IOoim9clp4YQg.TESsc-NQok5zlGmhZRWcHrGXWbk4jh1PVrDCMu7LNFsg.JPEG.firstling1/IMG_8250.JPG?type=w800'),
(11, '2024-01-07 12:00:00', '뭔가 이상한 부리부리 마신 소환 춤.jpg','https://i.ytimg.com/vi/yDoMJ3GhEoY/maxresdefault.jpg'),
(12, '2024-03-10 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(12, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(13, '2024-03-11 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(13, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(14, '2024-03-12 14:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(14, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(15, '2024-03-13 15:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(15, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(16, '2024-03-14 17:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(16, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(17, '2024-03-15 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(17, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(18, '2024-03-16 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(18, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(19, '2024-03-17 14:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(19, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(20, '2024-03-18 15:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(20, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(21, '2024-03-19 17:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(21, '2024-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

-- COSINFO
(22, '2023-07-05 10:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(22, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(23, '2023-07-12 11:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(23, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(24, '2023-07-20 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(24, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(25, '2023-08-02 14:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(25, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(26, '2023-08-15 16:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(26, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(27, '2023-08-29 10:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(27, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(28, '2023-09-10 11:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(28, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(29, '2023-09-25 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(29, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(30, '2023-10-12 14:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(30, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(31, '2023-10-28 16:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(31, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(32, '2023-11-10 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(32, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(33, '2023-12-01 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(33, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

-- REFERENCE
(34, '2023-09-01 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(34, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(35, '2023-09-02 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(35, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(36, '2023-09-03 14:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(36, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(37, '2023-09-04 16:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(37, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(38, '2023-09-05 10:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(38, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(39, '2023-09-06 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(39, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(40, '2023-09-07 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(40, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(41, '2023-09-08 14:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(41, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(42, '2023-09-09 16:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(42, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(43, '2023-09-10 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(43, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(44, '2023-09-11 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(44, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(45, '2023-09-12 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(45, '2023-01-07 12:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

-- CERTIFICATION
(46, '2023-09-01 09:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(46, '2023-09-01 09:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(47, '2023-09-02 11:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(47, '2023-09-02 11:45:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(48, '2023-09-09 16:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(48, '2023-09-09 16:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(49, '2023-09-11 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(49, '2023-09-11 13:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(50, '2023-09-12 10:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(50, '2023-09-12 10:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(51, '2023-09-13 15:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(51, '2023-09-13 15:45:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

-- LABORATORY
(52, '2023-09-01 10:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(52, '2023-09-01 10:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(53, '2023-09-02 12:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(53, '2023-09-02 12:45:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(54, '2023-09-01 11:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(54, '2023-09-01 11:15:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(55, '2023-09-02 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(55, '2023-09-02 13:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(56, '2023-09-01 11:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(56, '2023-09-01 11:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(57, '2023-09-02 13:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(57, '2023-09-02 13:15:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(58, '2023-09-01 12:15:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(58, '2023-09-01 12:15:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(59, '2023-09-02 13:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(59, '2023-09-02 13:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(60, '2023-09-01 12:30:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(60, '2023-09-01 12:30:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(61, '2023-09-02 13:45:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(61, '2023-09-02 13:45:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(62, '2023-09-01 13:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(62, '2023-09-01 13:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg'),

(63, '2023-09-02 14:00:00', '꿀벌띠모.webp', 'https://i.namu.wiki/i/mMeMzTtRW9bGaO8_nxxIy0cL_Y4R22d_qWn3Uvcv-WKOSFWsP3Wg9ULZfDI4I1ApeEMl4wGRszwLJXQV1evPAQ.webp'),
(63, '2023-09-02 14:00:00', '반갑다모띠모다모.jpg', 'https://images.contentstack.io/v3/assets/blt731acb42bb3d1659/blt9dd4453e0a804513/63f6c11243153734d14716e3/keyart.jpg');