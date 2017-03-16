package prodyna.user.impl;

import prodyna.mediator.PartnerVermittlung;
import prodyna.user.User;

public class UserBaseImpl implements User{

	private PartnerVermittlung pv;
	private long id;
	
	public UserBaseImpl(PartnerVermittlung pv, long id) {
		this.pv = pv;
		this.id = id;
		this.pv.addUser(this);
	}
	
	@Override
	public void sendPartnerInteresse(User user) {
		this.pv.sendePartnervorschlag(this, user);
	}

	@Override
	public void recievePartnerInteresse(User user) {
		System.out.println("recieved notification from user "+user.getId());
	}

	@Override
	public long getId() {
		return this.id;
	}

}
