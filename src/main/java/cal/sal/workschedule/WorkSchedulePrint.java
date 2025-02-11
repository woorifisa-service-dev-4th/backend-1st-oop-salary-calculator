package cal.sal.workschedule;

public class WorkSchedulePrint {
	private static final String PRINT_CALCULATION_RESULT = "======= 입력하신 정보를 기반으로 계산을 해보았습니다! ^^ =======";
	private static final String PRINT_TOTAL_WEEKLY_HOURS = "총 주간 근무 시간: ";
	private static final String PRINT_TOTAL_MONTHLY_HOURS = "총 월간 근무 시간: ";
	private static final String PRINT_HOUR = "시간";
	private static final String SEPARATOR_LINE = "======================================================";

	public static void print(String message) {
		System.out.println(message);
	}

	public static void printCalculationResult() {
		print(PRINT_CALCULATION_RESULT);
	}

	public static void printTotalWeeklyHours(double weeklyHours) {
		print(PRINT_TOTAL_WEEKLY_HOURS + weeklyHours + PRINT_HOUR);
	}

	public static void printTotalMonthlyHours(double monthlyHours) {
		print(PRINT_TOTAL_MONTHLY_HOURS + monthlyHours + PRINT_HOUR);
	}

	public static void printSeparatorLine() {
		print(SEPARATOR_LINE);
	}

}
