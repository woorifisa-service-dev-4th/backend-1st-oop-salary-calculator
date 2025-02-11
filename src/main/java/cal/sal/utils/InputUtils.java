package cal.sal.utils;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputUtils {
	private static final Scanner scanner = new Scanner(System.in);

	// BigDecimal 입력 처리 (예외 처리 추가)
	public static BigDecimal InputBigDecimal() {
		while (true) {
			try {

				return scanner.nextBigDecimal();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 ㅜ^ㅜ  숫자를 입력해주세요.");
				scanner.next(); // 잘못된 입력값 제거
			}
		}
	}

	// double 입력 처리 (예외 처리 추가)
	public static double InputDouble() {
		while (true) {
			try {

				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 ㅜ^ㅜ  숫자를 입력해주세요.");
				scanner.next(); // 잘못된 입력값 제거
			}
		}
	}

	// int 입력 처리 (예외 처리 추가)
	public static int InputInt() {
		while (true) {
			try {

				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 ㅜ^ㅜ  정수를 입력해주세요.");
				scanner.next(); // 잘못된 입력값 제거
			}
		}
	}

	public static BigDecimal InputHourlyWage() {
		BigDecimal hourlyWage = InputBigDecimal();
		if (hourlyWage.compareTo(BigDecimal.ZERO) < 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  시급은 음수가 될 수 없습니다.");
			System.out.println("양수로 다시 입력해주세요.");
			InputBigDecimal();
		}
		return hourlyWage;
	}

	public static double InputDailyHours() {
		double dailyWorkHours = InputDouble();
		if (dailyWorkHours <= 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ 일한 시간이 0이거나 음수이면 계산할 수 없습니다. ");
			System.out.println("양수로 다시 입력해주세요.");
			InputDouble();
		}
		return dailyWorkHours;
	}

	public static int InputWeeklyWorkDays() {
		int weeklyWorkDays = InputInt();
		if (weeklyWorkDays > 7 || weeklyWorkDays <= 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  0시간 이하이면 계산할 수 없습니다. ");
			System.out.println("1 ~ 7까지 중 하나로 다시 작성해주세요.");
			InputInt(); // 잘못된 입력값 제거
		}
		return weeklyWorkDays;
	}

	public static double InputMonthlyOvertimeHours() {
		double monthlyOvertimeHours = InputDouble();
		if(monthlyOvertimeHours < 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  초과 근무시간은 음수가 될 수 없습니다.");
			System.out.println("양수로 다시 입력해주세요.");
			InputDouble();
		}
		return monthlyOvertimeHours;
	}

}
