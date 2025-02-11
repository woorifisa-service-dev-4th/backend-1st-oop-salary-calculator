package cal.sal.salarycalculator;

import java.math.BigDecimal;

import cal.sal.userinput.UserInput;

public class OvertimeSalaryCalculator implements ISalaryCalculator {

	private static final BigDecimal OVERTIME_RATE = new BigDecimal("1.5");

	@Override
	public BigDecimal calculateGrossSalary(UserInput userInput) {
		return BigDecimal.valueOf(userInput.getMonthlyOvertimeHours())  //월별 초과 근무시간
			.multiply(userInput.getHourlyWage())  // 시급
			.multiply(OVERTIME_RATE);   // 초과 근무 배율
	}

	@Override
	public BigDecimal calculateNetSalary(BigDecimal grossSalary) {
		return grossSalary.multiply(new BigDecimal("0.9")); // 세금 10% 공제
	}
}
