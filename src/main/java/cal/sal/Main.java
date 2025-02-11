package cal.sal;

import cal.sal.factory.UserInputFactory;
import cal.sal.userInput.UserInput;
import cal.sal.utils.PrintUtils;
import cal.sal.workschedule.MonthlyWorkSchedule;
import cal.sal.workschedule.WeeklyWorkSchedule;

public class Main {
	public static void main(String[] args) {

		PrintUtils.printBanner();

		UserInput userInput = UserInputFactory.createUserInput();

		WeeklyWorkSchedule weeklyWorkSchedule = new WeeklyWorkSchedule();
		double weeklyHours = weeklyWorkSchedule.calculateWorkHours(userInput);

		System.out.println("총 주간 근무 시간: " + weeklyHours + " 시간");

		MonthlyWorkSchedule monthlyWorkSchedule = new MonthlyWorkSchedule();
		double monthlyHours = monthlyWorkSchedule.calculateWorkHours(userInput);

		System.out.println("총 월간 근무 시간: " + monthlyHours + " 시간");
	}

}