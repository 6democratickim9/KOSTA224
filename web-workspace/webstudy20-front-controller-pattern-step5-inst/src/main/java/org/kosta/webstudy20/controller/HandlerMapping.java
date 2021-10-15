package org.kosta.webstudy20.controller;

/**
 * 컨트롤러 구현체 생성 전담 클래스 실제 컨트롤러 로직을 수행할 객체를 생성하는 클래스
 */
public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {
	}

	public static HandlerMapping getInstance() {
		return instance;
	}
	// update step5 version create method

	public Controller create(String command)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// get the information of the current package.
		// String packageName = this.getClass().getPackage().getName();
		// the command that the client sends is the actual controller classname, so add
		// to the package information
		// String classInfo = packageName+"."+command;
		String classInfo = new StringBuilder(this.getClass().getPackage().getName()).append(".").append(command)
				.toString();
		// create the obejct with ReflectionAPI
		Controller controller = (Controller) Class.forName(classInfo).newInstance();
		return controller;
		// step4 version create code
//		public Controller create(String command) {
//			Controller controller=null;					
//			if(command.equals("findCustomerById"))
//				controller=new FindCustomerByIdController();
//			else if(command.equals("registerCustomer"))
//				controller=new RegisterCustomerController();
//			else if(command.equals("updateCustomer"))
//				controller=new UpdateCustomerController();
//			return  controller;
//		}

	}
}
