package cal.sal.factory;

import java.math.BigDecimal;

import cal.sal.userinput.UserInput;
import cal.sal.utils.InputUtils;

public class UserInputFactory {
	public static UserInput createUserInput() {
		BigDecimal hourlyWage = InputUtils.InputHourlyWage();
		double dailyWorkHours = InputUtils.InputDailyHours();
		int weeklyWorkDays = InputUtils.InputWeeklyWorkDays();
		double monthlyOvertimeHours = InputUtils.InputMonthlyOvertimeHours();

		return new UserInput(hourlyWage, dailyWorkHours, weeklyWorkDays, monthlyOvertimeHours);
	}
}