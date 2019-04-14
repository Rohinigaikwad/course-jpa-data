package com.springboot.jpa.service;
import com.springboot.jpa.repository.TicketRepository;
import  com.springboot.jpa.ticket.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets(){
        List<Ticket> tickets=new ArrayList<>();
        ticketRepository.findAll().forEach(tickets::add);
        return tickets;
    }

    public  Ticket getTicket(String id){
        return ticketRepository.findById(id).get();

    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void updateTicket( String id,Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(String id) {
        ticketRepository.deleteById(id);
    }
}
