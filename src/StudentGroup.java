import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students!=null)
			return students;
		else
		return null;
	}

	@Override
	public void setStudents(Student[] students)  
	    {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return students[index];
		}
	//return null;
	}

	@Override
	public void setStudent(Student student, int index)  {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		else{
			this.students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		Student stu=students[0];
        students[0]=student;
		Student stul;
		for(int i=1;i<students.length;i++)
		{
			stul=students[i];
			students[i]=stu;
			stu=stul;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==students[students.length-1]){
		students[i]=student;
		break;
		}
		}

}

	@Override
	public void add(Student student,int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=this.students.length)
			throw new IllegalArgumentException();
		Student stu=students[index];
		Student stu1;
		for(int i=index+1;i<students.length;i++)
		{
		stu1=students[i];
		students[i]=stu;
		stu=stu1;
		}

		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int j=index;j<students.length-1;j++)
		{
			students[j]=students[j+1];
		}

		
	}

	@Override
	public void remove(Student student)  {
		// Add your implementation here
		int count=0;
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int j=i;j<students.length-1;j++)
		{
			students[j]=students[j+1];
		}
		count++;
		break;
			
		}
		}
		if(count==0)
			throw new IllegalArgumentException("Student not exist");
	

		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		else{
			for(int i=index+1;i<students.length;i++)
			{
			students[i]=null;
			}
		}		
	}

	@Override
	public void removeFromElement(Student student)  {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int j=i+1;j<students.length;j++)
		{
			students[j]=null;
		}
		
		break;
			
		}
		}

	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int c=0;
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		for(int i=index+1;i<students.length;i++)
		{
		students[c++]=students[i];
		}
		for(int i=c;i<students.length;i++)
		{
		students[i]=null;
		}
		/*if(students[i]==student)
		{
		for(int j=i+1;j<students.length;j++)
		{
			students[j]=null;
		}
		
		break;
			
		}
		}*/

		
	}

	@Override
	public void removeToElement(Student student)  {
		// Add your implementation here
		int c=0;
		
		for(int i=0;i<students.length;i++)
		{
		if(students[i]==student)
		{
		for(int j=i+1;j<students.length;j++)
		{
			students[c++]=students[j];
		}
		
		break;
		}
		}
		for(int i=c;i<students.length;i++)
		{
		students[i]=null;
		}


	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student stu;
		for(int i=0;i<students.length-1;i++)
		{
		for(int j=0;j<students.length-i-1;j++)
		{
		if(students[j].compareTo(students[j+1])>0){
		stu=students[j];
		students[j]=students[j+1];
		students[j+1]=stu;
		}
		}
		}

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
