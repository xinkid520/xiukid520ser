package com.liume.xiukid520.Service.ImgSrc;

import com.liume.xiukid520.Entity.ImageSource;
import com.liume.xiukid520.Repository.ImgSrcRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgSrcServiceImpl implements ImgSrcService {

    @Autowired
    ImgSrcRepository imgSrcRepository;

    private static Logger log = LogManager.getLogger(ImgSrcServiceImpl.class);


    @Override
    public List<ImageSource> getAllDate(String imgIndex) {

        return imgSrcRepository.findImageSourceByImgIndex(imgIndex);
    }
}
