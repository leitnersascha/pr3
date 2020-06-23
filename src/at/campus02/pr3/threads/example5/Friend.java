package at.campus02.pr3.threads.example5;

public class Friend implements Runnable {
	
	private String name;
	private Friend friend;

	public Friend(String name) {
		super();
		this.name = name;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		bow();
	}
	
	public synchronized void bow() {
		System.out.println(name + " verbeugt sich vor " + friend.getName());
		friend.bowBack();
	}
	
	public synchronized void bowBack() {
		System.out.println(name + " erwidert die Verbeugung von " + friend.getName());
	}

}
