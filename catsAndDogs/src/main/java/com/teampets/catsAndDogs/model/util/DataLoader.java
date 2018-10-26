package com.teampets.catsAndDogs.model.util;

import com.teampets.catsAndDogs.repository.PictureReposiory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

@Configuration
@Slf4j

public class DataLoader {

    private PictureReposiory pictureReposiory;

    public DataLoader(PictureReposiory pictureReposiory) {
        this.pictureReposiory = pictureReposiory;
    }

    @Bean
    public CommandLineRunner initDatabase(){
        Iterable<Picture> pictures = null;
        try {
            pictures = initPicture();
        } catch (IOException e) {
            e.printStackTrace();
        }

        pictures.forEach(picture -> {
            log.info("Preloaded picture: " + picture.getPictures());
        });

        return args -> {};
    }

    private Iterable<Picture> initPicture() throws IOException {
        File file = new File("src/main/resources/image/cat.jpg");
        byte[] fileContent = Files.readAllBytes(file.toPath());
        Picture pictureNew = pictureReposiory.save(
                Picture.builder().pictures(fileContent).build());

        return Arrays.asList(pictureNew);
    }
}
