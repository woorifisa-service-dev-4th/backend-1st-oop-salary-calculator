package cal.sal.salarycalculator;

import java.math.BigDecimal;

import cal.sal.userinput.UserInput;

public interface ISalaryCalculator {
	BigDecimal calculateGrossSalary(UserInput userInput);

	BigDecimal calculateNetSalary(BigDecimal grossSalary);
}
