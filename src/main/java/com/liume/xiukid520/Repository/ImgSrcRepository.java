package com.liume.xiukid520.Repository;

import com.liume.xiukid520.Entity.ImageSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImgSrcRepository extends JpaRepository<ImageSource, Integer> {
//    @Query(nativeQuery = true, value = "select * FROM img_src WHERE type=?")
    List<ImageSource> findImageSourceByImgIndex(String imgIndex);
}
