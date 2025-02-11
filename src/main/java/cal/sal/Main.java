package cal.sal;

import cal.sal.factory.UserInputFactory;
import cal.sal.salarycalculator.SalaryCalculatorUtil;
import cal.sal.salarycalculator.SalaryResult;
import cal.sal.userInput.UserInput;
import cal.sal.utils.InputUtils;
import cal.sal.utils.PrintUtils;
import cal.sal.workschedule.MonthlyWorkSchedule;
import cal.sal.workschedule.WeeklyWorkSchedule;
import cal.sal.workschedule.WorkSchedulePrint;

public class Main {
	public static void main(String[] args) {

		PrintUtils.printBanner();

		while (true) {
			UserInput userInput = UserInputFactory.createUserInput();

			WeeklyWorkSchedule weeklyWorkSchedule = new WeeklyWorkSchedule();
			double weeklyHours = weeklyWorkSchedule.calculateWorkHours(userInput);

		MonthlyWorkSchedule monthlyWorkSchedule = new MonthlyWorkSchedule();
		double monthlyHours = monthlyWorkSchedule.calculateWorkHours(userInput);

		WorkSchedulePrint.printCalculationResult();
		WorkSchedulePrint.printTotalWeeklyHours(weeklyHours);
		WorkSchedulePrint.printTotalMonthlyHours(monthlyHours);
		WorkSchedulePrint.printSeparatorLine();

			SalaryResult salaryResult = SalaryCalculatorUtil.calculateSalaries(
				userInput);
			salaryResult.printSalaryDetails();

			PrintUtils.printLine();

			PrintUtils.printTryAgain();
			InputUtils.inputTryAgain();
		}
	}



}