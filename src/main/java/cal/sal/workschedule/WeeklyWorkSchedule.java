package cal.sal.workschedule;

import cal.sal.userinput.UserInput;

public class WeeklyWorkSchedule implements WorkSchedule {
	// 주간 근무 시간 계산
	// 받아올 값: 하루 근무 시간, 주간 근무 일수

	public double calculateWorkHours(UserInput userInput) {
		return userInput.getDailyWorkHours() * userInput.getWeeklyWorkDays();
	}
}
