package com.springboot.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import  com.springboot.jpa.ticket.Ticket;

public interface  TicketRepository extends CrudRepository<Ticket,String> {

}
