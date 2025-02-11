package cal.sal.utils;

import java.math.BigDecimal;

public class PrintUtils {
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

	public static void printOutputTotalSalary(BigDecimal calculatedSalary) {
		print(OUTPUT_TOTAL_SALARY);
	}
}
