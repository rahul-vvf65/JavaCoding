package n2s.ehc.rahul;

import java.util.*;

public class UserMain {

	public static void main(String[] args) throws UserExceptions {
		UserBean u = new UserBean();
		UserOptions o = new UserOptions();
		Scanner sc = new Scanner(System.in);
		boolean finish = false;
		
		while(!finish) {
			System.out.println("Choose the option below\n***********************\n"
					+ "1 - Insert\n"
					+ "2 - Update\n"
					+ "3 - Delete\n"
					+ "4 - View\n"
					+ "5 - Exit\n"
					+ "Enter your option value:");
			u.setOption(sc.nextInt());
					
					  
					
			if (u.getOption() < 1 || u.getOption() > 5) {
				throw new InvalidEntry("Invalid Option Selected");
			}
			else {
				switch(u.getOption()) {
				case 1:
					boolean yes1 = true;
					while(yes1) {
						System.out.println("Insert\n********\nEnter UserId:");
						u.setUserId((Integer)sc.nextInt());
						System.out.println("Enter Name:");
						u.setUserName(sc.next());
						o.insert(u);
						System.out.println("Wish to Insert more (y/n):");
						String s = sc.next();
						if (s.equals("n")) {
							yes1 = false;
						}
					}
					break;
				case 2:
					boolean yes2 = true;
					while(yes2) {
						System.out.println("Update\n********\nEnter UserId:");
						u.setUserId(sc.nextInt());
						System.out.println("Enter Name:");
						u.setUserName(sc.next());
						o.update(u);
						System.out.println("Wish to Update more (y/n):");
						String s = sc.next();
						if (s.equals("n")) {
							yes2 = false;
						}
					}
					break;
				case 3:
					boolean yes3 = true;
					while(yes3) {
						System.out.println("Delete\n********\nEnter UserId:");
						u.setUserId((Integer)sc.nextInt());
						o.delete(u);
						System.out.println("Wish to Delete more (y/n):");
						String s = sc.next();
						if (s.equals("n")) {
							yes3 = false;
						}
					}
					break;
				case 4:
					o.view(u);
					break;
				case 5:
					System.out.println("Exit\n"
							+ "*****\n"
							+ "Ending the flow. Thank you!!!");
					finish = true;
					sc.close();
					break;
					
					
				}
			}
		}
		
		
		
		
	}

}
