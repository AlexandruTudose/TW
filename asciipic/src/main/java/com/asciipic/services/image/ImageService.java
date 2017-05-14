package com.asciipic.services.image;

import com.asciipic.models.Image;
import com.asciipic.services.ReadService;
import com.asciipic.services.UpdateService;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface ImageService extends ReadService<Image>, UpdateService<Image> {
}
