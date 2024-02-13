package com.umust.umustbe.article.type;

public enum ArticleCategory {
    NOTICE("공지사항"),
    NEWS("보도자료"),
    EVENT("행사정보"),
    COSINFO("제품-코스메슈티컬-관련정보"),
    REFERENCE("자료실"),
    ALBUM("앨범"),
    CERTIFICATION("인증현황"),
    LABORATORY("기업부설연구소"),
    PATENT("특허");

    private final String category;

    ArticleCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}