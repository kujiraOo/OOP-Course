package assignment3;

public class Person {
	String name;
	double height, weight;

	Person() {
		name = "unknown";
	}

	Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	Person(Person p){
		name = p.name;
		height = p.height;
		weight = p.weight;
	}

	double calcBMI() {
		return weight / (height * height);
	}

	String identify() {
		
		double BMI = calcBMI();
		
		if (BMI < 20.0)
			return "underweight";
		else if (20.0 <= BMI && BMI < 25.0)
			return "normal weight";
		else if (25.0 <= BMI && BMI < 30.0)
			return "slightly overweight";
		else if (30.0 <= BMI && BMI < 40.0)
			return "significantly overweight";
		else
			return "obesity";
	}

	public String toString() {
		return "name: " + name + "\nheight: " + height + "m\nweight: " + weight
				+ "\nBMI: " + calcBMI() + "\nbody shape: " + identify();
	}
	
	
	public boolean isInHeightLimit(double heightLimit){
		if (height <= heightLimit)
			return true;
		else
			return false;
	}
	
	public boolean compareTo(Person p){
		return weight > p.weight && height > p.height;
	}
	
	public boolean compareTo(double weight, double height ){
		return this.weight > weight && this.height > height; 
	}
	
	public Person getHeavierPerson(Person p){
		if (weight >= p.weight)
			return this;
		else
			return p;
	}
}
