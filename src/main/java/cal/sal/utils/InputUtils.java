package cal.sal.utils;

import java.math.BigDecimal;
import java.util.Scanner;

public class InputUtils {
	private static final Scanner scanner = new Scanner(System.in);

	public static BigDecimal InputBigDecimal() {
		BigDecimal value = scanner.nextBigDecimal();
		return value;
	}

	public static double InputDouble() {
		double value = scanner.nextDouble();
		return value;
	}

	public static int InputInt() {
		int value = scanner.nextInt();
		return value;
	}

	public static BigDecimal InputHourlyWage() {
		BigDecimal hourlyWage = InputBigDecimal();
		return hourlyWage;
	}

	public static double InputDailyHours() {
		double dailyWorkHours = InputDouble();
		return dailyWorkHours;
	}

	public static int InputWeeklyWorkDays() {
		int weeklyWorkDays = InputInt();
		return weeklyWorkDays;
	}

	public static double InputMonthlyOvertimeHours() {
		double monthlyOvertimeHours = InputDouble();
		return monthlyOvertimeHours;
	}

}
