package com.katieoshea.events.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.katieoshea.events.models.Message;

@Repository
public interface MessageRepo extends CrudRepository<Message, Long> {

}
