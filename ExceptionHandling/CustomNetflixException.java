class SubscriptionExpiredException extends Exception{
	public SubscriptionExpiredException(String message) {
		super(message);
	}
}
public class CustomNetflixException {
	void streamMovie(boolean isSubscribed) throws SubscriptionExpiredException{
		if(!isSubscribed) {
			throw new SubscriptionExpiredException("Your subscription has expired."
					+ "Please renew to continue streaming.");
		}else {
			System.out.println("Streaming Movie....");
		}
	}
	
	public static void main(String[] args) {
		CustomNetflixException user = new CustomNetflixException();
		try {
			user.streamMovie(false);
		}catch(SubscriptionExpiredException e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
OUTPUT
Your subscription has expired.Please renew to continue streaming.
*/