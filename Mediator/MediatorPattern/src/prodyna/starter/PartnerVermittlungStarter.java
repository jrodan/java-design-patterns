package prodyna.starter;

import prodyna.mediator.PartnerVermittlung;
import prodyna.mediator.impl.PartnerVermittlungImpl;
import prodyna.user.User;
import prodyna.user.impl.UserBaseImpl;

public class PartnerVermittlungStarter {

	public static void main(String[] args) {

		PartnerVermittlung pv = new PartnerVermittlungImpl();
		User u1 = new UserBaseImpl(pv, 1);
		User u2 = new UserBaseImpl(pv, 2);
		new UserBaseImpl(pv, 3);
		new UserBaseImpl(pv, 4);
		new UserBaseImpl(pv, 5);
		u1.sendPartnerInteresse(u2);
	}

}
