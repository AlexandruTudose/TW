package com.asciipic.services.journalize;

import com.asciipic.models.Journalize;
import com.asciipic.services.ReadService;
import com.asciipic.services.UpdateService;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface JournalizeService extends UpdateService<Journalize>, ReadService<Journalize> {
}
