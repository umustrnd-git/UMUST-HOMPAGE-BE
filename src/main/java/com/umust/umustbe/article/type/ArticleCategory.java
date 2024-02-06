package com.umust.umustbe.article.type;

public enum ArticleCategory {
    NOTICE("공지사항"),
    NEWS("보도자료"),
    EVENT("행사정보"),
    ALBUM("앨범");

    private final String category;

    ArticleCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}