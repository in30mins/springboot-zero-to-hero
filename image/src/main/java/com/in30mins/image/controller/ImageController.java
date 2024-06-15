package com.in30mins.image.controller;

import com.in30mins.image.model.Image;
import com.in30mins.image.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
public class ImageController {
    @Autowired
    ImageRepository imageRepo;

    @PostMapping("/addImage")
    public Image postImage(@RequestParam("file") MultipartFile file) throws IOException {
        Image image = new Image();
        image.setImage(file.getBytes());
        return imageRepo.save(image);
    }

    @GetMapping(value="/get/{id}",produces= MediaType.IMAGE_JPEG_VALUE)
    public byte[] getImageId(@PathVariable int id) {
        Optional<Image> img = imageRepo.findById(id);
        if(img.isPresent()) {
            Image image = img.get();
            return image.getImage();
        }
        return null;
    }
}
