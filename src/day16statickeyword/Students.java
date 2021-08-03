package day16statickeyword;

public class Students {
	
	String name;
	static String id; //  Unique oldugu icin static yaptik 
	int grade;
	int registrationYear;
	static int counter = 1000;
	
	public void setId() {		//herkese ozel id vermesi icin setID
		counter++;//uste yazdik cunku her bir degisimde artsin diye
		id = "" + registrationYear + grade + counter;		// id string oldugu icin "" string yazdik basa yoksda hata vercek
	}

	public Students(String name, int grade, int registrationYear) { // source damn isaretleyip cektik super i sildik
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId(); // her seferinde yukardaki constructor i yazmamak icin kisaca setId(); buraya aldik
	}

}