package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person {


		private int facultyNumber;
		public Faculty(){
			super();        
			facultyNumber = 0;//Indicating no number yet    
		}

		public Faculty(String initialName, int initialFacultyNumber){
			super(initialName);        
			facultyNumber = initialFacultyNumber;    
		}

		public void reset(String newName, int newFacultyNumber) {
			setName(newName);        
			facultyNumber = newFacultyNumber;
		}

		public int getFacultyNumber() {
			return facultyNumber;
		}

		public void setFacultyNumber(int newFacultyNumber) {
			facultyNumber = newFacultyNumber;
		}

		public boolean equals(Faculty otherFaculty) {
			return this.hasSameName(otherFaculty) && (this.facultyNumber == otherFaculty.facultyNumber);
		} 

	}

