package cal.sal.utils;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputUtils {
	private static final Scanner scanner = new Scanner(System.in);

	// BigDecimal 입력 처리 (예외 처리 추가)
	public static BigDecimal inputBigDecimal() {
		while (true) {
			try {

				return scanner.nextBigDecimal();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 ㅜ^ㅜ  숫자를 입력해주세요.");
				inputBigDecimal();
			}
		}
	}

	// double 입력 처리 (예외 처리 추가)
	public static double inputDouble() {
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
	public static int inputInt() {
		while (true) {
			try {

				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 ㅜ^ㅜ  정수를 입력해주세요.");
				scanner.next(); // 잘못된 입력값 제거
			}
		}
	}

	public static BigDecimal inputHourlyWage() {
		BigDecimal hourlyWage = inputBigDecimal();
		if (hourlyWage.compareTo(BigDecimal.ZERO) < 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  시급은 음수가 될 수 없습니다.");
			System.out.println("양수로 다시 입력해주세요.");
			inputHourlyWage();
		}
		return hourlyWage;
	}

	public static double inputDailyHours() {
		double dailyWorkHours = inputDouble();
		if (dailyWorkHours <= 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ 일한 시간이 0이거나 음수이면 계산할 수 없습니다. ");
			System.out.println("양수로 다시 입력해주세요.");
			inputDailyHours();
		}
		return dailyWorkHours;
	}

	public static int inputWeeklyWorkDays() {
		int weeklyWorkDays = inputInt();
		if (weeklyWorkDays > 7 || weeklyWorkDays <= 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  0시간 이하이면 계산할 수 없습니다. ");
			System.out.println("1 ~ 7까지 중 하나로 다시 작성해주세요.");
			inputWeeklyWorkDays();
		}
		return weeklyWorkDays;
	}

	public static double inputMonthlyOvertimeHours() {
		double monthlyOvertimeHours = inputDouble();
		if(monthlyOvertimeHours < 0) {
			System.out.println("잘못된 입력입니다 ㅜ^ㅜ  초과 근무시간은 음수가 될 수 없습니다.");
			System.out.println("양수로 다시 입력해주세요.");
			inputMonthlyOvertimeHours();
		}
		return monthlyOvertimeHours;
	}

	public static void inputTryAgain() {

		String tryAgain = scanner.next();
		if (tryAgain.equalsIgnoreCase("Y")) {
			return;
		} else if (tryAgain.equalsIgnoreCase("N")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		} else {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			inputTryAgain();
		}
	}

}
