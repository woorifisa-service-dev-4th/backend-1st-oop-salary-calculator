package SalaryCalculator;

import java.math.BigDecimal;

import cal.sal.UserInput.UserInput;

public interface ISalaryCalculator {
	BigDecimal calculateGrossSalary(UserInput userInput);

	BigDecimal calculateNetSalary(BigDecimal grossSalary);
}
