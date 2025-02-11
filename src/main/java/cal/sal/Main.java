package cal.sal;

import cal.sal.factory.UserInputFactory;
import cal.sal.salarycalculator.SalaryCalculatorUtil;
import cal.sal.salarycalculator.SalaryResult;
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

		System.out.println("======= 입력하신 정보를 기반으로 계산을 해보았습니다! ^^ =======");
		System.out.println("총 주간 근무 시간: " + weeklyHours + " 시간"); // TODO 리팩터링 예정

		MonthlyWorkSchedule monthlyWorkSchedule = new MonthlyWorkSchedule();
		double monthlyHours = monthlyWorkSchedule.calculateWorkHours(userInput);

		System.out.println("총 월간 근무 시간: " + monthlyHours + " 시간");

		System.out.println("======================================================");

		SalaryResult salaryResult = SalaryCalculatorUtil.calculateSalaries(
			userInput);
		salaryResult.printSalaryDetails();
	}

}