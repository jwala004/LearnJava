package collection.map;

		class Student {
	
		int StdId;
		String Name;
		String RollNo;
		public Student(int stdId, String name, String rollNo) {
			
			this.StdId = stdId;
			this.Name = name;
			this.RollNo = rollNo;
		}
		public String toString() {
			return StdId+ " " +Name+ " "+ RollNo;
		}		
    }

