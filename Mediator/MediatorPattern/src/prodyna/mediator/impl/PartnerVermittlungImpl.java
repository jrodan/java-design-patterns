package prodyna.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import prodyna.mediator.PartnerVermittlung;
import prodyna.user.User;

public class PartnerVermittlungImpl implements PartnerVermittlung {

	private List<User> users = new ArrayList<User>();

	public PartnerVermittlungImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendePartnervorschlag(User userFrom, User userTo) {

		System.out.println("Vermittlung aktiv");
		for (User userToSendTo : users) {
			if (userToSendTo.getId() != userFrom.getId()) {
				userToSendTo.recievePartnerInteresse(userFrom);
			}
		}
		System.out.println("Vermittlung abgeschlossen");
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
