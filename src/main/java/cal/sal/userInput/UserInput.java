package cal.sal.userInput;

import java.math.BigDecimal;

public class UserInput {
	BigDecimal hourlyWage; // 시급
	double dailyWorkHours; // 일일 근무시간
	int weeklyWorkDays; // 일주 근무일수
	double monthlyOvertimeHours; // 월 연장 근무 시간

	public UserInput(BigDecimal hourlyWage, double dailyWorkHours, int weeklyWorkDays, double monthlyOvertimeHours) {
		this.hourlyWage = hourlyWage;
		this.dailyWorkHours = dailyWorkHours;
		this.weeklyWorkDays = weeklyWorkDays;
		this.monthlyOvertimeHours = monthlyOvertimeHours;
	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public double getDailyWorkHours() {
		return dailyWorkHours;
	}

	public int getWeeklyWorkDays() {
		return weeklyWorkDays;
	}

	public double getMonthlyOvertimeHours() {
		return monthlyOvertimeHours;
	}

}
