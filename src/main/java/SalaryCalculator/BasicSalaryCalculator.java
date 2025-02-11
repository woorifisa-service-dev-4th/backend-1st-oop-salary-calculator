package SalaryCalculator;

import java.math.BigDecimal;

import cal.sal.UserInput.UserInput;

public class BasicSalaryCalculator implements ISalaryCalculator {

	@Override
	public BigDecimal calculateGrossSalary(UserInput userInput) {
		BigDecimal totalHours = BigDecimal.valueOf(userInput.getDailyWorkHours())
			.multiply(BigDecimal.valueOf(userInput.getWeeklyWorkDays()))
			.multiply(BigDecimal.valueOf(4)); // 한 달 기준 (4주)
		return totalHours.multiply(userInput.getHourlyWage());
	}

	public BigDecimal calculateDailySalary(UserInput userInput) {
		return BigDecimal.valueOf(userInput.getDailyWorkHours())
			.multiply(userInput.getHourlyWage());
	}

	public BigDecimal calculateWeeklySalary(UserInput userInput) {
		return calculateDailySalary(userInput)
			.multiply(BigDecimal.valueOf(userInput.getWeeklyWorkDays()));
	}

	@Override
	public BigDecimal calculateNetSalary(BigDecimal grossSalary) {
		return grossSalary.multiply(new BigDecimal("0.9")); // 세금 10% 공제
	}
}
