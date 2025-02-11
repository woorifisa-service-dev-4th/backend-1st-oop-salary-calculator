package cal.sal;

import java.math.BigDecimal;

public class UserInput {
	BigDecimal hourlyWage; // 시급
	int dailyWorkHours; // 일일 근무시간
	int weeklyWorkDays; // 일주 근무일수
	int monthlyOvertimeHours; // 월 연장 근무 시간

	public UserInput(BigDecimal hourlyWage, int dailyWorkHours, int weeklyWorkDays, int monthlyOvertimeHours) {
		this.hourlyWage = hourlyWage;
		this.dailyWorkHours = dailyWorkHours;
		this.weeklyWorkDays = weeklyWorkDays;
		this.monthlyOvertimeHours = monthlyOvertimeHours;
	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public int getDailyWorkHours() {
		return dailyWorkHours;
	}

	public int getWeeklyWorkDays() {
		return weeklyWorkDays;
	}

	public int getMonthlyOvertimeHours() {
		return monthlyOvertimeHours;
	}

}
