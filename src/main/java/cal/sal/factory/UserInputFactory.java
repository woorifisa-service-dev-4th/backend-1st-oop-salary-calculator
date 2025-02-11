package cal.sal.factory;

import java.math.BigDecimal;

import cal.sal.userInput.UserInput;
import cal.sal.utils.InputUtils;
import cal.sal.utils.PrintUtils;

public class UserInputFactory {
	public static UserInput createUserInput() {
		PrintUtils.printHourlyWage();
		BigDecimal hourlyWage = InputUtils.InputHourlyWage();
		PrintUtils.printDailyWorkhours();
		double dailyWorkHours = InputUtils.InputDailyHours();
		PrintUtils.printWeeklyWorkdays();
		int weeklyWorkDays = InputUtils.InputWeeklyWorkDays();
		PrintUtils.printMonthlyOvertimeHours();
		double monthlyOvertimeHours = InputUtils.InputMonthlyOvertimeHours();

		return new UserInput(hourlyWage, dailyWorkHours, weeklyWorkDays, monthlyOvertimeHours);
	}
}