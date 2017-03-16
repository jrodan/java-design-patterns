package prodyna.user;

public interface User {
	
	void sendPartnerInteresse(User user);
	void recievePartnerInteresse(User user);
	long getId();
	
}
