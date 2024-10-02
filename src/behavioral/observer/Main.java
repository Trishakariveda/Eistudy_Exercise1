package behavioral.observer;

public class Main {

	public static void main(String[] args) {
		SocialMediaPlatform platform = new SocialMediaPlatform();
        
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        platform.addObserver(user1);
        platform.addObserver(user2);

        // Simulate new activities
        platform.newActivity("Alice liked your post.");
        platform.newActivity("Bob commented on your photo.");
    }
}
