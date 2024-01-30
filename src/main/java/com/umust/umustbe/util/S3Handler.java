package com.umust.umustbe.util;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.umust.umustbe.image.exception.FileUploadFailException;
import com.umust.umustbe.image.exception.UnsupportedImageFileTypeException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;
import java.util.UUID;

/**
 * S3서버로 파일 전송하는 메서드
 */
@Component
@RequiredArgsConstructor
public class S3Handler {

    private final AmazonS3Client amazonS3Client;

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    public String upload(MultipartFile uploadFile, String ext) throws IOException {
        String fileName = UUID.randomUUID() + "." + ext;

        return putS3(uploadFile, fileName);
    }

    public String upload(MultipartFile uploadFile) throws IOException {
        String ext = getExt(uploadFile);

        try {
            isImageFile(uploadFile);
            String fileName = UUID.randomUUID() + "." + ext;
            return putS3(uploadFile, fileName);
        } catch (IOException e) {
            // todo 업로드 실패 시 exception 생성
            throw new FileUploadFailException();
        }
    }


    // S3로 업로드
    private String putS3(MultipartFile uploadFile, String fileName) throws IOException {
        String result = null;
        String fileKey = "article/" + fileName;

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType(uploadFile.getContentType());
        metadata.setContentLength(uploadFile.getSize());

        amazonS3Client.putObject(new PutObjectRequest(bucket, fileKey, uploadFile.getInputStream(), metadata));

        // Amazon S3 클라이언트를 사용하여 업로드된 파일의 URL을 가져오기
        URL url = amazonS3Client.getUrl(bucket, fileKey);
        if (url != null) {
            result = url.toString();
        }

        return result;
    }

    //파일 삭제
    public void deleteFile(String fileUrl) throws IOException {
        int pos = fileUrl.lastIndexOf("/");
        String key = fileUrl.substring(pos + 1);

        try {
            amazonS3Client.deleteObject(new DeleteObjectRequest(bucket, key));

            System.out.println(String.format("[%s] deletion complete", key));

        } catch (Exception exception) {
            throw new IOException();
        }
    }

    public String getExt(MultipartFile imgFile) {
        //사진 확장자
        int pos = imgFile.getOriginalFilename().lastIndexOf(".");
        return imgFile.getOriginalFilename().substring(pos + 1);
    }

    public void isImageFile(MultipartFile file) {
        String ext = getExt(file);

        if (file.getContentType() == null || !file.getContentType().startsWith("image")) {
            throw new UnsupportedImageFileTypeException(ext);
        }

    }
}