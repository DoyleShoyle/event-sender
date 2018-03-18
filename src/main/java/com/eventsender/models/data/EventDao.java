package com.eventsender.models.data;

import com.eventsender.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Brian Doyle
 */

@Repository
@Transactional
public interface EventDao extends CrudRepository<Event, Integer>{

}
