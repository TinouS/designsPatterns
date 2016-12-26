package flyWeight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Ticket ticket;

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter ticket type, name and fare.");
			String data[] = br.readLine().split(" ");
			ticket = TicketFactory.getTicket(data[0], data[1], Double.parseDouble(data[2]));
			ticket.printTicket();
		}
	}

}
