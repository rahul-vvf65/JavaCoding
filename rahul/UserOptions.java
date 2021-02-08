package n2s.ehc.rahul;

import java.util.Map;

public class UserOptions {

	public UserOptions() {
	}

	
	public void insert(UserBean u) throws UserExceptions {
		try {
			if (u.getTable().containsKey(u.getUserId())){
				throw new InvalidUserId("User Id already exist. Try different");
			}
			else {
				u.getTable().put(u.getUserId(), u.getUserName());
				System.out.println("Your Insert success !!!");
			}
		}
		catch(InvalidUserId e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void update(UserBean u) throws UserExceptions {
		try {
			if (u.getTable().containsKey(u.getUserId())) {
				u.getTable().replace(u.getUserId(), u.getUserName());
				System.out.println("Update success !!!");
			}
			else {
				throw new UserIdNotFound("User Id not available. Try different");
			}
		}
		catch(UserIdNotFound e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void delete(UserBean u) throws UserExceptions {
		try {
			if (u.getTable().containsKey(u.getUserId())) {
				u.getTable().remove(u.getUserId());
				System.out.println("Delete success !!!");
			}
			else {
				throw new UserIdNotFound("User Id not available. Try different");
			}
		}
		catch(UserIdNotFound e) {
			System.out.println(e.toString());
		}
			
	}
	
	public void view(UserBean u) {
		System.out.println("View\n******\nS.No Id   Name");
		int count = 1;
		for(Map.Entry<Integer, String> e: u.getTable().entrySet()) {
			System.out.println(count + "    " + e.getKey() + "    " + e.getValue());
			count++;
		}
	}
	
	
	
	
	
	

}
