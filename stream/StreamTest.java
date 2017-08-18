package com.corejava.stream;
import static com.corejava.stream.TestData.*;
import static java.util.stream.Collectors.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamTest {

	public static void main(String[] args) {
		System.out.println("\n 1. Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.");
		
		getAllFruits()
		.stream()
		.filter(fruit->fruit.getCalories()<100)
		.sorted(Comparator.comparing(Fruit::getCalories)
		.reversed())
		.forEach(System.out::println);

		System.out.println("\n\n 2. Display color wise list of fruits.");
		
		getAllFruits()
		.stream()
		.collect(groupingBy(Fruit::getColor))
		.forEach((k,v)->System.out.println(k+" : "+v));
		
		System.out.println("\n\n 3.	Display only RED color fruits sorted as per their price in ascending order.");
		
		getAllFruits()
		.stream()
		.filter(f->f.getColor().equalsIgnoreCase("red"))
		.sorted(Comparator.comparing(Fruit::getPrice))
		.forEach(System.out::println);
		
		System.out.println("\n\n 4.	Find out the newsId which has received maximum comments.");
		System.out.println("News id with max comments : "+
				getAllNews()
				.stream()
				.collect(groupingBy(News::getNewsId,counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.get()
				.getKey());
		
		System.out.println("\n\n 5.	Find out how many times the word 'budget' arrived in user comments of all news.");
		
		System.out.println("No of times the word 'budget' arrived :"+getAllNews()
		.stream()
		.filter(news->news.getComment().contains("budget")).count());
		
		System.out.println("\n\n 6.	Display commentByUser wise number of comments.");
		
		getAllNews()
		.stream()
		.collect(groupingBy(News::getCommentByUser,counting()))
		.entrySet()
		.forEach(System.out::println);	
		
		System.out.println("7.	Find all transactions in the year 2011 and sort them by value (small to high).");
		
		getAllTransactions()
		.stream()
		.filter(trans->trans.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.forEach(System.out::println);
		
		System.out.println("\n\n 8.	What are all the unique cities where the traders work?");
		
		getAllTransactions()
		.stream()
		.map(trans->trans.getTrader().getCity())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("\n\n 9.	Find all traders from Pune and sort them by name.");
		
		getAllTransactions()
		.stream()
		.filter(trans->trans.getTrader().getCity().equalsIgnoreCase("pune"))
		.sorted(Comparator.comparing((Transaction t)->t.getTrader().getName()))
		.forEach(System.out::println);
		
		System.out.println("\n\n 10.	Return a string of all traders’ names sorted alphabetically.");

		System.out.println("Traders : "+
		getAllTransactions()
		.stream()
		.map((Transaction t)->t.getTrader().getName()).sorted().collect(Collectors.toList()).toString());
		
		System.out.println("\n\n 11.	Are any traders based in Indore?");
		getAllTransactions()
		.stream()
		.filter(trans->trans.getTrader().getCity().equalsIgnoreCase("indore"))
		.forEach(System.out::println);

		System.out.println("\n\n 12.	Print all transactions’ values from the traders living in Pune.");
		getAllTransactions()
		.stream()
		.filter(trans->trans.getTrader().getCity().equalsIgnoreCase("pune"))
		.map(Transaction::getValue)
		.forEach(System.out::println);
		
		System.out.println("\n\n 13.	What’s the highest value of all the transactions?");
		System.out.println("Highest Value :" +getAllTransactions()
		.stream()
		.map(Transaction::getValue)
		.reduce(Integer::max).get());
		
		System.out.println("\n\n 14.	Find the transaction with the smallest value.");
		System.out.println("Smallest Value :" +getAllTransactions()
		.stream()
		.map(Transaction::getValue)
		.reduce(Integer::min).get());
	
		System.out.println("\n\n 15.	Find out which user has posted maximum comments.");
		
		System.out.println("Max comments by : "+getAllNews()
		.stream()
		.collect(groupingBy(News::getCommentByUser,counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue()).get());
			
		
	}

}
