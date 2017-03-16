package prodyna.mediator;

import prodyna.user.User;

public interface PartnerVermittlung {
	
	void addUser(User user);
	void sendePartnervorschlag(User userFrom, User userTo);
}
