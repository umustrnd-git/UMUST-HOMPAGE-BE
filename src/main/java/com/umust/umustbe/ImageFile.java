package com.umust.umustbe;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Entity

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ImageFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String orignName;

    @Column(nullable = false)
    private String storedName; // 이미지 파일이 S3에 저장될때 사용되는 이름

    @Column(nullable = false)
    private String accessUrl;

    @Builder
    public ImageFile(String orignName, String storedName, String accessUrl) {
        this.orignName = orignName;
        this.storedName = storedName;
        this.accessUrl = accessUrl;
    }

    @Builder
    public ImageFile(String originName) {
        this.orignName = originName;
        this.storedName = getFileName(originName);
        this.accessUrl = "";
    }

    // 이미지 파일의 확장자를 추출하는 메소드
    public String extractExtension(String originName) {
        int index = originName.lastIndexOf('.');

        return originName.substring(index, originName.length());
    }

    // 이미지 파일의 이름을 저장하기 위한 이름으로 변환하는 메소드
    public String getFileName(String originName) {
        return UUID.randomUUID() + "." + extractExtension(originName);
    }

}