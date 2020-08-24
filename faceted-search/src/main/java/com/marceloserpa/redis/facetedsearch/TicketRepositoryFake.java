package com.marceloserpa.redis.facetedsearch;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryFake {
	
	public List<Ticket> getFakes(){
		List<Ticket> tickets = new ArrayList<>();
		
		Ticket ticket1 = new Ticket();
		ticket1.setSku("895-ESI-874");
		ticket1.setName("Marilyn Manson Concert");
		ticket1.setDisabledAccess(false);
		ticket1.setType("premium");
		ticket1.setCity("Las Vegas");
		ticket1.setCategory("concert");
		tickets.add(ticket1);
		
		
		Ticket ticket2 = new Ticket();
		ticket2.setSku("214-AGH-774");
		ticket2.setName("Slipknot concert - premium ticket");
		ticket2.setDisabledAccess(false);
		ticket2.setType("premium");
		ticket2.setCity("NYC");
		ticket2.setCategory("concert");
		tickets.add(ticket2);
		
		Ticket ticket3 = new Ticket();
		ticket3.setSku("910-YUA-544");
		ticket3.setName("Slipknot concert - basic ticket");
		ticket3.setDisabledAccess(false);
		ticket3.setType("basic");
		ticket3.setCity("NYC");
		ticket3.setCategory("concert");
		tickets.add(ticket3);				
		
		Ticket ticket4 = new Ticket();
		ticket4.setSku("910-YUA-544");
		ticket4.setName("AWS ReInvent");
		ticket4.setDisabledAccess(false);
		ticket4.setType("premium");
		ticket4.setCity("NYC");
		ticket4.setCategory("it conference");
		tickets.add(ticket4);			
		
		return tickets;
	}
	
	
}
