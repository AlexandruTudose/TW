package com.asciipic.services.job;

import com.asciipic.models.Job;
import com.asciipic.services.ReadService;
import com.asciipic.services.UpdateService;

/**
 * Created by Alexandru on 5/14/2017.
 */
public interface JobService extends ReadService<Job>, UpdateService<Job> {
}
