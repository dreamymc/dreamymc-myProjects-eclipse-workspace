class calculator_fast {

	private int answer;

	public void setAdd(int n1, int n2) {
		this.answer = n1 + n2;
	}

	public int getAdd() {
		return this.answer;
	}

	public void setSubtract(int n1, int n2) {
		this.answer = n1 - n2;
	}

	public int getSubtract() {
		return this.answer;
	}
	public void setMultiply(int n1, int n2) {
		this.answer = n1 * n2;
	}

	public int getMultiply() {
		return this.answer;
	}

	public void setDivide(int n1, int n2) {
		this.answer = n1 / n2;
	}

	public int getDivide() {
		return this.answer;
	}
}
