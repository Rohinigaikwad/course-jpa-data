package com.springboot.jpa.controller;

import  com.springboot.jpa.ticket.Ticket;
 import com.springboot.jpa.service.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;


    @RequestMapping("/tickets")
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }

    @RequestMapping("tickets/{id}")
    public Ticket getTicket( @PathVariable String id){
        return ticketService.getTicket(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/tickets")
    public void addTicket(@RequestBody Ticket ticket){
        ticketService.addTicket(ticket);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/tickets/{id}")
    public void updateTicket(@RequestBody Ticket ticket,@PathVariable String id){
        ticketService.updateTicket(id,ticket);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/tickets/{id}")
    public void deleteTicket( @PathVariable String id){
        ticketService.deleteTicket(id);
    }

}
