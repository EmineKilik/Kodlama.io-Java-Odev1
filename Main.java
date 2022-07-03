package odev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.courseId = 1;
		course1.courseName = "Java";
		course1.courseDetail = "4 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		
		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "C#";
		course2.courseDetail = "3 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		
		Course course3 = new Course();
		course3.courseId = 3;
		course3.courseName = "JavaScript";
		course3.courseDetail = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		
		Course[] courses = new Course[] {course1, course2, course3};
		for (Course course : courses) {
			System.out.println("Kurs : " + course.courseName);
		}
		
		
		Instructor instructor1 = new Instructor();
		instructor1.instructorId = 1;
		instructor1.instructorName = "Engin Demiro�";
		
		Instructor instructor2 = new Instructor();
		instructor2.instructorId = 2;
		instructor2.instructorName = "Emine Kilik";
		
		Instructor instructor3 = new Instructor();
		instructor3.instructorId = 3;
		instructor3.instructorName = "Halife Turan";
		
		Instructor[] instructors = new Instructor[] {instructor1, instructor2,instructor3};
		for (Instructor instructor : instructors) {
			System.out.println("E�itmen : " + instructor.instructorName);
		}
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course3);
		
		
	}

}
