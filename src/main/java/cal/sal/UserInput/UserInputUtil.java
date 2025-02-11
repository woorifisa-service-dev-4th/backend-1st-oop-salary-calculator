package cal.sal.UserInput;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInputUtil {
	private static final Scanner scanner = new Scanner(System.in);

	public static UserInput getUserInput() {
		System.out.println("시급을 입력해주세요 : ");
		BigDecimal hourlyWage = scanner.nextBigDecimal();

		System.out.println("일일 근무 시간을 입력해주세요 : ");
		int dailyWorkHours = scanner.nextInt();

		System.out.println("일주 근무 일수를 입력해주세요 : ");
		int weeklyWorkDays = scanner.nextInt();

		System.out.println("월 연장 근무 시간을 입력해주세요 : ");
		int monthlyOvertimeHours = scanner.nextInt();

		return new UserInput(hourlyWage, dailyWorkHours, weeklyWorkDays, monthlyOvertimeHours);
	}

}
