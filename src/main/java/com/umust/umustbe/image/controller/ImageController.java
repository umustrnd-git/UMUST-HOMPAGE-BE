package com.umust.umustbe.image.controller;

import com.umust.umustbe.image.dto.ImageUrlResponse;
import com.umust.umustbe.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RequestMapping("/api/images")
@RestController
public class ImageController {

    private final ImageService imageService;

    @PostMapping
    public ResponseEntity<ImageUrlResponse> uploadImages(
            @RequestPart(value = "file", required = false) MultipartFile uploadImageFile) {
        return ResponseEntity.ok(imageService.uploadImage(uploadImageFile));

    }
}