package cal.sal.utils;

import java.math.BigDecimal;

public class PrintUtils {
	private static final String PRINT_HOURLY_WAGE = "당신의 시급은?";
	private static final String PRINT_DAILY_WORKHOURS = "일일 근무 시간은?";
	private static final String PRINT_WEEKLY_WORKDAYS = "일주 근무 일수는?";
	private static final String PRINT_MONTHLY_OVERTIME_HOURS = "월 연장 근무 시간은?";
	private static final String OUTPUT_TOTAL_SALARY = "당신의 월급은";
	private static final String BANNER =

		"███████╗ █████╗ ██╗      █████╗ ██████╗ ██╗   ██╗     ██████╗ █████╗ ██╗      ██████╗██╗   ██╗██╗      █████╗ ████████╗ ██████╗ ██████╗ \n"
			+
			"██╔════╝██╔══██╗██║     ██╔══██╗██╔══██╗╚██╗ ██╔╝    ██╔════╝██╔══██╗██║     ██╔════╝██║   ██║██║     ██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗ \n"
			+
			"███████╗███████║██║     ███████║██████╔╝ ╚████╔╝     ██║     ███████║██║     ██║     ██║   ██║██║     ███████║   ██║   ██║   ██║██████╔╝ \n"
			+
			"╚════██║██╔══██║██║     ██╔══██║██╔══██╗  ╚██╔╝      ██║     ██╔══██║██║     ██║     ██║   ██║██║     ██╔══██║   ██║   ██║   ██║██╔══██╗ \n"
			+
			"███████║██║  ██║███████╗██║  ██║██║  ██║   ██║       ╚██████╗██║  ██║███████╗╚██████╗╚██████╔╝███████╗██║  ██║   ██║   ╚██████╔╝██║  ██║ \n"
			+
			"╚══════╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝        ╚═════╝╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝ \n";

	public static void print(String message) {
		System.out.println(message);
	}

	public static void printBanner() {
		print(BANNER);
	}

	public static void printHourlyWage() {
		print(PRINT_HOURLY_WAGE);
	}

	public static void printDailyWorkhours() {
		print(PRINT_DAILY_WORKHOURS);
	}

	public static void printWeeklyWorkdays() {
		print(PRINT_WEEKLY_WORKDAYS);
	}

	public static void printMonthlyOvertimeHours() {
		print(PRINT_MONTHLY_OVERTIME_HOURS);
	}

	public static void printOutputTotalSalary(BigDecimal calculatedSalary) {
		print(OUTPUT_TOTAL_SALARY);
	}
}
