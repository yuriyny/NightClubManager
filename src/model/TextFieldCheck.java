package model;

public class TextFieldCheck {

	public static void checkZip(String z) throws MyException {
		int i;
		if (z.length() == 0) {
			throw new MyException("Zip Field is Empty!");
		} else {
			for (i = 0; i < z.length(); i++) {
				if (!Character.isDigit(z.charAt(i)) || z.length() != 5) {
					throw new MyException("Wrong Zip Format!");
				}
			}

		}

	}

	public static void checkfName(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("First Name Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i))) {
					throw new MyException("First Name Should be Consisted of Letters Only!");
				}
			}
		}
	}
	
	public static void checklName(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Last Name Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i))) {
					throw new MyException("Last Name Should be Consisted of Letters Only!");
				}
			}
		}
	}
	public static void checkPhone(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Phone Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					throw new MyException("Phone Should be Consisted of Digits Only!");
				}
			}
		}
	}
	
	public static void checkCity(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("City Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i))) {
					throw new MyException("City Should be Consisted of Letters Only!");
				}
			}
		}
	}
	
	public static void checkSNumber(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Street Number Field is Empty!");
		} 
	}
	public static void checkSName(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Street Name Field is Empty!");
		} 
	}
	
	public static void checkLoginOwnerInfo(PeopleBag pBag, String s, Owner o) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Login Field is Empty!");
		} else if(pBag.findLogin(s) != null && !o.getLogin().equals(s) ){
			throw new MyException("Login Already Exists!");
		}
		
	}
	public static void checkLoginManInfo(PeopleBag pBag, String s, Manager o) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Login Field is Empty!");
		} else if(pBag.findLogin(s) != null && !o.getLogin().equals(s) ){
			throw new MyException("Login Already Exists!");
		}
		
	}
	public static void checkLoginCusInfo(PeopleBag pBag, String s, Custumer c) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Login Field is Empty!");
		} else if(pBag.findLogin(s) != null && !c.getLogin().equals(s) ){
			throw new MyException("Login Already Exists!");
		}
		
	}
	
	public static void checkLoginReg(PeopleBag pBag, String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Login Field is Empty!");
		} else if(pBag.findLogin(s) != null){
			throw new MyException("Login Already Exists!");
		}
		
	}
	
	public static void checkPassword(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Password Field is Empty!");
		} 
	}
	
	public static void checkName(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Name Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isLetter(s.charAt(i))) {
					throw new MyException("Name Should be Consisted of Letters Only!");
				}
			}
		}
	}
	
	public static void checkEmail(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Email Field is Empty!");
		} 
	}
	public static void checkPrice(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Price Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					throw new MyException("Price Should be Consisted of Digits Only!");
				}
			}
		}
	}
	
	public static void checkSalary(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Salary Field is Empty!");
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))) {
					throw new MyException("Salary Should be Consisted of Digits Only!");
				}
			}
		}
	}
	
	public static void checkEmpty(String s) throws MyException {

		if (s.length() == 0) {
			throw new MyException("Some Fields are Empty!");
		} 
	}
	public static void checkDigit(String z) throws MyException {
		int i;
		if (z.length() == 0) {
			throw new MyException("Some Fields are Empty!");
		} else {
			for (i = 0; i < z.length(); i++) {
				if (!Character.isDigit(z.charAt(i)) ) {
					throw new MyException("Wrong Digit Format!");
				}
			}

		}

	}
}
