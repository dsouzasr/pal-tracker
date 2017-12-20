package io.pivotal.pal.tracker;

import java.util.List;

/**
 * Created by e059285 on 12/20/17.
 */
public interface  TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry find(Long id);
    List<TimeEntry> list();
    TimeEntry update(Long id, TimeEntry timeEntry);
    void delete(Long id);
}
