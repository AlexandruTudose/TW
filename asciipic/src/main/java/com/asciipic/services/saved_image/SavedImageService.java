package com.asciipic.services.saved_image;

import com.asciipic.models.SavedImage;
import com.asciipic.services.ReadService;
import com.asciipic.services.UpdateService;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface SavedImageService extends ReadService<SavedImage>, UpdateService<SavedImage> {
}
