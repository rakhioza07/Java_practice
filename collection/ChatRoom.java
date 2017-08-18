package com.corejava.collection;

import java.util.*;
public class ChatRoom {

	static Map<String, List<User>> chatrooms=new HashMap<String,List<User>>();
	static Map<String, List<Message>> messages=new HashMap<String ,List<Message>>();
	static List<User> users=new ArrayList<User>();
	
	static Scanner scan=new Scanner(System.in);
	static User currentUser;
	static boolean login;
	
	public static void main(String[] args) {
		initMessages();
		int ch=0;
		while(true)
		{
			System.out.println("1. Create Chatroom");
			System.out.println("2. Add new user");
			System.out.println("3. Add the user to chatroom");
			System.out.println("4. User login");
			System.out.println("5. Send a message");
			System.out.println("6. Display the messages from a specific chatroom");
			System.out.println("7. List down all users belonging to the specified chat room.");
			System.out.println("8. Logout");
			System.out.println("9. Delete an user");
			System.out.println("10. Delete the chat room");
			System.out.println("11. Say GoodBye");
			
			try{
				System.out.println("Enter your choice : ");
				ch=scan.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Enter a valid choice  !!!!!!!!!!");
			}
			
			switch(ch)
			{
				case 1:
						newChatRoom();
						break;
				case 2:
						newUser();
						break;
				case 3:
						addUserToChatroom();
						break;	
				case 4:
					userLogin();
					break;
				case 5:
					sendMessage();
					break;
				case 6:
					System.out.println("Enter name of the chatroom");
					String chatroom=scan.next();
					viewMessageByChatroom(chatroom);
					break;
				case 7:
					System.out.println("Enter name of the chatroom");
					usersByChatRoom(scan.next());
					break;
				case 8:
					logout();
					break;
				case 9:
					System.out.println("Enter username");
					deleteUser(scan.next());
					break;
				case 10:
					System.out.println("Enter name of chatroom");
					deleteChatroom(scan.next());
					break;
				case 11:
					default:
						System.exit(0);
			}
		}
		
	}

	private static void deleteChatroom(String chatroom) {
		chatrooms.remove(chatroom.toLowerCase());
		initMessages();
	}

	private static void deleteUser(String userName) {
		for(User user:users)
		{
			if(user.getName().equalsIgnoreCase(userName) )
			{
				users.remove(user);
				displayUsers();
			}
		}		
	
	}

	private static void usersByChatRoom(String chatroom) {
		int i=1;
		List<User> user=chatrooms.get(chatroom);
		for(User u:user)
			System.out.println(i++ +" . "+u.getName());
		System.out.println();
		
	}

	private static void viewMessageByChatroom(String chatroom) {
		System.out.println("\t\t"+chatroom.toUpperCase()+"\n");
		List<Message> msgs=messages.get(chatroom);
		for(Message msg:msgs)
		{
			System.out.println(msg.getUserName() + " : "+msg.getMessage());
		}
		
	}


	private static void sendMessage() {
		System.out.println("Enter name of the ChatRoom ");
		String room=scan.next();
		if(messages.containsKey(room.toLowerCase()))
		{
			List<Message> msgs=messages.get(room);
			System.out.println("Enter message");
			String message=scan.next();
			msgs.add(new Message(currentUser.getName(), message));
			messages.put(room,msgs);
			System.out.println("Message sent to "+room+" by "+currentUser.getName());
		}
		else
			 System.out.println("Chatroom doesn't exist.");
	}

	private static void logout() {
		System.out.println("Logged out"+currentUser.getName());
		login=false;
	}

	private static void userLogin() {
		login=false;
		System.out.println("Enter Username :");
		String userName=scan.next();
		System.out.println("Enter password :");
		String passwd=scan.next();
		for(User user:users)
		{
			if(user.getName().equalsIgnoreCase(userName) && user.getPasswd().equalsIgnoreCase(passwd))
			{
				currentUser=new User(userName,passwd);
				System.out.println("Login successful : "+ currentUser.getName());
				login=true;
			}
		}
		if(login==false)
			System.out.println("Invalid username or password !!");
	}
	
	

	private static void addUserToChatroom() {
		try{
		System.out.println("Enter name of chatroom :");
		String room=scan.next();
		System.out.println("Enter username to be added :");
		String username=scan.next();
		for(User user:users)
		{
			if(user.getName().equalsIgnoreCase(username))
			{
				List<User> chatRoomUsers=chatrooms.get(room.toLowerCase());
				chatRoomUsers.add(user);
				chatrooms.put(room.toLowerCase(),chatRoomUsers);
				displayChatrooms();
			}
			else
				System.out.println("User doesnt't exist! ");	
		}	
		}
		catch(NullPointerException e)
		{
			System.out.println("Chatroom doesnt Exist");
		}
		catch(Exception e)
		{
			System.out.println("Oops !! Something went wrong! Try again..");
		}
}

	private static void newUser() {
		System.out.println("Enter Username :");
		String userName=scan.next();
		System.out.println("Enter password :");
		String passwd=scan.next();
		users.add(new User(userName,passwd));
		displayUsers();
	}

	private static void newChatRoom() {
		System.out.println("Enter the name of chatroom :");
		String name=scan.next();
		chatrooms.put(name.toLowerCase(), new ArrayList<User>());
		initMessages();
		displayChatrooms();
	}

	static void displayChatrooms()
	{
		int i=1;
		for(Map.Entry<String , List<User>> room:chatrooms.entrySet())
			System.out.println(i++ +" . "+room.getKey()+ " : "+room.getValue());
		System.out.println();
	}
	static void displayUsers()
	{
		int i=1;
		for(User user:users)
			System.out.println(i++ +" . "+user);
		System.out.println();
	}
	
	static void initMessages()
	{
		for(String key:chatrooms.keySet())
			messages.put(key, new ArrayList<Message>());
	}
}

