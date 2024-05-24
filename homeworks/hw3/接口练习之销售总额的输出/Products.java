package hw3_2;

class Television implements UnitPrice {
    private double price;

    public Television(double price) {
        this.price = price;
    }

	@Override
	public double unitprice() {
		return price;
	}
}

class Computer implements UnitPrice {
    private double price;

    public Computer(double price) {
        this.price = price;
    }

	@Override
	public double unitprice() {
		return price;
	}
}

class Phone implements UnitPrice {
    private double price;

    public Phone(double price) {
        this.price = price;
    }

	@Override
	public double unitprice() {
		return price;
	}
}