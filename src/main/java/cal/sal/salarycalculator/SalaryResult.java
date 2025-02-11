package cal.sal.salarycalculator;

import java.math.BigDecimal;

public class SalaryResult {
	private BigDecimal dailySalary;
	private BigDecimal weeklySalary;
	private BigDecimal monthlySalary;
	private BigDecimal overtimeSalary;
	private BigDecimal netOvertimeSalary;
	private BigDecimal totalSalaryBeforeTax;
	private BigDecimal totalSalaryAfterTax;
	private BigDecimal netMonthlySalary;

	public SalaryResult(BigDecimal dailySalary, BigDecimal weeklySalary, BigDecimal monthlySalary,
		BigDecimal overtimeSalary, BigDecimal netOvertimeSalary, BigDecimal totalSalaryBeforeTax,
		BigDecimal totalSalaryAfterTax, BigDecimal netMonthlySalary) {
		this.dailySalary = dailySalary;
		this.weeklySalary = weeklySalary;
		this.monthlySalary = monthlySalary;
		this.overtimeSalary = overtimeSalary;
		this.netOvertimeSalary = netOvertimeSalary;
		this.totalSalaryBeforeTax = totalSalaryBeforeTax;
		this.totalSalaryAfterTax = totalSalaryAfterTax;
		this.netMonthlySalary = netMonthlySalary;
	}

	public BigDecimal getDailySalary() {
		return dailySalary;
	}

	public BigDecimal getWeeklySalary() {
		return weeklySalary;
	}

	public BigDecimal getMonthlySalary() {
		return monthlySalary;
	}

	public BigDecimal getOvertimeSalary() {
		return overtimeSalary;
	}

	public BigDecimal getNetOvertimeSalary() {
		return netOvertimeSalary;
	}

	public BigDecimal getTotalSalaryBeforeTax() {
		return totalSalaryBeforeTax;
	}

	public BigDecimal getTotalSalaryAfterTax() {
		return totalSalaryAfterTax;
	}

	public BigDecimal getNetMonthlySalary() {
		return netMonthlySalary;
	}

	public void printSalaryDetails() {
		System.out.println();
		System.out.println("당신의 월급은??????");
		System.out.println("두구두구두구두구!!!!");

		System.out.println();
		System.out.println("===================  급여 계산 결과 ===================");

		System.out.println("일급: " + dailySalary + " 원");
		System.out.println("주급: " + weeklySalary + " 원");
		//System.out.println("월급 (초과 근무 제외, 세전): " + monthlySalary + " 원");
		//System.out.println("월급 (초과 근무 제외, 세후): " + netMonthlySalary + " 원");
		//System.out.println("초과 근무 수당 (세전): " + overtimeSalary + " 원");
		//System.out.println("초과 근무 수당 (세후): " + netOvertimeSalary + " 원");
		System.out.println();
		System.out.println("월급 (초과 근무 포함, 세전): " + totalSalaryBeforeTax + " 원");
		System.out.println("월급 (초과 근무 포함, 세후): " + totalSalaryAfterTax + " 원");
	}
}