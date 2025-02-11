package cal.sal.salarycalculator;

import java.math.BigDecimal;

import cal.sal.userInput.UserInput;

public class SalaryCalculatorUtil {
	public static SalaryResult calculateSalaries(UserInput userInput) {
		// 기본 급여 계산기 객체 생성
		BasicSalaryCalculator basicSalaryCalculator = new BasicSalaryCalculator();
		OvertimeSalaryCalculator overtimeSalaryCalculator = new OvertimeSalaryCalculator();
		// 급여 계산
		BigDecimal dailySalary = basicSalaryCalculator.calculateDailySalary(userInput);
		BigDecimal weeklySalary = basicSalaryCalculator.calculateWeeklySalary(userInput);
		BigDecimal monthlySalary = weeklySalary.multiply(BigDecimal.valueOf(4)); // 월급 (초과 근무 제외)
		BigDecimal overtimeSalary = overtimeSalaryCalculator.calculateGrossSalary(userInput);
		BigDecimal totalSalaryBeforeTax = monthlySalary.add(overtimeSalary); // 초과 근무 포함 월급 (세전)
		BigDecimal totalSalaryAfterTax = totalSalaryBeforeTax.multiply(new BigDecimal("0.9")); // 세금 10% 공제 후 월급 (세후)
		BigDecimal netOvertimeSalary = overtimeSalaryCalculator.calculateNetSalary(overtimeSalary);
		BigDecimal netMonthlySalary = monthlySalary.multiply(new BigDecimal("0.9")); // 초과 근무 제외 월급 (세후)
		// SalaryResult 객체 생성하여 반환
		return new SalaryResult(dailySalary, weeklySalary, monthlySalary, overtimeSalary, netOvertimeSalary,
			totalSalaryBeforeTax, totalSalaryAfterTax, netMonthlySalary);
	}
}