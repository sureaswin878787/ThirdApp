package in.aswinit.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.aswinit.response.Flight;
import in.aswinit.response.Flights;
import in.aswinit.response.QuoteResponse;

@Service
public class QuoteService {
	/*public void getQuote()
	{
	String url="https://quoters.apps.pcfone.io/api/random/";
	WebClient webClient=WebClient.create();
	
	String block=webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.block();
	System.out.println(block);
	System.out.println("request sent....................");
	}*/
	/*public void getQuote()
	{
	String url="https://quoters.apps.pcfone.io/api/random/";
	WebClient webClient=WebClient.create();
	
	QuoteResponse response=webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(QuoteResponse.class)
		.block();
	System.out.println(response);
	//Stream.of(response).forEach(System.out::println);
	System.out.println("request sent....................");
	}*/
	/*public void getQuoteAsync()
	{
		String url="https://quoters.apps.pcfone.io/api/random/";
		WebClient webClient=WebClient.create();
		webClient.get()
				.uri(url)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class)
				.subscribe(System.out::println);
		System.out.println("request sent....................");
	}*/
	
	//"http://mu.mulesoft-training.com/essentials/united/flights"
	public void getQuote()
	{
	String url="http://mu.mulesoft-training.com/essentials/united/flights";
	WebClient webClient=WebClient.create();
	
	Flights response=webClient.get()
		.uri(url)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(Flights.class)
		.block();
	System.out.println(response);
	List<Flight> flightsDtls=response.getFlights();
	flightsDtls.forEach(System.out::println);
	
	System.out.println("request sent....................");
	}
}
