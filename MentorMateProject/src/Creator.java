
public class Creator {

	public void createDoubleM(Integer n, int rows) {

		for (int i = 1; i <= rows; i++) {

			for (int j = n; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}
			for (int j = n; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= n; k++) {

				System.out.print("*");
			}

			System.out.println();

		}

	}

}
