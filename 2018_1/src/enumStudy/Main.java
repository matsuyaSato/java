package enumStudy;

public class Main {
	public static void main(String[] args) {
		Task task = new Task(TaskType.PRIVATE, "buy milk");
		TaskType type= task.getType();

		HttpStatus hs = HttpStatus.OK;
		System.out.println("HTTPSTATUS = " + hs + "[" + hs.getValue() + "]");

		System.out.println(TaskType.PRIVATE.equals(type));

		switch(type) {
		case PRIVATE:
			System.out.println("task[ type = " + type + " ]");
			break;
		case WORK:
			System.out.println("task[ type = " + type + " ]");
		}
	}
}
