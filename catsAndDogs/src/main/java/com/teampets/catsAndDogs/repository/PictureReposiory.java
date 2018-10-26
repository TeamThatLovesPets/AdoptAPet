package com.teampets.catsAndDogs.repository;

import com.teampets.catsAndDogs.model.util.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureReposiory extends JpaRepository<Picture, Long> {

}
