package cal.sal.factory;

import java.math.BigDecimal;

import cal.sal.userInput.UserInput;
import cal.sal.utils.InputUtils;
import cal.sal.utils.PrintUtils;

public class UserInputFactory {
	public static UserInput createUserInput() {
		PrintUtils.printHourlyWage();
		BigDecimal hourlyWage = InputUtils.inputHourlyWage();
		PrintUtils.printDailyWorkhours();
		double dailyWorkHours = InputUtils.inputDailyHours();
		PrintUtils.printWeeklyWorkdays();
		int weeklyWorkDays = InputUtils.inputWeeklyWorkDays();
		PrintUtils.printMonthlyOvertimeHours();
		double monthlyOvertimeHours = InputUtils.inputMonthlyOvertimeHours();

		return new UserInput(hourlyWage, dailyWorkHours, weeklyWorkDays, monthlyOvertimeHours);
	}
}